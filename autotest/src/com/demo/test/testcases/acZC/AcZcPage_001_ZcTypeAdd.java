package com.demo.test.testcases.acZC;

import java.util.Map;

import org.testng.annotations.Test;

import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.AcHomeTaskPageHelper;
import com.demo.test.pageshelper.HomePageHelper;
import com.demo.test.pageshelper.LoginPageHelper;
/**测试用例：AC资产模块 资产类型中添加资产方法*/
public class AcZcPage_001_ZcTypeAdd extends BaseParpare{
	//@Test(dataProvider = "testData")
	public void AcZcPage_001_ZcTypeAdd(Map<String,String> data){
		LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
		// 输入登录信息
		LoginPageHelper.typeLoginInfo(seleniumUtil, data.get("USERNAME"), data.get("PASSWORD"));
		//检查登录用户名是否正确
		HomePageHelper.checkUserName(seleniumUtil, timeOut,data.get("USERNAME"));
		//此处公用AC的任务帮助类
		AcHomeTaskPageHelper.addZcType(seleniumUtil, timeOut, data.get("TYPENAME"));
	}
}
