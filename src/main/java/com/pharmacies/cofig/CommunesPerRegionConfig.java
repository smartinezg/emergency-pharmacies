package com.pharmacies.cofig;

public class CommunesPerRegionConfig {

	private String endpoint;
	private String regid;
	private int regidvalue;
	
	public int getRegidvalue() {
		return regidvalue;
	}

	public void setRegidvalue(int regidvalue) {
		this.regidvalue = regidvalue;
	}

	public String getEndpoint() {
		return endpoint;
	}
	
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	
	public String getRegid() {
		return regid;
	}
	
	public void setRegid(String regid) {
		this.regid = regid;
	}
	
}
