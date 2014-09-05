package com.nms.iwebservice;

public class PaymentgwPortTypeProxy implements com.nms.iwebservice.PaymentgwPortType {
  private String _endpoint = null;
  private com.nms.iwebservice.PaymentgwPortType paymentgwPortType = null;
  
  public PaymentgwPortTypeProxy() {
    _initPaymentgwPortTypeProxy();
  }
  
  public PaymentgwPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initPaymentgwPortTypeProxy();
  }
  
  private void _initPaymentgwPortTypeProxy() {
    try {
      paymentgwPortType = (new com.nms.iwebservice.PaymentgwLocator()).getpaymentgwHttpPort();
      if (paymentgwPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)paymentgwPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)paymentgwPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (paymentgwPortType != null)
      ((javax.xml.rpc.Stub)paymentgwPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.nms.iwebservice.PaymentgwPortType getPaymentgwPortType() {
    if (paymentgwPortType == null)
      _initPaymentgwPortTypeProxy();
    return paymentgwPortType;
  }
  
  public com.nms.iwebservice.VoucherPostpaidResp voucherPostpaid(com.nms.iwebservice.VoucherPostpaidReq in0) throws java.rmi.RemoteException{
    if (paymentgwPortType == null)
      _initPaymentgwPortTypeProxy();
    return paymentgwPortType.voucherPostpaid(in0);
  }
  
  public com.nms.iwebservice.ScratchCardResp cardCharging(com.nms.iwebservice.ScratchCardReq in0) throws java.rmi.RemoteException{
    if (paymentgwPortType == null)
      _initPaymentgwPortTypeProxy();
    return paymentgwPortType.cardCharging(in0);
  }
  
  public com.nms.iwebservice.TopupResp topupOnline(com.nms.iwebservice.TopupReq in0) throws java.rmi.RemoteException{
    if (paymentgwPortType == null)
      _initPaymentgwPortTypeProxy();
    return paymentgwPortType.topupOnline(in0);
  }
  
  
}