/**
 * PaymentgwLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nms.iwebservice;

public class PaymentgwLocator extends org.apache.axis.client.Service implements com.nms.iwebservice.Paymentgw {

	private static final long serialVersionUID = -4846075489171840593L;

	public PaymentgwLocator() {
    }


    public PaymentgwLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PaymentgwLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for paymentgwHttpPort
    private java.lang.String paymentgwHttpPort_address = "http://10.8.2.101:8080/paymentws/services/paymentgw";

    public java.lang.String getpaymentgwHttpPortAddress() {
        return paymentgwHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String paymentgwHttpPortWSDDServiceName = "paymentgwHttpPort";

    public java.lang.String getpaymentgwHttpPortWSDDServiceName() {
        return paymentgwHttpPortWSDDServiceName;
    }

    public void setpaymentgwHttpPortWSDDServiceName(java.lang.String name) {
        paymentgwHttpPortWSDDServiceName = name;
    }

    public com.nms.iwebservice.PaymentgwPortType getpaymentgwHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(paymentgwHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getpaymentgwHttpPort(endpoint);
    }

    public com.nms.iwebservice.PaymentgwPortType getpaymentgwHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.nms.iwebservice.PaymentgwHttpBindingStub _stub = new com.nms.iwebservice.PaymentgwHttpBindingStub(portAddress, this);
            _stub.setPortName(getpaymentgwHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setpaymentgwHttpPortEndpointAddress(java.lang.String address) {
        paymentgwHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    @SuppressWarnings("rawtypes")
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.nms.iwebservice.PaymentgwPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.nms.iwebservice.PaymentgwHttpBindingStub _stub = new com.nms.iwebservice.PaymentgwHttpBindingStub(new java.net.URL(paymentgwHttpPort_address), this);
                _stub.setPortName(getpaymentgwHttpPortWSDDServiceName());
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
    @SuppressWarnings("rawtypes")
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("paymentgwHttpPort".equals(inputPortName)) {
            return getpaymentgwHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://iwebservice.nms.com", "paymentgw");
    }

    @SuppressWarnings("rawtypes")
	private java.util.HashSet ports = null;

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://iwebservice.nms.com", "paymentgwHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("paymentgwHttpPort".equals(portName)) {
            setpaymentgwHttpPortEndpointAddress(address);
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
