package com.demo.test.tests;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCookie1 {  
          
        /** 
         * 获取cookie 
         * @param username 
         * @param password 
         * @return 
         * @throws InterruptedException 
         */  
        public static Set<Cookie> click(String username,String password) throws InterruptedException{  
              
        	System.setProperty("webdriver.chrome.driver" , 
                    "D:\\autoTestS\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://192.168.56.231:8888/ac/index.jsp");
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
            //Thread.sleep(1000*8);  
            driver.findElement(By.xpath(".//*[@id='login-form']/ul/li[1]/div/input")).clear();  
            driver.findElement(By.xpath(".//*[@id='login-form']/ul/li[1]/div/input")).sendKeys(username);  
            driver.findElement(By.xpath(".//*[@id='login-form']/ul/li[2]/div/input")).clear();  
            driver.findElement(By.xpath(".//*[@id='login-form']/ul/li[2]/div/input")).sendKeys(password);  
            driver.findElement(By.xpath(".//*[@id='login-form']/div/button")).click();  
      
            Thread.sleep(1000*10);  
      
            Set<Cookie> cookies = driver.manage().getCookies();  
              
            System.out.println("Cookie.size = " + cookies.size());  
              
            driver.close();  
      
            return cookies;  
        }  
      
    }  


