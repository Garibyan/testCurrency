/**
 * Converter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.currency.wsdl.currency;

public interface Converter extends javax.xml.rpc.Service {
    public java.lang.String getConverterSoapAddress();

    public com.currency.wsdl.currency.ConverterSoap_PortType getConverterSoap() throws javax.xml.rpc.ServiceException;

    public com.currency.wsdl.currency.ConverterSoap_PortType getConverterSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getConverterSoap12Address();

    public com.currency.wsdl.currency.ConverterSoap_PortType getConverterSoap12() throws javax.xml.rpc.ServiceException;

    public com.currency.wsdl.currency.ConverterSoap_PortType getConverterSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
