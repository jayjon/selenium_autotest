package com.demo.test.pageshelper;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.demo.test.pages.AcHomeSystemPage;
import com.demo.test.pages.AcHomeTaskPage;
import com.demo.test.pages.FramePage;
import com.demo.test.pages.HomePage;
import com.demo.test.pages.TraceHomePage;
import com.demo.test.utils.SeleniumUtil;

public class AcHomeSystemPageHelper {
	// 提供本类中日志输出对象
		public static Logger logger = Logger.getLogger(HomePageHelper.class);

		public static void checkclinkHome(SeleniumUtil seleniumUtil, int timeOut) {
			//seleniumUtil.addCookies1(3000);
			logger.info("");
			seleniumUtil.click(AcHomeSystemPage.HP_TEXT_SYSTEM);
			seleniumUtil.click(AcHomeSystemPage.HP_TEXT_SYSTEMMANGER);
			seleniumUtil.pause(3000);
			logger.info("开始进入iframe");
			FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.FP_FRAME_ACSYSBODY);// 先进入到bodyframe中
			logger.info("进入iframe成功");
			
			seleniumUtil.click(AcHomeSystemPage.AC_TEXT_SYSSELFMONITORING);
			logger.info("点击自身监控成功");
			seleniumUtil.pause(3000);
			seleniumUtil.click(AcHomeSystemPage.AC_TEXT_SYSPRODUCTUPDATE);
			logger.info("点击产品升级成功");
			//seleniumUtil.click(AcHomeSystemPage.AC_TEXT_SYSTEMPEIZHI);
			seleniumUtil.pause(3000);
			//拿到子孙节点循环
			 List<WebElement> s = seleniumUtil.findElementsBy(AcHomeSystemPage.AC_TEXT_SYSTEMMANGER);
	    	 for(int i=0;i<s.size();i++){
	    		 WebElement element =s.get(i);
	    		 isDiscover1(seleniumUtil,element);
	    		 System.out.println("****"+element.getText());
	    	 }
			}
		 /**设置隐藏的元素 让其显示*/
		public static void isDiscover(SeleniumUtil seleniumUtil,WebElement element) {
			// TODO Auto-generated method stub
			if(seleniumUtil.isDisplayed(element)==false){
				//调用js方法打开树
				seleniumUtil.executeJS("$('ul').css('display','block)'");
			}else{
				System.out.println("树结构已展开....");
			}
		}
		 /**设置隐藏的元素 让其显示*/
		public static void isDiscover1(SeleniumUtil seleniumUtil,WebElement element) {
			// TODO Auto-generated method stub
			if(seleniumUtil.isDisplayed(element)==false){
				//调用js方法打开树
				seleniumUtil.executeJS("$('ul').css('display','block)'");
			}else{
				System.out.println("树结构已展开....");
			}
		}
		/*循环验证数据方法*/
		public static void checkclinkHomes(SeleniumUtil seleniumUtil, int timeOut,String SYSADD,String SYSZAIXIANUSER,String SYSLOG,String SERVERMONITORING,String SQLMONITORING,String FLOWMONITORING ) {
			// TODO Auto-generated method stub
			seleniumUtil.pause(2000);
			List<WebElement> s =seleniumUtil.findElementsBy(TraceHomePage.TRACE_TEXT_TREE);
			for(int i=0;i<s.size();i++){
			        WebElement	element = s.get(i);
					 System.out.println("***");
						seleniumUtil.pause(1500);
						seleniumUtil.click(By.linkText(element.getText()));
						if(element.getText().equals("路由配置")){
							//进入框架
							FramePageHelper.jumpInToFrame(seleniumUtil,FramePage.AC_SYS_RIGHT);
							seleniumUtil.isContains(seleniumUtil.getText(AcHomeTaskPage.SYSADD), SYSADD);
							//跳回到父框架
							FramePageHelper.jumpParentFrame(seleniumUtil);
							logger.info("测试用例1[路由配置]返回页面值成功");
						}else if(element.getText().equals("在线用户")){
							//进入框架
							FramePageHelper.jumpInToFrame(seleniumUtil,FramePage.AC_SYS_RIGHT1);
							seleniumUtil.isContains(seleniumUtil.getText(AcHomeTaskPage.SYSZAIXIANUSER), SYSZAIXIANUSER);
							//跳回到父框架
							FramePageHelper.jumpParentFrame(seleniumUtil);
							logger.info("测试用例2[在线用户]返回页面值成功");
						}else if(element.getText().equals("系统日志")){
							//进入框架
							FramePageHelper.jumpInToFrame(seleniumUtil,FramePage.AC_SYS_RIGHT2);
							seleniumUtil.isContains(seleniumUtil.getText(AcHomeTaskPage.SYSLOG), SYSLOG);
							//跳回到父框架
							FramePageHelper.jumpParentFrame(seleniumUtil);
							logger.info("测试用例3[系统日志]返回页面值成功");
						}else if(element.getText().equals("服务器监控")){
							//进入框架
							FramePageHelper.jumpInToFrame(seleniumUtil,FramePage.AC_SYS_RIGHT3);
							seleniumUtil.isContains(seleniumUtil.getText(AcHomeTaskPage.SERVERMONITORING), SERVERMONITORING);
							//跳回到父框架
							FramePageHelper.jumpParentFrame(seleniumUtil);
							logger.info("测试用例4[服务器监控]返回页面值成功");
						}else if(element.getText().equals("数据库监控")){
							//进入框架
							FramePageHelper.jumpInToFrame(seleniumUtil,FramePage.AC_SYS_RIGHT4);
							seleniumUtil.isContains(seleniumUtil.getText(AcHomeTaskPage.SQLMONITORING), SQLMONITORING);
							//跳回到父框架
							FramePageHelper.jumpParentFrame(seleniumUtil);
							logger.info("测试用例5[数据库监控]返回页面值成功");
						}else if(element.getText().equals("流量监控")){
							//进入框架
							FramePageHelper.jumpInToFrame(seleniumUtil,FramePage.AC_SYS_RIGHT5);
							seleniumUtil.isContains(seleniumUtil.getText(AcHomeTaskPage.FLOWMONITORING), FLOWMONITORING);
							//跳回到父框架
							FramePageHelper.jumpParentFrame(seleniumUtil);
							logger.info("测试用例5[数据库监控]返回页面值成功");
						}
						else{
							logger.info("没有返回页面和值");
						}
					
			
			}		
		}
		
		}
