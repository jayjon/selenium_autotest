package com.demo.test.pages;

import org.openqa.selenium.By;

public class TraceHomePage {
	//Trace产品的系统模块
	public static final By TRACE_TEXT_SYSTEM =By.xpath(".//*[@id='portal-sysconfig']");
    //Trace系统模块下系统配置
	public static final By TRACE_TEXT_PEIZHI=By.id("ui-id-1");
	//树结构
	public static final By TRACE_TEXT_TREE=By.xpath("//li/descendant::a");
	//树下所有button
	public static final By TRACE_TEXT_LEFTBUTTON=By.tagName("button");
	//系统数据里———》右侧上次备份时间
	public static final By LASTTIMEBAKUP = By.xpath(".//*[@id='des']");
	//事件数据里————》右侧手动归档和恢复
	public static final By ARCHIVE_RESTORE =By.xpath(".//*[@id='left-div']/div[1]/table/thead/tr/th[2]");
	public static final By AUTOGUIDANGZHOUQI = By.xpath(".//*[@id='form1']/fieldset[1]/ul/li[1]/label");
	public static final By SHOUQUANXINGXI = By.xpath(".//*[@id='myForm']/fieldset/ul/li[2]/label");
	public static final By ROUTEXINGXIPEIZHI=By.linkText("路由器管理");
	public static final By ROUTEINTERFACEPEIZHI = By.linkText("路由器接口管理");
	public static final By MAPPEIZHI = By.linkText("区域信息管理");
	public static final By ROUTEXINFXIPEIZHI =By.linkText("路由器管理");
	
}
