package com.demo.test.testcases.tsocTrace;

import java.util.Map;
import org.testng.annotations.Test;
import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.HomePageHelper;
import com.demo.test.pageshelper.LoginPageHelper;
import com.demo.test.pageshelper.TraceHomePageHelper;

/**
 * @author Young
 * @description 登录之后验证用户名是不是正确的
 */

public class TracePage_002_ClinkHomeSystem_Test extends BaseParpare{
   @Test(dataProvider = "testData")
	public void ClinkHomeSystem(Map<String, String> data) {
		// 等待登录页面加载
		LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
		// 输入登录信息
		LoginPageHelper.typeLoginInfo(seleniumUtil, data.get("USERNAME"), data.get("PASSWORD"));
		// 等待首页元素显示出来
		HomePageHelper.waitHomePageLoad(seleniumUtil, timeOut);
		// 检查用户名是不是期望的"sysadmin"
		HomePageHelper.checkUserName(seleniumUtil, timeOut, data.get("USERNAME"));
		//获取到所有的button并且默认为关闭的就打开
		TraceHomePageHelper.tagname(seleniumUtil, timeOut);
		//点击所有的问本
		TraceHomePageHelper.clinkSystems(seleniumUtil, timeOut,data.get("lasttimebakup"), data.get("ARCHIVE_RESTORE"),data.get("AUTOGUIDANGZHOUQI"),data.get("SHOUQUANXINGXI"),data.get("ROUTEXINFXIPEIZHI"),data.get("ROUTEINTERFACEPEIZHI"),data.get("MAPPEIZHI"));

	}
	
}
