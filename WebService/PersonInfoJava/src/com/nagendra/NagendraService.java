/**
 * NagendraService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nagendra;

public interface NagendraService extends javax.xml.rpc.Service {
    public java.lang.String getNagendraAddress();

    public com.nagendra.Nagendra getNagendra() throws javax.xml.rpc.ServiceException;

    public com.nagendra.Nagendra getNagendra(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
