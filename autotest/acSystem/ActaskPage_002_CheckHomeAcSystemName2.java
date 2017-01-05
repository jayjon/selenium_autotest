package com.demo.test.testcases.acSystem;

import java.util.Map;

import org.testng.annotations.Test;

import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.AcHomeSystemPageHelper;
import com.demo.test.pageshelper.AcHomeTaskPageHelper;
import com.demo.test.pageshelper.HomePageHelper;
import com.demo.test.pageshelper.LoginPageHelper;
import com.demo.test.pageshelper.TraceHomePageHelper;
/**AC项目系统模块
 * 一键循环验证页面返回值*/
public class ActaskPage_002_CheckHomeAcSystemName2 extends BaseParpare{
	@Test(dataProvider = "testData")
	public void CheckHomeAcSystemName2(Map<String,String> data){
		// 等待登录页面加载
		LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
		// 输入登录信息
		LoginPageHelper.typeLoginInfo(seleniumUtil, data.get("USERNAME"), data.get("PASSWORD"));
		//检查登录用户名是否正确
		HomePageHelper.checkUserName(seleniumUtil, timeOut,data.get("USERNAME"));
		//循环得到所有按钮并且点击 调用写好的方法
		TraceHomePageHelper.tagname1(seleniumUtil, timeOut);
        //点击到系统模块
	    AcHomeSystemPageHelper.checkclinkHomes(seleniumUtil, timeOut, data.get("SYSADD"),data.get("SYSZAIXIANUSER"), data.get("SYSLOG"), data.get("SERVERMONITORING"), data.get("SQLMONITORING"),data.get("FLOWMONITORING"
));

	   
	}
}
