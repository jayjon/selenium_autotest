package com.demo.test.pageshelper;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.demo.test.pages.AcHomeSystemPage;
import com.demo.test.pages.FramePage;
import com.demo.test.pages.HomePage;
import com.demo.test.utils.SeleniumUtil;

public class AcHomeSystemPageHelper {
	// 提供本类中日志输出对象
		public static Logger logger = Logger.getLogger(HomePageHelper.class);

		public static void checkclinkHome(SeleniumUtil seleniumUtil, int timeOut) {
			seleniumUtil.addCookies1(3000);
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
}
