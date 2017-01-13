package com.demo.test.testcases.acfingerprint;

import java.util.Map;

import org.testng.annotations.Test;

import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.AcHomeSystemPageHelper;
import com.demo.test.pageshelper.AcHomeTaskPageHelper;
import com.demo.test.pageshelper.HomePageHelper;
import com.demo.test.pageshelper.LoginPageHelper;
import com.demo.test.pageshelper.TraceHomePageHelper;
/**指纹模块自动化点击返回值界面检查测试*/
public class ActaskPage_001_CheckHomeAcFingerPrintName extends BaseParpare{
	@Test(dataProvider = "testData")
	public void CheckHomeAcFingerPrintName(Map<String,String> data){
		// 等待登录页面加载
		LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
		// 输入登录信息
		LoginPageHelper.typeLoginInfo(seleniumUtil, data.get("USERNAME"), data.get("PASSWORD"));
		//检查登录用户名是否正确
		HomePageHelper.checkUserName(seleniumUtil, timeOut,data.get("USERNAME"));
		//点击到指纹模块，得到所有的button 如果有关闭的button点击开启
		TraceHomePageHelper.tagname2(seleniumUtil, timeOut);
		//循环点击树结构 判断返回值
		AcHomeSystemPageHelper.checkclinkHomes1(seleniumUtil, timeOut, data.get("ZHIWENGUANLI"), data.get("ZHIWENSELECT"), data.get("IP"), data.get("HODTCOUNT"),data.get("VALUE"));
	   
	}
}
