package com.demo.test.pageshelper;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.demo.test.pages.AcHomeTaskPage;
import com.demo.test.pages.FramePage;
import com.demo.test.pages.HomePage;
import com.demo.test.utils.SeleniumUtil;

/**
 * @author Young
 * @desciption 首页帮助类：专门提供在这个页面进行操作的方法封装
 */
public class HomePageHelper {
	// 提供本类中日志输出对象
	public static Logger logger = Logger.getLogger(HomePageHelper.class);

	/**
	 * @author Young
	 * @description 等待首页元素加载
	 * @param seleniumUtil
	 *            selenium api封装引用对象
	 * @param timeOut
	 *            等待元素超时的时间
	 */
	public static void waitHomePageLoad(SeleniumUtil seleniumUtil, int timeOut) {
		FramePageHelper.jumpOut(seleniumUtil);
		logger.info("开始等待首页元素加载");
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_TEXT_TAIHE);
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_TEXT_ZICHAN);
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_TEXT_FIND);
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_TEXT_SYSTEM);
        logger.info("首页元素加载完毕");
		//FramePageHelper.jumpOut(seleniumUtil);
	}

	/**
	 * @author Young
	 * @Description 登录成功之后验证用户名是不是正确的
	 * 
	 * 
	 */
	public static void checkUserName(SeleniumUtil seleniumUtil, int timeOut, String username) {
	   
	    logger.info("开始检查用户名是不是：" + username);
		seleniumUtil.isTextCorrect(seleniumUtil.getText(HomePage.HP_TEXT_USERNAME), username);
		logger.info("用户名检查完毕,用户名是：" + username);
		logger.info("用户登录成功！！！");
	}
	/**
	 * @author Young
	 * @description 点击模块跳转成功之后验证首页内容
	 */
	public static void checkHomeErrorInfo(SeleniumUtil seleniumUtil, int timeOut,String ZCFILTER,String ZCTYPE) {
		// TODO Auto-generated method stub
		logger.info("开始检查模块菜单：" + ZCFILTER +""+ ZCTYPE);
		seleniumUtil.isTextCorrect(seleniumUtil.getText(HomePage.AC_TEXT_ZCFILTER),ZCFILTER);
		seleniumUtil.isTextCorrect(seleniumUtil.getText(HomePage.AC_TEXT_ZCTYPE),ZCTYPE);
		logger.info("检查模块完毕：" + ZCFILTER+ "和" + ZCTYPE);
		logger.info("当前是资产页面!!!");
		
	}

	public static void clinkHomeElement(SeleniumUtil seleniumUtil,int timeOut,String ZICHAN) {
		// TODO Auto-generated method stub
		logger.info("开始点击元素:"+ ZICHAN);
	    seleniumUtil.isTextCorrect(seleniumUtil.getText(HomePage.HP_TEXT_ZICHAN),ZICHAN);
	    seleniumUtil.click(HomePage.HP_TEXT_ZICHAN);
	    try {
			Thread.sleep(timeOut);
			seleniumUtil.click(HomePage.HP_TEXT_FIND);
			Thread.sleep(3000);
			seleniumUtil.click(HomePage.HP_TEXT_ZHIWEN);
			Thread.sleep(3000);
			seleniumUtil.click(HomePage.HP_TEXT_SYSTEM);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	   
		logger.info("点击元素完毕:"+ ZICHAN);
		
	}
	public boolean rMethod(SeleniumUtil seleniumUtil,String NAME){
		if(NAME.equals(seleniumUtil.getText(HomePage.AC_TEXT_FAXIANPEIZHI)))
		     return true;
	
		else{
			return false;
		}
	}
		
	

   //点击跳转到发现页面 
	public static void clinkHomeFXElement(SeleniumUtil seleniumUtil, int timeOut,String FAXIANPEIZHI,String NAME,String ISDELETE) {
		
		// TODO Auto-generated method stub
		logger.info("开始点击发现模块: "+ FAXIANPEIZHI);
		seleniumUtil.click(HomePage.HP_TEXT_FIND);
		
		try {
			Thread.sleep(2000);
			seleniumUtil.isTextCorrect(seleniumUtil.getText(HomePage.AC_TEXT_FAXIANPEIZHI), FAXIANPEIZHI);
			logger.info("点击发现模块完毕: "+ FAXIANPEIZHI);
			Thread.sleep(3000);
			FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.FP_FRAME_ACBODY);// 先进入到bodyframe中
			logger.info("进入frame成功");
			logger.info("开始检查当前组: " + NAME);
			//seleniumUtil.isTextCorrect(seleniumUtil.getText(HomePage.AC_TEXT_GROUPADD.linkText(NAME)),NAME);
			logger.info("检查当前组名为： "+ NAME);
			seleniumUtil.pause(2000);
			//拿到组下的tree子孙节点  循环
			 List<WebElement> s = seleniumUtil.findElementsBy(HomePage.AC_TEXT_GROUPADD);
	    	 for(int i=0;i<s.size();i++){
	    		 WebElement element =s.get(i);
	    		 isDiscover(seleniumUtil,element);
	    		 System.out.println("****"+element.getText());
	    		
	    		 //通过文本判断当前任务名称 如果有该名称就删除
	    		 if(NAME.equals(element.getText())){
	    			 //删除当前文本
	    			 seleniumUtil.click(HomePage.AC_TEXT_GROUPADD.linkText(NAME));
	    			 logger.info("开始检查当前文本："+ NAME);
	    			 seleniumUtil.click(HomePage.AC_TEXT_DELETEGROUP);
	    			 seleniumUtil.pause(2000);
	    			// seleniumUtil.isTextCorrect(seleniumUtil.getText(HomePage.AC_TEXT_DELETEGROUPWENBEN), ISDELETE);
	    			 seleniumUtil.pause(2000);
	    			 seleniumUtil.click(HomePage.AC_TEXT_DELETEGROUPWENBENQUEDINBUTTON);
	    			 seleniumUtil.pause(2000);
	    			 logger.info("删除成功...");
	    		     logger.info("重新添加任务名称 开始点击添加按钮...");
	    			// AcHomeTaskPageHelper.addtaskName(seleniumUtil, timeOut, NAME);
	    			  break;
	    			}else{
	    			logger.info("开始添加任务...");
	    			//添加方
	    	        
	        	 }
	    		
	    		}	
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}   
	
	public static void addtaskName(SeleniumUtil seleniumUtil, int timeOut,String NAME){
		logger.info("开始点击添加按钮...");
		seleniumUtil.click(HomePage.AC_TEXT_ADDFXTASKGROUP);
		logger.info("开始输入名称：" + NAME );
		seleniumUtil.clear(HomePage.AC_TEXT_ADDFXTGROUPNAME);
		seleniumUtil.type(HomePage.AC_TEXT_ADDFXTGROUPNAME,NAME);
		seleniumUtil.clear(HomePage.AC_TEXT_ADDFXTGROUPDES);
		logger.info("开始输入名称：" + NAME + "完成");
		seleniumUtil.click(HomePage.AC_TEXT_ADDBUTTON);
		seleniumUtil.pause(2000);
	  //点击当前文本
	  seleniumUtil.click(HomePage.AC_TEXT_GROUPADD.linkText(NAME));
	  logger.info("点击当前添加任务组任务："+NAME+"成功");
	  seleniumUtil.pause(2000);

	}
      
   /**设置隐藏的元素 让其显示*/
	public static void isDiscover(SeleniumUtil seleniumUtil,WebElement element) {
		// TODO Auto-generated method stub
		if(seleniumUtil.isDisplayed(element)==false){
			//调用js方法打开树
			logger.info("执行js方法");
			seleniumUtil.executeJS("$('ul').css('display','block)'");
			}
		else{
			System.out.println("树结构已展开....");
		}
	}

	


	/**
	 * @author Young
	 * @description 登录成功之后验证首页的文本内容
	 */
	/*public static void checkHomeText(SeleniumUtil seleniumUtil) {
		FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.FP_FRAME_BODY);// 先进入到body
																				
		FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.FP_FRAME_INFO);// 先进入到body
																				// frame中的子frame:info
																				// frame中
		seleniumUtil.isTextCorrect(seleniumUtil.getText(HomePage.HP_TEXT_HOME),
				"Welcome, jojo, to the Web Tours reservation pages." + "\n"
						+ "Using the menu to the left, you can search for new flights to book, or review/edit the flights already booked. Don't forget to sign off when you're done!");

	}*/


}