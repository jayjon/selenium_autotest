package com.demo.test.pages;

import org.openqa.selenium.By;

public class TraceHomePage {
	//Trace产品的系统模块
	public static final By TRACE_TEXT_SYSTEM =By.xpath(".//*[@id='jqDock0']/div[7]/div/div/span");
    //Trace系统模块下系统配置
	public static final By TRACE_TEXT_PEIZHI=By.id("ui-id-1");
	//树结构
	public static final By TRACE_TEXT_TREE=By.xpath("//li/descendant::a");
	//树下所有button
	public static final By TRACE_TEXT_LEFTBUTTON=By.tagName("button");
	//系统数据里———》右侧上次备份时间
	public static final By LASTTIMEBAKUP = By.xpath(".//*[@id='des']");
	//事件数据里————》右侧手动归档和恢复
	public static final By ARCHIVE_RESTORE =By.xpath(".//*[@id='_fieldset']/legend");
	
}
