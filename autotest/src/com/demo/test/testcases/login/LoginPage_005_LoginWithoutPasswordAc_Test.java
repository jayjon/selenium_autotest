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

public class LoginPage_005_LoginWithoutPasswordAc_Test extends BaseParpare {
    //@Test(dataProvider = "testData")
	public void LoginPage_005_LoginWithoutPasswordAc(Map<String, String> data) {
		// 等待登录页面加载
		LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
		// 输入登录信息
		LoginPageHelper.typeLoginInfo(seleniumUtil, data.get("USERNAME"), data.get("PASSWORD"));
	     //HomePageHelper.waitHomePageLoad(seleniumUtil, timeOut);
		LoginPageHelper.checkLoginErrorInfo(seleniumUtil, data.get("ERROR"));
	}
	
}
