package com.demo.test.pages;

import org.openqa.selenium.By;

/**
 * @author Young
 * @description 登录页面元素定位声明
 */
public class LoginPage {
/*	*//** 用户名输入框 *//*
	public static final By LP_INPUT_USERNAME = By.name("username");

	*//** 密码输入框 *//*
	public static final By LP_INPUT_PASSWORD = By.name("password");
	
	*//** 登录按钮 *//*
	public static final By LP_BUTTON_LOGIN = By.name("login");*/
	/** AC用户名输入框 */
	public static final By LP_INPUT_IFUSERNAME = By.name("infos:username");

	/**AC 密码输入框 */
	public static final By LP_INPUT_IFPASSWORD = By.name("infos:password");
	/**AC 登录按钮 */
	public static final By LP_INPUT_LOGINAC = By.xpath(".//*[@id='login-form']/div/button");

	/** 登录错误信息 */
	public static final By LP_TEXT_ERROR = By.id("includeError");

}
