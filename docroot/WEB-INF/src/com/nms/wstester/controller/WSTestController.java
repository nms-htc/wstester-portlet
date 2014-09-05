package com.nms.wstester.controller;

import java.io.Serializable;
import java.security.MessageDigest;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.nms.iwebservice.PaymentgwPortType;
import com.nms.iwebservice.PaymentgwPortTypeProxy;
import com.nms.iwebservice.ScratchCardReq;
import com.nms.iwebservice.ScratchCardResp;
import com.nms.iwebservice.TopupReq;
import com.nms.iwebservice.TopupResp;
import com.nms.iwebservice.VoucherPostpaidReq;
import com.nms.iwebservice.VoucherPostpaidResp;

@ManagedBean(name = "wsTesterCtl")
@SessionScoped
public class WSTestController implements Serializable {
	
	private static final Log _log = LogFactoryUtil.getLog(WSTestController.class);
	private static final long serialVersionUID = -7924893391047745877L;
	private String endPointAddress = "http://10.8.2.101:8080/paymentws/services/paymentgw";
	private ScratchCardReq scratchCardReq;
	private ScratchCardResp scratchCardResp;
	private TopupReq topupReq;
	private TopupResp topupResp;
	private VoucherPostpaidReq voucherPostpaidReq;
	private VoucherPostpaidResp voucherPostpaidResp;

	public WSTestController() {

	}

	public void cardCharging() {
		FacesMessage message = null;
		try {

			// process password
			scratchCardReq.setPassword(getNonce(scratchCardReq.getPartnerId()
					+ scratchCardReq.getPassword()
					+ scratchCardReq.getRequestDate()));

			scratchCardResp = getService().cardCharging(scratchCardReq);
			message = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Execute service success.", "Execute service success.");
		} catch (Exception e) {
			_log.error("[WSTestController] cardCharging() ERROR", e);
			message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
					e.getMessage(), e.getMessage());
		} finally {
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}

	public void topupOnline() {
		FacesMessage message = null;
		try {
			// process password
			topupReq.setPassword(getNonce(topupReq.getPartnerId()
					+ topupReq.getPassword() + topupReq.getRequestDate()));
			topupResp = getService().topupOnline(topupReq);
			message = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Execute service success.", "Execute service success.");
		} catch (Exception e) {
			_log.error("[WSTestController] topupOnline() ERROR", e);
			message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
					e.getMessage(), e.getMessage());
		} finally {
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}

	public void voucherPostpaid() {
		FacesMessage message = null;
		// process password
		voucherPostpaidReq.setPassword(getNonce(voucherPostpaidReq
				.getPartnerId()
				+ voucherPostpaidReq.getPassword()
				+ voucherPostpaidReq.getRequestDate()));
		try {
			voucherPostpaidResp = getService().voucherPostpaid(
					voucherPostpaidReq);
			message = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Execute service success.", "Execute service success.");
		} catch (Exception e) {
			_log.error("[WSTestController] voucherPostpaid() ERROR", e);
			message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
					e.getMessage(), e.getMessage());
		} finally {
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}

	private PaymentgwPortType getService() {
		PaymentgwPortTypeProxy proxy = new PaymentgwPortTypeProxy(
				endPointAddress);
		return proxy.getPaymentgwPortType();
	}

	private String getNonce(String s) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F' };
		try {
			byte[] strTemp = s.getBytes();
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(strTemp);
			byte[] md = messageDigest.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return String.valueOf(str);
		} catch (Exception e) {
			return null;
		}
	}

	/* Getters and Setters */

	public ScratchCardReq getScratchCardReq() {
		if (scratchCardReq == null)
			scratchCardReq = new ScratchCardReq();
		return scratchCardReq;
	}

	public void setScratchCardReq(ScratchCardReq scratchCardReq) {
		this.scratchCardReq = scratchCardReq;
	}

	public ScratchCardResp getScratchCardResp() {
		return scratchCardResp;
	}

	public void setScratchCardResp(ScratchCardResp scratchCardResp) {
		this.scratchCardResp = scratchCardResp;
	}

	public TopupReq getTopupReq() {
		if (topupReq == null)
			topupReq = new TopupReq();
		return topupReq;
	}

	public void setTopupReq(TopupReq topupReq) {
		this.topupReq = topupReq;
	}

	public TopupResp getTopupResp() {
		return topupResp;
	}

	public void setTopupResp(TopupResp topupResp) {
		this.topupResp = topupResp;
	}

	public VoucherPostpaidReq getVoucherPostpaidReq() {
		if (voucherPostpaidReq == null)
			voucherPostpaidReq = new VoucherPostpaidReq();
		return voucherPostpaidReq;
	}

	public void setVoucherPostpaidReq(VoucherPostpaidReq voucherPostpaidReq) {
		this.voucherPostpaidReq = voucherPostpaidReq;
	}

	public VoucherPostpaidResp getVoucherPostpaidResp() {
		return voucherPostpaidResp;
	}

	public void setVoucherPostpaidResp(VoucherPostpaidResp voucherPostpaidResp) {
		this.voucherPostpaidResp = voucherPostpaidResp;
	}

	public String getEndPointAddress() {
		return endPointAddress;
	}

	public void setEndPointAddress(String endPointAddress) {
		this.endPointAddress = endPointAddress;
	}
}
