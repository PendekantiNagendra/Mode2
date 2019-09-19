package com.nagendra;

public class NagendraProxy implements com.nagendra.Nagendra {
  private String _endpoint = null;
  private com.nagendra.Nagendra nagendra = null;
  
  public NagendraProxy() {
    _initNagendraProxy();
  }
  
  public NagendraProxy(String endpoint) {
    _endpoint = endpoint;
    _initNagendraProxy();
  }
  
  private void _initNagendraProxy() {
    try {
      nagendra = (new com.nagendra.NagendraServiceLocator()).getNagendra();
      if (nagendra != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)nagendra)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)nagendra)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (nagendra != null)
      ((javax.xml.rpc.Stub)nagendra)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.nagendra.Nagendra getNagendra() {
    if (nagendra == null)
      _initNagendraProxy();
    return nagendra;
  }
  
  public java.lang.String getName() throws java.rmi.RemoteException{
    if (nagendra == null)
      _initNagendraProxy();
    return nagendra.getName();
  }
  
  
}