/**
 * RishabKumarServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rishabkumar;

public class RishabKumarServiceLocator extends org.apache.axis.client.Service implements com.rishabkumar.RishabKumarService {

    public RishabKumarServiceLocator() {
    }


    public RishabKumarServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RishabKumarServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RishabKumar
    private java.lang.String RishabKumar_address = "http://192.168.1.118:8086/PersonInfo/services/RishabKumar";

    public java.lang.String getRishabKumarAddress() {
        return RishabKumar_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RishabKumarWSDDServiceName = "RishabKumar";

    public java.lang.String getRishabKumarWSDDServiceName() {
        return RishabKumarWSDDServiceName;
    }

    public void setRishabKumarWSDDServiceName(java.lang.String name) {
        RishabKumarWSDDServiceName = name;
    }

    public com.rishabkumar.RishabKumar getRishabKumar() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RishabKumar_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRishabKumar(endpoint);
    }

    public com.rishabkumar.RishabKumar getRishabKumar(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.rishabkumar.RishabKumarSoapBindingStub _stub = new com.rishabkumar.RishabKumarSoapBindingStub(portAddress, this);
            _stub.setPortName(getRishabKumarWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRishabKumarEndpointAddress(java.lang.String address) {
        RishabKumar_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.rishabkumar.RishabKumar.class.isAssignableFrom(serviceEndpointInterface)) {
                com.rishabkumar.RishabKumarSoapBindingStub _stub = new com.rishabkumar.RishabKumarSoapBindingStub(new java.net.URL(RishabKumar_address), this);
                _stub.setPortName(getRishabKumarWSDDServiceName());
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
        if ("RishabKumar".equals(inputPortName)) {
            return getRishabKumar();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://rishabkumar.com", "RishabKumarService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://rishabkumar.com", "RishabKumar"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RishabKumar".equals(portName)) {
            setRishabKumarEndpointAddress(address);
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
