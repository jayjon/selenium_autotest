package com.demo.test.pageshelper;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.demo.test.pages.FramePage;
import com.demo.test.pages.TraceHomePage;
import com.demo.test.utils.SeleniumUtil;

public class TraceHomePageHelper {
	//提供日志的监控
	public static Logger logger = Logger.getLogger(HomePageHelper.class);
	/**点击系统模块的左侧树方法
	 * @param timeOut 
	 * @param seleniumUtil */
	public static void inframe(SeleniumUtil seleniumUtil){
		//先进入左侧iframe
		FramePageHelper.jumpInToFrame(seleniumUtil,FramePage.TRACE_FNAME_SYSTEM);
		logger.info("进入系统左侧树结构成功");
	}
	public static void clinkSystem(SeleniumUtil seleniumUtil, int timeOut) {
		// TODO Auto-generated method stub
		seleniumUtil.click(TraceHomePage.TRACE_TEXT_SYSTEM);
		logger.info("点击系统模块成功");
		seleniumUtil.pause(3000);
		seleniumUtil.click(TraceHomePage.TRACE_TEXT_PEIZHI);
		logger.info("点击系统配置成功");
		inframe(seleniumUtil);
		List<WebElement> s =seleniumUtil.findElementsBy(TraceHomePage.TRACE_TEXT_TREE);
		for(int i=0;i<s.size();i++){
			WebElement	element = s.get(i);
			    HomePageHelper.isDiscover(seleniumUtil, element);
				System.out.println("####"+element.getText());
		}
    }
	public static void tagname(SeleniumUtil seleniumUtil, int timeOut){
		seleniumUtil.click(TraceHomePage.TRACE_TEXT_SYSTEM);
		logger.info("点击系统模块成功");
		seleniumUtil.pause(3000);
		seleniumUtil.click(TraceHomePage.TRACE_TEXT_PEIZHI);
		logger.info("点击系统配置成功");
		inframe(seleniumUtil);
		List<WebElement> s =seleniumUtil.findElementsBy(TraceHomePage.TRACE_TEXT_LEFTBUTTON);
		for(int i=0;i<s.size();i++){
			WebElement	element = s.get(i);
			//System.out.println("####"+element.getAttribute("id"));
			String stId =element.getAttribute("id");
			String stClass=element.getAttribute("class");
			if(element.getAttribute("id").endsWith("switch") && element.getAttribute("class").endsWith("close")){
				System.out.println("**"+stId+"^^"+stClass);
				seleniumUtil.click(By.id(stId));
				seleniumUtil.pause(2000);
				
			   }
	}
	
	}
	//找到所以的id
	public static void treebutton(SeleniumUtil seleniumUtil, int timeOut){
		
	}
}
