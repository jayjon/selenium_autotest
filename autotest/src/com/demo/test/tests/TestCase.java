package com.demo.test.tests;

import java.util.List;

import org.codehaus.plexus.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.test.base.BaseParpare;
import com.demo.test.pages.FramePage;
import com.demo.test.pages.HomePage;
import com.demo.test.pageshelper.FramePageHelper;
import com.demo.test.utils.SeleniumUtil;

/**
 * 
 */
public class TestCase {

	public static void main(String[] args) {
		 SeleniumUtil st = new SeleniumUtil();
		 WebElement element = null;
		 System.setProperty("webdriver.chrome.driver","E:\\autoTestS\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://192.168.56.231:8888/ac/index.jsp");
		  // 获取 网页的 title  
	     System.out.println("1 Page title is: " + driver.getTitle());
	     // 通过判断 title 内容等待搜索页面加载完毕，Timeout 设置10秒  
	        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {  
	            public Boolean apply(WebDriver d) {  
	                return d.getTitle().toLowerCase().endsWith("");  
	            }  
	        });  
	     //通过 id或name 找到 input 的 DOM 
		 //WebElement searchBox = driver.findElement(By.id("login-form"));
		 WebElement element1 = driver.findElement(By.name("infos:username"));
		 WebElement element2 = driver.findElement(By.name("infos:password"));
		 WebElement element3 = driver.findElement(By.name("redirect"));
		  System.out.println("11"+element1);
		  element1.clear();
		  element2.clear();
		  // 输入关键字  
		  element1.sendKeys("sysadmin"); 
		  element2.sendKeys("venus.sysadmin");	    
	    // 提交 input 所在的  form  
	    // element1.submit();  
	       element3.submit();
	       try {
			 Thread.sleep(3000);
			 WebElement element4 = driver.findElement(By.id("portal-acasset"));
			 element4.click();
			 Thread.sleep(3000);
			 //发现模块
			 WebElement element5 = driver.findElement(By.id("portal-acScanConfig"));
			 element5.click();
			 Thread.sleep(6000);
			 FramePageHelper.jumpInToFrame(st, FramePage.FP_FRAME_ACBODY);// 先进入到bodyframe中
		     //st.switchFrame(st.findElementBy(FramePage.FP_FRAME_ACBODY));
		     st.click(HomePage.AC_TEXT_ADDFXTASKGROUP);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	       
	     
	        // 显示搜索结果页面的 title  
	        //System.out.println("2 Page title is: " + driver.getTitle());  
	          
	     
		
		
		

	}

}
