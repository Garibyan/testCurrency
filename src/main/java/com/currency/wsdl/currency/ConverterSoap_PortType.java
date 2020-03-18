/**
 * ConverterSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.currency.wsdl.currency;

public interface ConverterSoap_PortType extends java.rmi.Remote {
    public com.currency.wsdl.currency.ArrayOfString getCurrencies() throws java.rmi.RemoteException;
    public java.math.BigDecimal getCurrencyRate(java.lang.String currency, java.util.Calendar rateDate) throws java.rmi.RemoteException;
    public com.currency.wsdl.currency.GetCurrencyRatesResponseGetCurrencyRatesResult getCurrencyRates(java.util.Calendar rateDate) throws java.rmi.RemoteException;
    public java.math.BigDecimal getConversionRate(java.lang.String currencyFrom, java.lang.String currencyTo, java.util.Calendar rateDate) throws java.rmi.RemoteException;
    public java.math.BigDecimal getConversionAmount(java.lang.String currencyFrom, java.lang.String currencyTo, java.util.Calendar rateDate, java.math.BigDecimal amount) throws java.rmi.RemoteException;
    public java.lang.String getCultureInfo(java.lang.String currency) throws java.rmi.RemoteException;
    public com.currency.wsdl.currency.ConvertDataTableColumnResponseDs convertDataTableColumn(com.currency.wsdl.currency.ConvertDataTableColumnDs ds, int tableIndex, java.lang.String columnName, java.lang.String fromCurrency, java.lang.String toCurrency) throws java.rmi.RemoteException;
    public java.util.Calendar getLastUpdateDate() throws java.rmi.RemoteException;
}
