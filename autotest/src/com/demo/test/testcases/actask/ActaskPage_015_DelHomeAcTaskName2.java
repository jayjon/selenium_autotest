package com.demo.test.testcases.actask;

import java.util.Map;

import org.testng.annotations.Test;

import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.AcHomeTaskPageHelper;
import com.demo.test.pageshelper.HomePageHelper;
import com.demo.test.pageshelper.LoginPageHelper;
/**循环删除任务组*/
public class ActaskPage_015_DelHomeAcTaskName2 extends BaseParpare{
 //@Test(dataProvider = "testData")
	public void DelHomeAcTaskName2(Map<String,String> data){
		// 等待登录页面加载
		LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
		// 输入登录信息
		LoginPageHelper.typeLoginInfo(seleniumUtil, data.get("USERNAME"), data.get("PASSWORD"));
		//检查登录用户名是否正确
		HomePageHelper.checkUserName(seleniumUtil, timeOut,data.get("USERNAME"));
		//检查是否到发现模块页面并且验证后添加任务组 
	    HomePageHelper.clinkHomeFXElement(seleniumUtil, timeOut, data.get("FAXIANPEIZHI"),data.get("NAME"),data.get("ISDELETE"));
	    //删除任务组多个任务组
	    AcHomeTaskPageHelper.deleteFXGroupTask1(seleniumUtil, timeOut, data.get(null));
	  
	  
	}
}
