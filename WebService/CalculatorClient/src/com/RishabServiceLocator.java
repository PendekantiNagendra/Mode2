/**
 * RishabServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public class RishabServiceLocator extends org.apache.axis.client.Service implements com.RishabService {

    public RishabServiceLocator() {
    }


    public RishabServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RishabServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Rishab
    private java.lang.String Rishab_address = "http://192.168.1.118:8086/SapService/services/Rishab";

    public java.lang.String getRishabAddress() {
        return Rishab_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RishabWSDDServiceName = "Rishab";

    public java.lang.String getRishabWSDDServiceName() {
        return RishabWSDDServiceName;
    }

    public void setRishabWSDDServiceName(java.lang.String name) {
        RishabWSDDServiceName = name;
    }

    public com.Rishab getRishab() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Rishab_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRishab(endpoint);
    }

    public com.Rishab getRishab(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.RishabSoapBindingStub _stub = new com.RishabSoapBindingStub(portAddress, this);
            _stub.setPortName(getRishabWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRishabEndpointAddress(java.lang.String address) {
        Rishab_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.Rishab.class.isAssignableFrom(serviceEndpointInterface)) {
                com.RishabSoapBindingStub _stub = new com.RishabSoapBindingStub(new java.net.URL(Rishab_address), this);
                _stub.setPortName(getRishabWSDDServiceName());
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
        if ("Rishab".equals(inputPortName)) {
            return getRishab();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://com", "RishabService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://com", "Rishab"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Rishab".equals(portName)) {
            setRishabEndpointAddress(address);
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
