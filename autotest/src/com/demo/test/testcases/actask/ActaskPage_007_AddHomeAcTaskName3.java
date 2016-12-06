package com.demo.test.testcases.actask;

import java.util.Map;

import org.testng.annotations.Test;

import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.AcHomeTaskPageHelper;
import com.demo.test.pageshelper.HomePageHelper;
import com.demo.test.pageshelper.LoginPageHelper;
/**
 * 测试用例： 
 * 添加任务组F 任务为端口扫描*/ 
public class ActaskPage_007_AddHomeAcTaskName3 extends BaseParpare{
    //@Test(dataProvider = "testData")
	public void AddHomeAcTaskName3(Map<String,String> data){
		// 等待登录页面加载
		LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
		// 输入登录信息
		LoginPageHelper.typeLoginInfo(seleniumUtil, data.get("USERNAME"), data.get("PASSWORD"));
		//检查登录用户名是否正确
		HomePageHelper.checkUserName(seleniumUtil, timeOut,data.get("USERNAME"));
		//检查是否到发现模块页面并且验证后添加任务组 
	    HomePageHelper.clinkHomeFXElement(seleniumUtil, timeOut, data.get("FAXIANPEIZHI"),data.get("NAME"),data.get("ISDELETE"));
	    //添加任务组
	    AcHomeTaskPageHelper.addtaskName(seleniumUtil, timeOut,data.get("NAME"));
	    //添加组下的任务
	    AcHomeTaskPageHelper.addFXGroupTaskPortScan(seleniumUtil, timeOut, data.get("ADDTEXT"), data.get("RIGHTTASKNAME"),data.get("SCANADDRESS"), data.get("CYCLETIME"),data.get("ERROR"),data.get("key"), data.get("PORT"));
	}
}
