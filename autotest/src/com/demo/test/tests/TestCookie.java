package com.demo.test.tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCookie {

	public static void main(String[] args) throws InterruptedException {
		selecookie();
		addcookie();
		cookielogin();
         }
           
            
	//获取cookie
	public static void selecookie(){
		System.setProperty ( "webdriver.chrome.driver" , 
                "E:\\autoTestS\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("http://192.168.56.231:8888/ac/index.jsp");
    
        //这两句不能省略
        WebElement element=driver.findElement(By.xpath(".//*[@id='central']"));
        element.click();
        Set<Cookie> cookies=driver.manage().getCookies();
        
        System.out.println("cookie总数为"+cookies.size());
        
        for(Cookie cookie:cookies){
        	 System.out.println("作用域："+cookie.getDomain()+", 名称："+cookie.getName()+
                     ", 值："+cookie.getValue()+", 范围："+cookie.getPath()+
                     ", 过期时间"+cookie.getExpiry());
         try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         driver.quit();   
         }   
         //System.out.println(driver.manage().getCookieNamed("name"));
	}
	//添加cookie
	public static void addcookie(){
		System.setProperty ( "webdriver.chrome.driver" , 
                "E:\\autoTestS\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("http://192.168.56.231:8888/ac/index.jsp");
	    
	        //这两句不能省略
          WebElement element=driver.findElement(By.xpath(".//*[@id='central']"));
          element.click();
	        
	        Cookie cookie=new Cookie("java","eclipse","/",null);
	        driver.manage().addCookie(cookie);
	 
	        System.out.println(driver.manage().getCookieNamed("java"));
	        
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        driver.quit();      
	        }
	//做登陆准备
	 public static void cookielogin(){
		  System.setProperty ( "webdriver.chrome.driver" , 
	                "E:\\autoTestS\\chromedriver_win32\\chromedriver.exe" );
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://192.168.56.231:8888/ac/index.jsp");
	        driver.manage().deleteAllCookies();
	        Cookie cookie=new Cookie("username","sysadmin","/",null);
	        driver.manage().addCookie(cookie);
	        Cookie cookie1=new Cookie("password","venus.sysadmin","/",null);
	        driver.manage().addCookie(cookie1);
	        driver.get("http://192.168.56.231:8888/ac/index.jsp");
	        System.out.println("登陆成功");
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      // driver.quit();      
	 }
	}


	
