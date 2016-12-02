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
	/** body frame 名字 */
	public static final By FP_FRAME_ACBODY = By.xpath(".//*[@src='/ac/config/runConfig/acMain?portal_id=portal-acScanConfig&wicket_id=module-acScanConfig_wickets-scanConfig&root_id=-1&portalStyle=tabs']");
	                                                         
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
}
