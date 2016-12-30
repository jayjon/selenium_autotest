package com.demo.test.pageshelper;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.demo.test.pages.AcHomeSystemPage;
import com.demo.test.pages.AcHomeTaskPage;
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
	public static void clinkSystems(SeleniumUtil seleniumUtil, int timeOut,String lasttimebakup,String ARCHIVE_RESTORE,String AUTOGUIDANGZHOUQI,String SHOUQUANXINGXI,String ROUTEXINFXIPEIZHI,String ROUTEINTERFACEPEIZHI,String MAPPEIZHI) {
		// TODO Auto-generated method stub
		seleniumUtil.pause(2000);
		List<WebElement> s =seleniumUtil.findElementsBy(TraceHomePage.TRACE_TEXT_TREE);
		for(int i=0;i<s.size();i++){
			try {
				WebElement	element = s.get(i);
				 System.out.println("####"+element.getText()+"@@@"+element.getAttribute("id"));
					seleniumUtil.pause(1500);
					seleniumUtil.click(By.linkText(element.getText()));
					Boolean flag=true;
					if(flag=true){
						if(element.getText().equals("系统数据")){
				        	logger.info("测试点击“系统数据”后是否正常跳转到页面 且返回值正确");
							FramePageHelper.jumpInToFrame(seleniumUtil,FramePage.TRACE_FNAME_RIGHT);
							seleniumUtil.isTextCorrect(seleniumUtil.getText(TraceHomePage.LASTTIMEBAKUP), lasttimebakup);
							//跳转到父框架
							FramePageHelper.jumpParentFrame(seleniumUtil);
							logger.info("系统数据页面跳转成功"+lasttimebakup);
					    }else if(element.getText().equals("事件数据")){
					    
							logger.info("测试点击“事件数据”后是否正常跳转到页面 且返回值正确");
							seleniumUtil.pause(1500);
							FramePageHelper.jumpInToFrame(seleniumUtil,FramePage.TRACE_FNAME_RIGHT1);
							logger.info("进入框架成功");
							seleniumUtil.isTextCorrect(seleniumUtil.getText(TraceHomePage.ARCHIVE_RESTORE), ARCHIVE_RESTORE);
							//跳转到父框架
							FramePageHelper.jumpParentFrame(seleniumUtil);
							logger.info("事件数据页面跳转成功"+ARCHIVE_RESTORE);
					    }else if(element.getText().equals("数据维护")){
					    	logger.info("测试点击“数据维护”后是否正常跳转到页面 且返回值正确");
							seleniumUtil.pause(1500);
							FramePageHelper.jumpInToFrame(seleniumUtil,FramePage.TRACE_FNAME_RIGHT2);
							logger.info("进入框架成功");
							seleniumUtil.isTextCorrect(seleniumUtil.getText(TraceHomePage.AUTOGUIDANGZHOUQI), AUTOGUIDANGZHOUQI);
							//跳转到父框架
							FramePageHelper.jumpParentFrame(seleniumUtil);
							logger.info("事件数据页面跳转成功"+AUTOGUIDANGZHOUQI);
			
					        }else if(element.getText().equals("产品许可导入")){
					    	logger.info("测试点击“产品许可导入”后是否正常跳转到页面 且返回值正确");
							seleniumUtil.pause(1500);
							FramePageHelper.jumpInToFrame(seleniumUtil,FramePage.TRACE_FNAME_RIGHT3);
							logger.info("进入框架成功");
							seleniumUtil.isTextCorrect(seleniumUtil.getText(TraceHomePage.SHOUQUANXINGXI), SHOUQUANXINGXI);
							//跳转到父框架
							FramePageHelper.jumpParentFrame(seleniumUtil);
							logger.info("事件数据页面跳转成功:"+SHOUQUANXINGXI);
						
					    }else if(element.getAttribute("id").equals("tree_9_a") && element.getText().equals("路由信息配置")){
					    	logger.info("测试点击“路由器信息配置”后是否正常跳转到页面 且返回值正确");
					    	seleniumUtil.pause(1500);
							FramePageHelper.jumpInToFrame(seleniumUtil,FramePage.TRACE_FNAME_RIGHT6);
							logger.info("进入框架成功");
							seleniumUtil.isTextCorrect(seleniumUtil.getText(TraceHomePage.ROUTEXINFXIPEIZHI), ROUTEXINFXIPEIZHI);
							//跳转到父框架
							FramePageHelper.jumpParentFrame(seleniumUtil);
							logger.info("事件数据页面跳转成功:"+ROUTEXINFXIPEIZHI);
					    }else if(element.getText().equals("路由器接口配置") && element.getAttribute("class").equals("ico_docu")){
					    	logger.info("测试点击“路由器接口配置”后是否正常跳转到页面 且返回值正确");
					    	seleniumUtil.pause(1500);
							FramePageHelper.jumpInToFrame(seleniumUtil,FramePage.TRACE_FNAME_RIGHT4);
							logger.info("进入框架成功");
							seleniumUtil.isTextCorrect(seleniumUtil.getText(TraceHomePage.ROUTEINTERFACEPEIZHI), ROUTEINTERFACEPEIZHI);
							//跳转到父框架
							FramePageHelper.jumpParentFrame(seleniumUtil);
							logger.info("事件数据页面跳转成功:"+ROUTEINTERFACEPEIZHI);
					    }else if(element.getText().equals("地图属性配置") && element.getAttribute("class").equals("ico_docu")){
					    	logger.info("测试点击“地图属性配置”后是否正常跳转到页面 且返回值正确");
					    	seleniumUtil.pause(1500);
							FramePageHelper.jumpInToFrame(seleniumUtil,FramePage.TRACE_FNAME_RIGHT5);
							logger.info("进入框架成功");
							seleniumUtil.isTextCorrect(seleniumUtil.getText(TraceHomePage.MAPPEIZHI), MAPPEIZHI);
							//跳转到父框架
							FramePageHelper.jumpParentFrame(seleniumUtil);
							logger.info("事件数据页面跳转成功:"+MAPPEIZHI);
					    }
					}else{
						
                       logger.info("没有返回值");
					}
			
						
						
			} catch (Exception e) {
				// TODO: handle exception
			}
		
					
						
						
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
	
	public static void tagname1(SeleniumUtil seleniumUtil, int timeOut) {
		logger.info("");
		seleniumUtil.click(AcHomeSystemPage.HP_TEXT_SYSTEM);
		seleniumUtil.click(AcHomeSystemPage.HP_TEXT_SYSTEMMANGER);
		seleniumUtil.pause(3000);
		logger.info("开始进入iframe");
		FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.FP_FRAME_ACSYSBODY);// 先进入到bodyframe中
		logger.info("进入iframe成功");
		List<WebElement> s = seleniumUtil.findElementsBy(AcHomeTaskPage.AC_SYSTEM_LEFTBUTTON);
		for(int i=0;i<s.size();i++){
			WebElement  element= s.get(i);
		System.out.println("**"+ element.getAttribute("id"));
		String stId =element.getAttribute("id");
		String stClass=element.getAttribute("class");
		
		if(element.getAttribute("id").endsWith("switch") && element.getAttribute("class").endsWith("close")){
			System.out.println("**"+stId+"^^"+stClass);
			seleniumUtil.click(By.id(stId));
		}else{
			logger.info("按钮已经打开");
		}
		
		
	}
}
	}
