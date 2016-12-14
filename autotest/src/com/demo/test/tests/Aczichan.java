package com.demo.test.tests;

public class Aczichan {
     private String id;
     private String IP;
     private String asset_os;
     private String asset_name;
     private String asset_type;
	public Aczichan(String id, String iP, String asset_os, String asset_name, String asset_type) {
		super();
		this.id = id;
		IP = iP;
		this.asset_os = asset_os;
		this.asset_name = asset_name;
		this.asset_type = asset_type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public String getAsset_os() {
		return asset_os;
	}
	public void setAsset_os(String asset_os) {
		this.asset_os = asset_os;
	}
	public String getAsset_name() {
		return asset_name;
	}
	public void setAsset_name(String asset_name) {
		this.asset_name = asset_name;
	}
	public String getAsset_type() {
		return asset_type;
	}
	public void setAsset_type(String asset_type) {
		this.asset_type = asset_type;
	}
	
     
}
