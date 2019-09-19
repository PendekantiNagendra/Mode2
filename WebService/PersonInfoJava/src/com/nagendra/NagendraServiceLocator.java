/**
 * NagendraServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nagendra;

public class NagendraServiceLocator extends org.apache.axis.client.Service implements com.nagendra.NagendraService {

    public NagendraServiceLocator() {
    }


    public NagendraServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NagendraServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Nagendra
    private java.lang.String Nagendra_address = "http://localhost:8086/PersonInfo/services/Nagendra";

    public java.lang.String getNagendraAddress() {
        return Nagendra_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NagendraWSDDServiceName = "Nagendra";

    public java.lang.String getNagendraWSDDServiceName() {
        return NagendraWSDDServiceName;
    }

    public void setNagendraWSDDServiceName(java.lang.String name) {
        NagendraWSDDServiceName = name;
    }

    public com.nagendra.Nagendra getNagendra() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Nagendra_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNagendra(endpoint);
    }

    public com.nagendra.Nagendra getNagendra(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.nagendra.NagendraSoapBindingStub _stub = new com.nagendra.NagendraSoapBindingStub(portAddress, this);
            _stub.setPortName(getNagendraWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNagendraEndpointAddress(java.lang.String address) {
        Nagendra_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.nagendra.Nagendra.class.isAssignableFrom(serviceEndpointInterface)) {
                com.nagendra.NagendraSoapBindingStub _stub = new com.nagendra.NagendraSoapBindingStub(new java.net.URL(Nagendra_address), this);
                _stub.setPortName(getNagendraWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Nagendra".equals(inputPortName)) {
            return getNagendra();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://nagendra.com", "NagendraService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://nagendra.com", "Nagendra"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Nagendra".equals(portName)) {
            setNagendraEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
