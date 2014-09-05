/**
 * PaymentgwPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nms.iwebservice;

public interface PaymentgwPortType extends java.rmi.Remote {
    public com.nms.iwebservice.VoucherPostpaidResp voucherPostpaid(com.nms.iwebservice.VoucherPostpaidReq in0) throws java.rmi.RemoteException;
    public com.nms.iwebservice.ScratchCardResp cardCharging(com.nms.iwebservice.ScratchCardReq in0) throws java.rmi.RemoteException;
    public com.nms.iwebservice.TopupResp topupOnline(com.nms.iwebservice.TopupReq in0) throws java.rmi.RemoteException;
}
