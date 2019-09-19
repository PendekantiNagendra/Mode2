/**
 * SatyaService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.satya;

public interface SatyaService extends javax.xml.rpc.Service {
    public java.lang.String getSatyaAddress();

    public com.satya.Satya getSatya() throws javax.xml.rpc.ServiceException;

    public com.satya.Satya getSatya(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
