package com.demo.test.testcases.login;

import java.util.Map;
import org.testng.annotations.Test;
import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.HomePageHelper;
import com.demo.test.pageshelper.LoginPageHelper;

/**
 * @author Young
 * @description 登录之后验证用户名是不是正确的
 */

public class LoginPage_004_LoginSuccessFunctionAc_Test2 extends BaseParpare {
    //@Test(dataProvider = "testData")
	public void LoginPage_004_LoginSuccessFunctionAc(Map<String, String> data) {
		// 等待登录页面加载
		LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
		// 输入登录信息
		LoginPageHelper.typeLoginInfo(seleniumUtil, data.get("USERNAME"), data.get("PASSWORD"));
		// 等待首页元素显示出来
		HomePageHelper.waitHomePageLoad(seleniumUtil, timeOut);
		//LoginPageHelper.checkLoginErrorInfo(seleniumUtil, data.get("ERROR"));
	}
	
}
