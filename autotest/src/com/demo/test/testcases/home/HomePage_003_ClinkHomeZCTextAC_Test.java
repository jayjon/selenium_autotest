package com.demo.test.testcases.home;

import java.util.Map;

import org.testng.annotations.Test;

import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.HomePageHelper;
import com.demo.test.pageshelper.LoginPageHelper;

/**
 * @author Young
 * @description 检测首页的文字描述是不是正确的
 */

public class HomePage_003_ClinkHomeZCTextAC_Test extends BaseParpare {
	   //@Test(dataProvider = "testData")
	public void ClinkHomeZCTextAC(Map<String, String> data) {
		// 等待登录页面加载
		LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
		// 输入登录信息
		LoginPageHelper.typeLoginInfo(seleniumUtil, data.get("USERNAME"), data.get("PASSWORD"));
		//检查登录用户名是否正确
		HomePageHelper.checkUserName(seleniumUtil, timeOut,data.get("USERNAME"));
	
	    //检查是否到资产模块页面
		HomePageHelper.checkHomeErrorInfo(seleniumUtil,timeOut,data.get("ZCFILTER"),data.get("ZCTYPE"));
		
		//点击系统模块
		HomePageHelper.clinkHomeElement(seleniumUtil,timeOut,data.get("ZICHAN"));
	}
}
