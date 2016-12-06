package com.demo.test.testcases.actask;

import java.util.Map;

import org.testng.annotations.Test;

import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.AcHomeTaskPageHelper;
import com.demo.test.pageshelper.HomePageHelper;
import com.demo.test.pageshelper.LoginPageHelper;
/**
 * 测试用例：
 * 一键删除任务组下的所有任务*/
public class ActaskPage_008_DelHomeAcTaskName2 extends BaseParpare{
	//@Test(dataProvider = "testData")
	public void DelHomeAcTaskName2(Map<String,String> data){
		// 等待登录页面加载
		LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
		// 输入登录信息
		LoginPageHelper.typeLoginInfo(seleniumUtil, data.get("USERNAME"), data.get("PASSWORD"));
		//检查登录用户名是否正确
		HomePageHelper.checkUserName(seleniumUtil, timeOut,data.get("USERNAME"));
		//点击任务组 找到任务
		AcHomeTaskPageHelper.CheckClinkFxTask1(seleniumUtil, timeOut,data.get("TASKGROUP"));
	    //删除当前组的任务
	    AcHomeTaskPageHelper.deleteFXGroupTaskAll(seleniumUtil, timeOut,data.get("null"));
}
}