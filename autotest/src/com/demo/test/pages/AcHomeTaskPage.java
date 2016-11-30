package com.demo.test.pages;

import org.openqa.selenium.By;

/** 发现/任务页面*/
public class AcHomeTaskPage {
	//新增组名称相同时返回值
	public static final By AC_TEXT_ADDFXTGROUPRETURNNAME=By.xpath(".//*[@id='group-form']/ul/li[1]/span[1])");
	public static final By AC_TEXT_ADDFXTGROUPR=By.xpath(".//*[@id='tree_1_span']");
	//添加发现任务时界面名称返回值
	public static final By AC_TEXT_ERROR=By.className("error");
	
	//点击当前任务的checkbox按钮
	public static final By AC_TEXT_FXTASKCHECKBOX=By.xpath(".//*[@id='141']/td[3]/span");
	//点击当前任务的删除按钮
	public static final By AC_TEXT_DELFXTASK=By.xpath(".//*[@id='alarm_policy_delete']/span/span");
	//删除确认按钮
	public static final By AC_TEXT_DELQUEREN=By.xpath(".//*[@id='btn-form-delClear']/span/span");
}
