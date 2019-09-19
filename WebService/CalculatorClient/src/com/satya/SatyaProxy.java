package com.satya;

public class SatyaProxy implements com.satya.Satya {
  private String _endpoint = null;
  private com.satya.Satya satya = null;
  
  public SatyaProxy() {
    _initSatyaProxy();
  }
  
  public SatyaProxy(String endpoint) {
    _endpoint = endpoint;
    _initSatyaProxy();
  }
  
  private void _initSatyaProxy() {
    try {
      satya = (new com.satya.SatyaServiceLocator()).getSatya();
      if (satya != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)satya)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)satya)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (satya != null)
      ((javax.xml.rpc.Stub)satya)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.satya.Satya getSatya() {
    if (satya == null)
      _initSatyaProxy();
    return satya;
  }
  
  public int getSap() throws java.rmi.RemoteException{
    if (satya == null)
      _initSatyaProxy();
    return satya.getSap();
  }
  
  
}