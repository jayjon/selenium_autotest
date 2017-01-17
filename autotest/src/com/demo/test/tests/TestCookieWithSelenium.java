

package com.demo.test.tests;

import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import com.demo.test.pages.LoginPage;

import com.demo.test.utils.SeleniumUtil;

public class TestCookieWithSelenium{
	
	
	public static void main(String[] args) throws InterruptedException {
		
		SeleniumUtil seleniumUtil =new SeleniumUtil();
		String username="sysadmin";
		String password="venus.sysadmin";
		System.setProperty("webdriver.chrome.driver" , 
                "D:\\autoTestS\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://192.168.56.231:8888/ac/index.jsp");
        driver.findElement(By.xpath(".//*[@id='login-form']/ul/li[1]/div/input")).clear();  
        driver.findElement(By.xpath(".//*[@id='login-form']/ul/li[1]/div/input")).sendKeys(username);  
        driver.findElement(By.xpath(".//*[@id='login-form']/ul/li[2]/div/input")).clear();  
        driver.findElement(By.xpath(".//*[@id='login-form']/ul/li[2]/div/input")).sendKeys(password);  
        driver.findElement(By.xpath(".//*[@id='login-form']/div/button")).click();
	
// 必须先访问一次测试页面,程序自动创建一次cookie

		driver.manage().deleteAllCookies();

// 删除cookie里的内容

		Cookie ck = new Cookie("JSESSIONID", "F23E4064A60ADFF5691473FD04171540", "/ac/");

// 初始化已经保存了登录信息的cookie

		driver.manage().addCookie(ck);

// webdriver添加cookie

		driver.get("http://192.168.56.231:8888/ac/index.jsp");

// 下面才是正式测试开始,这次访问完后，就会发现已经登录成功了

		driver.manage().window().maximize();

		Thread.sleep(2000);

		Set<Cookie> cookies = driver.manage().getCookies();

		System.out.println(String.format("Domain -> name -> value -> expiry -> path"));

		for (Cookie c : cookies)

			System.out.println(String.format("%s -> %s -> %s -> %s -> %s", c.getDomain(), c.getName(), c.getValue(),

					c.getExpiry(), c.getPath()));
		//driver.get("http://192.168.56.231:8888/ac/index.jsp");
		driver.close();

		driver.quit();

	}

}
