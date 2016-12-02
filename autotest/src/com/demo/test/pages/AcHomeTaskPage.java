package com.demo.test.pages;

import org.openqa.selenium.By;

/** 发现/任务页面*/
public class AcHomeTaskPage {
	//新增组名称相同时返回值
	public static final By AC_TEXT_ADDFXTGROUPRETURNNAME=By.xpath(".//*[@id='group-form']/ul/li[1]/span[1])");
	public static final By AC_TEXT_ADDFXTGROUPR=By.xpath(".//*[@id='tree_1_span']");
	//添加发现任务时界面名称返回值
	public static final By AC_TEXT_ERROR=By.className("error");
    //点击当前任务的删除按钮
	public static final By AC_TEXT_DELFXTASK=By.xpath(".//*[@id='alarm_policy_delete']/span/span");
	//当前任务的编辑按钮
	public static final By AC_TEXT_EDITFXTASKNAME =By.xpath(".//*[@id='btn-ipassets-edit']/span/span/img");
	//删除确认按钮
	public static final By AC_TEXT_DELQUEREN=By.xpath(".//*[@id='btn-form-delClear']/span/span");
    //找到当前table
	public static final By AC_TEXT_TABLEID=By.id("id_table");
}
