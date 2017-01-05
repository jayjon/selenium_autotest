package com.demo.test.testcases.acSystem;

import java.util.Map;

import org.testng.annotations.Test;

import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.AcHomeSystemPageHelper;
import com.demo.test.pageshelper.AcHomeTaskPageHelper;
import com.demo.test.pageshelper.HomePageHelper;
import com.demo.test.pageshelper.LoginPageHelper;

public class ActaskPage_001_CheckHomeAcSystemName extends BaseParpare{
	//@Test(dataProvider = "testData")
	public void CheckHomeAcSystemName(Map<String,String> data){
		// 等待登录页面加载
		LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
		// 输入登录信息
		LoginPageHelper.typeLoginInfo(seleniumUtil, data.get("USERNAME"), data.get("PASSWORD"));
		//检查登录用户名是否正确
		HomePageHelper.checkUserName(seleniumUtil, timeOut,data.get("USERNAME"));
        //点击到系统模块
		AcHomeSystemPageHelper.checkclinkHome(seleniumUtil, timeOut);
	   
	}
}
