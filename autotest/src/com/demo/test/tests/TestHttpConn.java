package com.demo.test.tests;

import com.demo.test.utils.HttpRequestUtil;

public class TestHttpConn {
	
	public static void Thttp(){
		HttpRequestUtil hru=new HttpRequestUtil();
		String strURL="http://192.168.56.231:8888/usm/index.jsp";
		String jsonParams="";
		hru.post(strURL, jsonParams);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
}
