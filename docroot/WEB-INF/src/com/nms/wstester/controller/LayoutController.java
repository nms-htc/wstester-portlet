package com.nms.wstester.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "layoutCtl")
@SessionScoped
public class LayoutController implements Serializable {
	
	private static final long serialVersionUID = -7112207198080523494L;
	
	private String functionPage;
	
	public LayoutController() {
	}

	public String getFunctionPage() {
		return functionPage;
	}

	public void setFunctionPage(String functionPage) {
		this.functionPage = functionPage;
	}
}
