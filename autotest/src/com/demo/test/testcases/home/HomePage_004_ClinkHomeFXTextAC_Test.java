package com.demo.test.testcases.home;

import java.util.Map;

import org.testng.annotations.Test;

import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.AcHomeTaskPageHelper;
import com.demo.test.pageshelper.HomePageHelper;
import com.demo.test.pageshelper.LoginPageHelper;

/**
 * @author Young
 * @description 在发现模块下添加任务组 创建任务
 */

public class HomePage_004_ClinkHomeFXTextAC_Test extends BaseParpare {
	   //@Test(dataProvider = "testData")
	public void ClinkHomeFXTextAC(Map<String, String> data) {
		// 等待登录页面加载
		LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
		// 输入登录信息
		LoginPageHelper.typeLoginInfo(seleniumUtil, data.get("USERNAME"), data.get("PASSWORD"));
		//检查登录用户名是否正确
		HomePageHelper.checkUserName(seleniumUtil, timeOut,data.get("USERNAME"));
	    //检查是否到发现模块页面并且验证后添加任务组 
		HomePageHelper.clinkHomeFXElement(seleniumUtil, timeOut, data.get("FAXIANPEIZHI"),data.get("NAME"),data.get("ISDELETE"));
	  
	    /**在当前任务组下删除任务 */	    
	    //HomePageHelper.deleteFXTaskGroup(seleniumUtil,timeOut,data.get("ISDELETE"));
	    /**在当前任务组下编辑任务*/
	    //HomePageHelper.EDITFXTaskGROUP(seleniumUtil,timeOut,data.get("UPDATETASKNAME"));
	    /**验证任务组 组下的任务是否添加*/
	    AcHomeTaskPageHelper.checkTaskName(seleniumUtil,timeOut,data.get(""));
	    /**在当前任务组下添加扫描任务*/
	   // AcHomeTaskPageHelper.addFXGroupTask(seleniumUtil,timeOut, data.get("ADDTEXT"), data.get("RIGHTTASKNAME"),data.get("SCANADDRESS"), data.get("CYCLETIME"));
	   }
}
