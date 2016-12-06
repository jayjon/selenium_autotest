package com.demo.test.pageshelper;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.demo.test.pages.AcHomeTaskPage;
import com.demo.test.pages.FramePage;
import com.demo.test.pages.HomePage;
import com.demo.test.utils.SeleniumUtil;
 
public class AcHomeTaskPageHelper {
	// 提供本类中日志输出对象
	public static Logger logger = Logger.getLogger(HomePageHelper.class);

	public static void checkTaskName(SeleniumUtil seleniumUtil, int timeOut, String Name) {
		//判断文本中是否包含文字
		logger.info("检查返回值文字" + Name);
		seleniumUtil.isContains(seleniumUtil.getText(AcHomeTaskPage.AC_TEXT_ADDFXTGROUPRETURNNAME), Name);
		
	}
	/**
	 * 发现模块下的任务组名称删除
	 * */
		public static void deleteFXTaskGroup(SeleniumUtil seleniumUtil, int timeOut, String ISDELETE) {
			// TODO Auto-generated method stub
			seleniumUtil.pause(2000);
			//判断任务组下是否有任务名称
			
			logger.info("开始点击删除按钮：");
			seleniumUtil.click(HomePage.AC_TEXT_DELETEGROUP);
			logger.info("开始检查当前文本："+ ISDELETE);
			seleniumUtil.isTextCorrect(seleniumUtil.getText(HomePage.AC_TEXT_DELETEGROUPWENBEN), ISDELETE);
			seleniumUtil.pause(2000);
			seleniumUtil.click(HomePage.AC_TEXT_DELETEGROUPWENBENQUEDINBUTTON);
			seleniumUtil.pause(2000);
			logger.info("删除成功...");
			
		}
		/**发现模块下的任务名称编辑*/
		public static void EDITFXTaskGROUP(SeleniumUtil seleniumUtil, int timeOut,String UPDATETASKNAME) {
			// TODO Auto-generated method stub
			seleniumUtil.pause(2000);
			logger.info("开始点击编辑按钮：");
			seleniumUtil.click(HomePage.AC_TEXT_EDITBUTTON);
			logger.info("开始获取当前输入框：");
			seleniumUtil.clear(HomePage.AC_TEXT_EDITINPUT);
			seleniumUtil.pause(2000);
			seleniumUtil.type(HomePage.AC_TEXT_EDITINPUT,UPDATETASKNAME);
			seleniumUtil.click(HomePage.AC_TEXT_EDITQEIDINGBUTTON);
			
			
		}
		/**发现模块下的新增任务组*/      
		@SuppressWarnings("static-access")
		public static void addFXTaskGroup(SeleniumUtil seleniumUtil, int timeOut,String NAME) {
			//验证是否在当前组下
			logger.info("开始检查当前组: "+ NAME);
			seleniumUtil.isTextCorrect(seleniumUtil.getText(HomePage.AC_TEXT_GROUPADD.linkText(NAME)),NAME);
			logger.info("检查当前组名为： "+ NAME);
			seleniumUtil.pause(2000);
			//拿到组下的tree子孙节点  循环
			 List<WebElement> s = seleniumUtil.findElementsBy(HomePage.AC_TEXT_GROUPADD);
	    	 for(int i=0;i<s.size();i++){
	    		 WebElement element =s.get(i);
	    		 isDiscover(seleniumUtil,element);
	    		 System.out.println("****"+element.getText());
	    		 //通过文本判断当前任务名称
	    		 if(element.getText().equals(NAME)){
	    			 //点击当前文本
	    			 seleniumUtil.click(HomePage.AC_TEXT_GROUPADD.linkText(NAME));
	    			 logger.info("点击当前添加任务组任务："+NAME+"成功");
	    			 seleniumUtil.pause(2000);
	    			 continue;
	        	 }
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
	
		/**添加任务*/
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
		/**
		添加任务组下的任务*/
		public static void addFXGroupTask(SeleniumUtil seleniumUtil, int timeOut,String ADDTEXT,String RIGHTTASKNAME,String SCANADDRESS,String CYCLETIME,String ERROR,String key) {
			// TODO Auto-generated method stub
			seleniumUtil.pause(2000);
			
			 logger.info("开始进入右侧iframe框架...");
			//先进入右侧iframe  为rightFrame
		     FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.AC_FNAME_FXRIGHTFRAME);
		     logger.info("进入框架完成。。。");
		     seleniumUtil.pause(2000);
		     logger.info("开始点击添加按钮...");
		     seleniumUtil.click(HomePage.AC_TEXT_ADDRIGHTBUTTON);
		     seleniumUtil.pause(3000);
		     //判断是否跳转到添加页面
		     logger.info("开始检查跳转界面是否是："+ ADDTEXT);
		     seleniumUtil.isTextCorrect(seleniumUtil.getText(HomePage.AC_TEXT_ADDTEXT), ADDTEXT);
		     logger.info("跳转界面是否是："+ ADDTEXT + "已在添加任务界面");
		     seleniumUtil.pause(3000);
		     logger.info("开始进入右侧iframe框架 的子框架...");
		     FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.AC_FNAME_ADDFXRIGHTTASKIFRAME);
		     logger.info("进入右侧iframe框架 的子框架完成");
		    
		      seleniumUtil.clear(HomePage.AC_TEXT_RIGHTTASKNAME);
		      seleniumUtil.type(HomePage.AC_TEXT_RIGHTTASKNAME,RIGHTTASKNAME);
		     
		     //检查单选按钮是否被勾选    
		   
		       isselecter(seleniumUtil,timeOut);
			   logger.info("######"+isselecter(seleniumUtil,timeOut).booleanValue());
			   logger.info("按钮已选");
			   if( isselecter(seleniumUtil,timeOut).booleanValue()==true){
				   logger.info("按钮已选是");
			   }else if(isselecter(seleniumUtil,timeOut).booleanValue()==false){
				   seleniumUtil.pause(3000);
				   seleniumUtil.click(HomePage.AC_TEXT_ISRADIOUPZERO);
			   }
			 
			   
		      //扫描地址填入192.168.19.1
		      seleniumUtil.clear(HomePage.AC_TEXT_SCANADDRESS);
		      seleniumUtil.type(HomePage.AC_TEXT_SCANADDRESS,SCANADDRESS);
		      seleniumUtil.pause(3000);
		     //判断是否周期
		      seleniumUtil.click(HomePage.AC_TEXT_CYCLEYES);
		      seleniumUtil.clear(HomePage.AC_TEXT_CYCLEINPUT);
		      seleniumUtil.pause(3000);
		      seleniumUtil.type(HomePage.AC_TEXT_CYCLEINPUT,CYCLETIME);
		      seleniumUtil.pause(3000);
		      //执行时间输入框
		      seleniumUtil.click(HomePage.AC_TEXT_EXCUTETIME);
		      seleniumUtil.pause(3000);
		      seleniumUtil.click(HomePage.AC_TEXT_NOWTIME);
		      seleniumUtil.pause(3000);
		      seleniumUtil.click(HomePage.AC_TEXT_WANCHENG);
		      seleniumUtil.pause(3000);
		      seleniumUtil.click(HomePage.AC_TEXT_BAOCUN);
		    /*  *//**如果界面任务名称弹出提示文字*//*
		      logger.info("开始检查该任务是否存在" + "......."+ERROR);
		      seleniumUtil.isTextCorrect(seleniumUtil.getText(AcHomeTaskPage.AC_TEXT_ERROR), ERROR);
		      logger.info("检查完毕" + ERROR);*/
		     }
		/**判断单选按钮是否被勾选*/
		public static Boolean isselecter(SeleniumUtil seleniumUtil, int timeOut){
		 return seleniumUtil.isSelected(seleniumUtil.findElementBy(HomePage.AC_TEXT_ISRADIOUPZERO));
		  
		    	 
		     }
		/**循环table下的行和列 分别输出*/
		public static void tabletr(SeleniumUtil seleniumUtil,String RIGHTTASKNAME){
			//通过tableid得到table的文本元素
			WebElement table = seleniumUtil.findElementBy(AcHomeTaskPage.AC_TEXT_TABLEID);
            //通过table的tr得到所有的行
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			//循环所有行
		    for(WebElement row:rows){
		    	//打印行id
		    	System.out.println("输出所有行tr的id的值"+row.getAttribute("id"));
		    	
		   //得到所有的行的列存放在list
		    	List<WebElement> cells = row.findElements(By.tagName("td"));
		    //循环所有列
		    for(WebElement cell:cells){
		    	
			    System.out.println("**********"+row.getAttribute("id")+"cell.getText()"+cell.getText()+"cell.getAttribute的id//"+cell.getAttribute("id")+"cell.getTagName()"+cell.getTagName());
			//判断 
			  String trid = row.getAttribute("id");
			    if( trid !=null && cell.getText().equals(RIGHTTASKNAME)){
			    	//public static final By AC_TEXT_=By.id("");
			    	seleniumUtil.click(By.id(trid));
			    	logger.info("点击成功:继续执行下一步操作");
			     
			    }
			
			    
		   }
		   
		   }

			
			

		}
		/**删除指定任务组下的任务
		 * @param element */
		public static void deleteFXGroupTask(SeleniumUtil seleniumUtil, int timeOut,String RIGHTTASKNAME) {
		    logger.info("暂停4秒钟后执行");
			seleniumUtil.pause(4000);
			logger.info("点击当前扫描任务....开始进入第一个iframe");
			//先进大iframe
			FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.FP_FRAME_ACBODY);// 先进入到bodyframe中
	 	    logger.info("第一个iframe成功");
			//进入右侧iframe  为rightFrame
		     FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.AC_FNAME_FXRIGHTFRAME);
		     logger.info("进入iframe成功");
		     seleniumUtil.pause(3000);
		     tabletr(seleniumUtil, RIGHTTASKNAME);
		     logger.info("******************");
			seleniumUtil.pause(3000);
			seleniumUtil.click(AcHomeTaskPage.AC_TEXT_DELFXTASK);
			seleniumUtil.pause(3000);
			seleniumUtil.click(AcHomeTaskPage.AC_TEXT_DELQUEREN);
			logger.info("删除成功。。。");
		}
		/**检查和点击发现模块下的组和任务名称*/
		public static void CheckClinkFxTask(SeleniumUtil seleniumUtil, int timeOut, String FAXIANPEIZHI, String NAME) {
			// TODO Auto-generated method stub
			logger.info("开始点击发现模块: "+ FAXIANPEIZHI);
			seleniumUtil.click(HomePage.HP_TEXT_FIND);
			logger.info("点击发现模块完毕: "+ FAXIANPEIZHI);
			try {
				Thread.sleep(2000);
			
				seleniumUtil.isTextCorrect(seleniumUtil.getText(HomePage.AC_TEXT_FAXIANPEIZHI), FAXIANPEIZHI);
			
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
		    		
		    		 //通过文本判断当前任务名称 如果有该名称就点击
		    		 if(NAME.equals(element.getText())){
		    			 //删除当前文本
		    			 seleniumUtil.click(HomePage.AC_TEXT_GROUPADD.linkText(NAME));
		    			 logger.info("开始检查当前文本："+ NAME);
		    			 seleniumUtil.pause(2000);
		    			 logger.info("点击成功...");
		    			  break;
		    			}else{
		    			 logger.info("点击失败...");
		    	        
		        	 }
		    		
		    		}	
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	    	
}      
		
