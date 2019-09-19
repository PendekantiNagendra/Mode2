package com.rishabkumar;

public class RishabKumarProxy implements com.rishabkumar.RishabKumar {
  private String _endpoint = null;
  private com.rishabkumar.RishabKumar rishabKumar = null;
  
  public RishabKumarProxy() {
    _initRishabKumarProxy();
  }
  
  public RishabKumarProxy(String endpoint) {
    _endpoint = endpoint;
    _initRishabKumarProxy();
  }
  
  private void _initRishabKumarProxy() {
    try {
      rishabKumar = (new com.rishabkumar.RishabKumarServiceLocator()).getRishabKumar();
      if (rishabKumar != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)rishabKumar)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)rishabKumar)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (rishabKumar != null)
      ((javax.xml.rpc.Stub)rishabKumar)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.rishabkumar.RishabKumar getRishabKumar() {
    if (rishabKumar == null)
      _initRishabKumarProxy();
    return rishabKumar;
  }
  
  public java.lang.String getRishab() throws java.rmi.RemoteException{
    if (rishabKumar == null)
      _initRishabKumarProxy();
    return rishabKumar.getRishab();
  }
  
  
}