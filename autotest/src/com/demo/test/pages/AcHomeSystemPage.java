package com.demo.test.pages;

import org.openqa.selenium.By;

/** Ac系统页面*/
public class AcHomeSystemPage {
    //系统
	public static final By HP_TEXT_SYSTEM =By.xpath(".//*[@id='jqDock0']/div[4]/div/div/span");
	//系统管理按钮
	public static final By HP_TEXT_SYSTEMMANGER =By.id("ui-id-3");
	//当前节点的子孙及本身descendant-or-self//descendant子孙节点
	public static final By AC_TEXT_SYSTEMMANGER=By.xpath("//li/descendant::a");
	//第一个树节点
	public static final By AC_TEXT_SYSSELFMONITORING=By.id("system-manage-tree_3_switch");
	public static final By AC_TEXT_SYSPRODUCTUPDATE =By.id("system-manage-tree_9_switch");
	/**指纹*/
	public static final By AC_FINFERPRINTMOD = By.xpath(".//*[@id='jqDock0']/div[3]/div/div/span");
	public static final By AC_FINFERPRINT = By.xpath(".//*[@id='ui-id-3']");
}