/**直接删除任务*/
public static void deleteFXGroupTask1(SeleniumUtil seleniumUtil, int timeOut, String RIGHTTASKNAME) {
			   logger.info("暂停4秒钟后执行");
				seleniumUtil.pause(4000);
				//进入右侧iframe  为rightFrame
				logger.info("准备进入右侧iframe");
			     FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.AC_FNAME_FXRIGHTFRAME);
			     logger.info("进入iframe成功");
			     seleniumUtil.pause(3000);
			     tabletr(seleniumUtil, RIGHTTASKNAME);
			     logger.info("******************");
				seleniumUtil.pause(3000);
				seleniumUtil.click(AcHomeTaskPage.AC_TEXT_DELFXTASK);
				seleniumUtil.pause(3000);
				seleniumUtil.click(AcHomeTaskPage.AC_TEXT_DELQUEREN);
				logger.info("删除成功。。。");
			
		}
/** 编辑组下的任务名称*/
public static void EDITFXTaskName(SeleniumUtil seleniumUtil, int timeOut, String RIGHTTASKNAME,String UPDATERIGHTTASKNAME) {
	  logger.info("暂停4秒钟后执行");
		seleniumUtil.pause(4000);
		//进入右侧iframe  为rightFrame
		logger.info("准备进入右侧iframe");
	     FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.AC_FNAME_FXRIGHTFRAME);
	     logger.info("进入iframe成功");
	     seleniumUtil.pause(3000);
	    tabletr(seleniumUtil, RIGHTTASKNAME);
	    logger.info("******************");
		seleniumUtil.pause(3000);
		//点击编辑按钮
		seleniumUtil.click(AcHomeTaskPage.AC_TEXT_EDITFXTASKNAME);
		seleniumUtil.pause(3000);
		logger.info("点击编辑成功。。。");
	
	
}
public static void addFXGroupTaskPortScan(SeleniumUtil seleniumUtil, int timeOut,String ADDTEXT,String RIGHTTASKNAME,String SCANADDRESS,String CYCLETIME,String ERROR,String key,String PORT) {
	seleniumUtil.pause(2000);
	
	 logger.info("开始进入右侧iframe框架...");
	//先进入右侧iframe  为rightFrame
    FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.AC_FNAME_FXRIGHTFRAME);
    logger.info("进入框架完成。。。");
    seleniumUtil.pause(2000);
    logger.info("开始点击添加按钮...");
    seleniumUtil.click(HomePage.AC_TEXT_ADDRIGHTBUTTON);
    seleniumUtil.pause(3000);
    //判断是否跳转到添加页面
    logger.info("开始检查跳转界面是否是："+ ADDTEXT);
    seleniumUtil.isTextCorrect(seleniumUtil.getText(HomePage.AC_TEXT_ADDTEXT), ADDTEXT);
    logger.info("跳转界面是否是："+ ADDTEXT + "已在添加任务界面");
    seleniumUtil.pause(3000);
    logger.info("开始进入右侧iframe框架 的子框架...");
    FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.AC_FNAME_ADDFXRIGHTTASKIFRAME);
    logger.info("进入右侧iframe框架 的子框架完成");
   
     seleniumUtil.clear(HomePage.AC_TEXT_RIGHTTASKNAME);
     seleniumUtil.type(HomePage.AC_TEXT_RIGHTTASKNAME,RIGHTTASKNAME);
    
    //检查单选按钮是否被勾选    
  
      isselecter(seleniumUtil,timeOut);
	   logger.info("######"+isselecter(seleniumUtil,timeOut).booleanValue());
	   logger.info("按钮已选");
	   if( isselecter(seleniumUtil,timeOut).booleanValue()==true){
		   logger.info("按钮已选是");
	   }else if(isselecter(seleniumUtil,timeOut).booleanValue()==false){
		   seleniumUtil.pause(3000);
		   seleniumUtil.click(HomePage.AC_TEXT_ISRADIOUPZERO);
	   }
	 
	   
     //扫描地址填入192.168.19.1
     seleniumUtil.clear(HomePage.AC_TEXT_SCANADDRESS);
     seleniumUtil.type(HomePage.AC_TEXT_SCANADDRESS,SCANADDRESS);
     seleniumUtil.pause(3000);
     //任务类型
      seleniumUtil.click(HomePage.AC_TEXT_TASKTYPE);
     //扫描端口输入框
      seleniumUtil.clear(HomePage.AC_TEXT_INTPUTPORTSCAN);
      seleniumUtil.type(HomePage.AC_TEXT_INTPUTPORTSCAN,PORT);
      seleniumUtil.pause(3000);
     //判断是否周期
     seleniumUtil.click(HomePage.AC_TEXT_CYCLEYES);
     seleniumUtil.clear(HomePage.AC_TEXT_CYCLEINPUT);
     seleniumUtil.pause(3000);
     seleniumUtil.type(HomePage.AC_TEXT_CYCLEINPUT,CYCLETIME);
     seleniumUtil.pause(3000);
     //执行时间输入框
     seleniumUtil.click(HomePage.AC_TEXT_EXCUTETIME);
     seleniumUtil.pause(3000);
     seleniumUtil.click(HomePage.AC_TEXT_NOWTIME);
     seleniumUtil.pause(3000);
     seleniumUtil.click(HomePage.AC_TEXT_WANCHENG);
     seleniumUtil.pause(3000);
     seleniumUtil.click(HomePage.AC_TEXT_BAOCUN);
   /*  *//**如果界面任务名称弹出提示文字*//*
     logger.info("开始检查该任务是否存在" + "......."+ERROR);
     seleniumUtil.isTextCorrect(seleniumUtil.getText(AcHomeTaskPage.AC_TEXT_ERROR), ERROR);
     logger.info("检查完毕" + ERROR);*/
	
}
/**删除发现任务下的所有任务 */
public static void deleteFXGroupTaskAll(SeleniumUtil seleniumUtil, int timeOut, String string) {
	/*//点击按钮checbox按钮
	FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.FP_FRAME_ACBODY);// 先进入到bodyframe中
	    logger.info("第一个iframe成功");*/
	//进入右侧iframe  为rightFrame
     FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.AC_FNAME_FXRIGHTFRAME);
     logger.info("进入iframe成功");
	 seleniumUtil.pause(3000);
     seleniumUtil.click(HomePage.AC_TEXT_FIRSTCHECKBOX);
     seleniumUtil.isSelected(seleniumUtil.findElementBy(HomePage.AC_TEXT_FIRSTCHECKBOX));
     logger.info("复选框已选中");
     seleniumUtil.pause(3000);
     logger.info("准备开始点击删除按钮.....");
	seleniumUtil.click(AcHomeTaskPage.AC_TEXT_DELFXTASK);
	seleniumUtil.pause(3000);
	seleniumUtil.click(AcHomeTaskPage.AC_TEXT_DELQUEREN);
	logger.info("删除成功。。。");
     
}
/**只定位点击当前左侧菜单任务组*/
public static void CheckClinkFxTask1(SeleniumUtil seleniumUtil, int timeOut, String TASKGROUP) {
	seleniumUtil.pause(3000);
	logger.info("点击任务模块...");
	seleniumUtil.click(HomePage.HP_TEXT_FIND);
	seleniumUtil.pause(2000);
	FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.FP_FRAME_ACBODY);// 先进入到bodyframe中
	logger.info("进入左侧框架成功");
	seleniumUtil.isTextCorrect(seleniumUtil.getText(HomePage.AC_TEXT_TASKGROUP), TASKGROUP);
	seleniumUtil.click(HomePage.AC_TEXT_TASKGROUP);
	
}
		
}
		


