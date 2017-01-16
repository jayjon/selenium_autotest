package com.demo.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author Young
 * @description 首页面元素定位声明
 */
public class HomePage {

	/** 用户名显示区域 *//*
	public static final By HP_TEXT_USERNAME = By.xpath("//blockquote/b");
	*//** Flights按钮 *//*
	public static final By HP_BUTTON_FLIGHTS = By.xpath("//*[@src='/WebTours/images/flights.gif']");
	*//** Itinerary按钮 *//*
	public static final By HP_BUTTON_ITINERARY = By.xpath("//*[@src='/WebTours/images/itinerary.gif']");
	*//** Home按钮 *//*
	public static final By HP_BUTTON_HOME = By.xpath("//*[@src='/WebTours/images/in_home.gif']");
	*//** Sign Off按钮 *//*
	public static final By HP_BUTTON_SIGNOFF = By.xpath("//*[@src='/WebTours/images/signoff.gif']");
	*//** 首页完整文本 *//*
	public static final By HP_TEXT_HOME = By.xpath("//blockquote");*/
	/** 用户名显示区域 */
	public static final By HP_TEXT_USERNAME = By.xpath(".//*[@id='edits']");
	/*泰合显示区域*/
	public static final By HP_TEXT_TAIHE =By.xpath(".//*[@id='logobar']");
	/** 资产 */
	public static final By HP_TEXT_ZICHAN =By.xpath(".//*[@id='jqDock0']/div[1]/div/div/span");
	/**发现*/
	public static final By HP_TEXT_FIND =By.xpath(".//*[@id='jqDock0']/div[2]/div/div/span");
	/** 指纹 */
	public static final By HP_TEXT_ZHIWEN =By.xpath(".//*[@id='jqDock0']/div[3]/div/div/span");
	/**系统*/
	public static final By HP_TEXT_SYSTEM =By.xpath(".//*[@id='jqDock0']/div[4]/div/div/span");
	//资产过滤
	public static final By AC_TEXT_ZCFILTER =By.linkText("资产过滤");
	//资产类型
	public static final By AC_TEXT_ZCTYPE =By.linkText("资产类型");
	/**
	 * 发现配置
     */	
	public static final By AC_TEXT_FAXIANPEIZHI =By.linkText("任务配置");
	//新增组按钮
	public static final By AC_TEXT_ADDFXTASKGROUP =By.id("btn-add");
	//删除组按钮
	public static final By AC_TEXT_DELETEGROUP =By.id("btn-delete");
	//编辑组按钮
	public static final By AC_TEXT_EDITBUTTON =By.id("btn-update");
	//新增组名称
	public static final By AC_TEXT_ADDFXTGROUPNAME =By.id("name");
	//任务组
	public static final By AC_TEXT_TASKGROUP =By.linkText("任务组");
	
	//新增组描述信息
	public static final By AC_TEXT_ADDFXTGROUPDES =By.xpath(".//*[@id='group-form']/ul/li[2]/div/textarea");
	//新增组确定按钮
	public static final By AC_TEXT_ADDBUTTON = By.xpath(".//*[@id='btn-form-ok']/span/span");
	//右侧添加按钮
	public static final By AC_TEXT_ADDRIGHTBUTTON= By.xpath(".//*[@id='btn-editForm-add']/span/span");
	//点击右侧添加按钮跳转界面
	public static final By AC_TEXT_ADDTEXT= By.linkText("添加");
	//右侧第一个checkbox按钮
	public static final By AC_TEXT_FIRSTCHECKBOX =By.id("cb_id_table");
	//点击右侧任务名称输入框
	public static final By AC_TEXT_RIGHTTASKNAME= By.name("taskName");
	//
	//public static final By AC_TEXT_ISRADIOUPZERO= By.cssSelector("input[value='2']");
	public static final By AC_TEXT_ISRADIOUPZERO= By.xpath(".//*[@id='status'][2]");
	
	//右侧任务是否启用的单选按钮为0时
	public static final By AC_TEXT_ISRADIOUPONE= By.cssSelector("input[value='1']");
	//扫描地址
	public static final By AC_TEXT_SCANADDRESS= By.xpath(".//*[@id='address']");
	//任务类型
	public static final By AC_TEXT_TASKTYPE=By.id("taskType_port");
	//扫描端口输入框
	public static final By AC_TEXT_INTPUTPORTSCAN=By.id("specifiedPorts");
	//周期单选按钮yes
	public static final By AC_TEXT_CYCLEYES= By.id("isCycle_yes");
	
	//周期单选按钮no
	public static final By AC_TEXT_CYCLENO= By.id("isCycle_no");
	
	//周期输入框
	public static final By AC_TEXT_CYCLEINPUT= By.name("scanCycleTemp");
	//现在时刻
	public static final By AC_TEXT_NOWTIME= By.xpath(".//*[@id='ui-datepicker-div']/div[3]/button[1]");
	//完成按钮
	public static final By AC_TEXT_WANCHENG= By.xpath(".//*[@id='ui-datepicker-div']/div[3]/button[2]");
	//保存按钮
	public static final By AC_TEXT_BAOCUN= By.xpath(".//*[@id='btn_ok']");
	//执行时间
	public static final By AC_TEXT_EXCUTETIME= By.xpath(".//*[@id='executeTime']");
	
	//结构树组名称下的子孙标签
	public static final By AC_TEXT_GROUPADD = By.xpath("//li/descendant::a");
	//在当前任务组下的发现任务的添加按钮
	public static final By AC_TEXT_FXTASKADDBUTTON = By.xpath(".//*[@id='btn-editForm-add']/span/span");
	//点击删除组按钮后弹出的文本本字
	public static final By AC_TEXT_DELETEGROUPWENBEN = By.className("content");
	//点击删除组按钮后弹出的文本本字下确定按钮
	public static final By AC_TEXT_DELETEGROUPWENBENQUEDINBUTTON = By.xpath(".//*[@id='btn-form-delete']/span/span");
	//点击编辑组后名称输入框
	public static final By AC_TEXT_EDITINPUT = By.xpath(".//*[@id='name']");
	//点击编辑组后确定按钮
	public static final By AC_TEXT_EDITQEIDINGBUTTON = By.xpath(".//*[@id='btn-form-ok']/span/span");
	public static final By AC_TEXT_ZCTYPEADDBUTTON = By.xpath(".//*[@id='btn_add']/span/span");
	public static final By AC_TEXT_TYPENAME = By.xpath(".//*[@id='name']");
	public static final By AC_TEXT_NAVIGATION = By.xpath(".//*[@id='myform']/fieldset[1]/ul/li[6]/div/input[1]");
	public static final By AC_TEXT_BAOCUNBUTTON = By.xpath(".//*[@id='btn-ok']");
}
