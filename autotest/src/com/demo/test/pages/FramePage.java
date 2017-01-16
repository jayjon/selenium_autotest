package com.demo.test.pages;

import org.openqa.selenium.By;

/**
 * @author Young
 * @description 这个类算不上一个page页，因为这个WebTours站点涉及到的frame比较多，所以我们把frame抓取出来用page页来存储
 * 
 * 
 */
public class FramePage {

	/** header frame名字 */
	public static final By FP_FRAME_HEADER = By.name("header");
	/** body frame 名字 */
	public static final By FP_FRAME_BODY = By.name("body");
	/**任务 body frame 名字 */
	public static final By FP_FRAME_ACBODY = By.xpath(".//*[@src='/ac/config/runConfig/acMain?portal_id=portal-acScanConfig&wicket_id=module-acScanConfig_wickets-scanConfig&root_id=-1&portalStyle=tabs']");
	/**ac系统body frame*/
	public static final By FP_FRAME_ACSYSBODY = By.xpath(".//*[@src='/ac/config/sysmanage/sysinfo/viewSysManage?portal_id=portal-acConfig&wicket_id=module-acConfig_wickets-systemConfig&root_id=-1&portalStyle=tabs']");                                                        
//	public static final By FP_FRAME_CLASSNAME = By.className("west");
	/** navbar frame名字 */
	public static final By FP_FRAME_NAVBAR = By.name("navbar");
	/** info frame名字 */
	public static final By FP_FRAME_INFO = By.name("info");
	/** body div 名字 */
	public static final By FP_DIV_CONTAINER = By.id("container");
	/** body 子div 名字 */
	public static final By FP_DIV_FWAPPER = By.id("form-wrapper");
	/**AC发现模块右侧添加按钮*/
	public static final By AC_FNAME_FXRIGHTFRAME = By.id("rightFrame");
	/**AC发现模块右侧发现任务下添加按钮后界面的 iframe*/
	public static final By AC_FNAME_ADDFXRIGHTTASKIFRAME = By.className("ui-tabs-frame");
   /**Trace系统模块tree*/
	public static final By TRACE_FNAME_SYSTEM= By.xpath(".//*[@src='/trace/system/systemtabs?portal_id=portal-sysconfig&wicket_id=module-custom_wickets-sysconfig-conf&root_id=-1&portalStyle=tabs']");
  /**Trace系统模块右侧iframe*/		
   public static final By TRACE_FNAME_RIGHT =By.xpath(".//*[@src='/trace/system/sys/info']");
   public static final By TRACE_FNAME_RIGHT1=By.xpath(".//*[@src='/trace/system/event']");
   public static final By TRACE_FNAME_RIGHT2 = By.xpath(".//*[@src='/trace/system/maintain/info']");
   public static final By TRACE_FNAME_RIGHT3 = By.xpath(".//*[@src='/trace/system/licenseInit']");
   public static final By TRACE_FNAME_RIGHT4 = By.xpath(".//*[@src='/trace/origins/port/routerPortInfo/tab']");
   public static final By TRACE_FNAME_RIGHT5 = By.xpath(".//*[@src='/trace/origins/port/rportGroupConf/tab']");
   public static final By TRACE_FNAME_RIGHT6 =By.xpath(".//*[@src='/trace/origins/port/routerInfo/tab']");
/**AC系统模块右侧iframe*/
   public static final By AC_SYS_RIGHT = By.xpath(".//*[@src='/ac/runconfig/route/main?page=1&rows=20&sord=asc&sidx=id']");
   public static final By AC_SYS_RIGHT1 = By.xpath(".//*[@src='/ac/config/sysmanage/onlineuser/viewOnlineUser']");
   public static final By AC_SYS_RIGHT2 = By.xpath(".//*[@src='/ac/config/sysmanage/syslog/viewSysLog']");
   public static final By AC_SYS_RIGHT3 = By.xpath(".//*[@src='/ac/config/sysmanage/server/viewServerMonitor']");
   public static final By AC_SYS_RIGHT4 = By.xpath(".//*[@src='/ac/config/sysmanage/database/viewDatabaseMonitor']");
   public static final By AC_SYS_RIGHT5 = By.xpath(".//*[@src='/ac/config/sysmanage/event/viewEvent']");
 /**AC指纹模块左侧iframe*/
   public static final By FP_FRAME_ACZHIWEN = By.xpath(".//*[@src='/ac/fingerPrint/main?portal_id=portal-acFingerPrint&wicket_id=module-acFingerPrint_wickets-fingerPrint&root_id=-1&portalStyle=tabs']");
   public static final By AC_ZHIWEN_RIGHT = By.xpath(".//*[@src='/ac/fingerPrint/viewAcFingerPrint']");
public static final By AC_ZHIWEN_RIGHT1 = By.xpath(".//*[@src='/ac/fingerPrint/extractionView']");
public static final By AC_ZC_TYPESYS = By.xpath(".//*[@src='/ac/acasset/viewAllType']");
public static final By AC_ZC_TYPESYS1 = By.xpath(".//*[@src='/ac/acasset/assetTypeMain?portal_id=portal-acasset&wicket_id=module-acasset_wickets-acasset-type&root_id=-1']");

}
