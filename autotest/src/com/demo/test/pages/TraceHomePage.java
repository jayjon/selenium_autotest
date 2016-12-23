package com.demo.test.pages;

import org.openqa.selenium.By;

public class TraceHomePage {
	//Trace产品的系统模块
	public static final By TRACE_TEXT_SYSTEM =By.xpath(".//*[@id='jqDock0']/div[7]/div/div/span");
    //Trace系统模块下系统配置
	public static final By TRACE_TEXT_PEIZHI=By.id("ui-id-1");
	//树结构
	public static final By TRACE_TEXT_TREE=By.xpath("//li/descendant::*");
	//树下所有button
	public static final By TRACE_TEXT_LEFTBUTTON=By.tagName("button");
	
}
