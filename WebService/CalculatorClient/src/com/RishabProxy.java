package com;

public class RishabProxy implements com.Rishab {
  private String _endpoint = null;
  private com.Rishab rishab = null;
  
  public RishabProxy() {
    _initRishabProxy();
  }
  
  public RishabProxy(String endpoint) {
    _endpoint = endpoint;
    _initRishabProxy();
  }
  
  private void _initRishabProxy() {
    try {
      rishab = (new com.RishabServiceLocator()).getRishab();
      if (rishab != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)rishab)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)rishab)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (rishab != null)
      ((javax.xml.rpc.Stub)rishab)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.Rishab getRishab() {
    if (rishab == null)
      _initRishabProxy();
    return rishab;
  }
  
  public int getSap() throws java.rmi.RemoteException{
    if (rishab == null)
      _initRishabProxy();
    return rishab.getSap();
  }
  
  
}