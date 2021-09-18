package com.bat.MutatedKhatian.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bat.MutatedKhatian.Utils.DriverManager;
import com.bat.MutatedKhatian.Utils.UrlTextUtils;
import com.bat.MutatedKhatian.Utils.XpathUtils;

public class JacaikariDeskTest {
	
private WebDriver driver = null;
	
	@Test
	public void loginTestTitleVerify() {
		
		driver = DriverManager.driver;
//		driver.manage().window().maximize();
//		driver.get(UrlTextUtils.Url.baseUrl);
		
		//home page title verify
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.Text.homePageTitle);
		
		System.out.println("Home page title verify successful");
		
	}

	@Test(dependsOnMethods = "loginTestTitleVerify")
	public void logintest() {
			
			System.out.println("Login Test Start");

			driver.findElement(By.id(XpathUtils.LoginModule.username)).sendKeys("imranoa777");
			driver.findElement(By.id(XpathUtils.LoginModule.password)).sendKeys("Imran@123+");
			driver.findElement(By.xpath(XpathUtils.LoginModule.submit)).click();

			System.out.println("Login Test End");
	}
	
	@Test(dependsOnMethods = "logintest")
	public void jacaikaritest() throws InterruptedException {
		
		System.out.println("Jacaikari Test Start");
			
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.JacaiKariDeskModule.খারিজ_খতিয়ান)).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(XpathUtils.JacaiKariDeskModule.যাচাই_এর_জন্য_অপেক্ষমাণ)).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(XpathUtils.JacaiKariDeskModule.বিস্তারিত)).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.JacaiKariDeskModule.বিস্তারিত_close)).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(XpathUtils.JacaiKariDeskModule.ওপেন)).click();
		
		
		
		String mainWindow=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> iteration= windows.iterator();
		
		while (iteration.hasNext()) {
			
			String secondWindow=iteration.next();
			if(!mainWindow.equalsIgnoreCase(secondWindow)) {
				driver.switchTo().window(secondWindow);
				//start second window
				Thread.sleep(2000);
				driver.findElement(By.xpath(XpathUtils.JacaiKariDeskModule.বিস্তারিত2)).click();
				
				Thread.sleep(3000);
				driver.findElement(By.xpath(XpathUtils.JacaiKariDeskModule.বিস্তারিত2_close)).click();
				
				
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(XpathUtils.JacaiKariDeskModule.সকল_তথ্য_যাচাই_করেছি)).click();
				
				
				
				Thread.sleep(5000);
				Select সিলেক্ট_স্টেটাস = new Select(driver.findElement(By.xpath(XpathUtils.JacaiKariDeskModule.সিলেক্ট_স্টেটাস)));
				সিলেক্ট_স্টেটাস.selectByValue("2");
				
				Thread.sleep(3000);
				Select সিলেক্ট_ডেস্ক = new Select(driver.findElement(By.xpath(XpathUtils.JacaiKariDeskModule.সিলেক্ট_ডেস্ক)));
				সিলেক্ট_ডেস্ক.selectByValue("2");
				
				Thread.sleep(1000);
				driver.findElement(By.xpath(XpathUtils.JacaiKariDeskModule.মন্তব্য)).sendKeys("abc");
				
				Thread.sleep(3000);
				driver.findElement(By.xpath(XpathUtils.JacaiKariDeskModule.প্রেরণ)).click();
				//end second window
				driver.close();
			}
			
			driver.switchTo().window(mainWindow);
	
		}
		
		System.out.println("Jacaikari Test End");
		    
	}
	
	@Test(dependsOnMethods = "jacaikaritest")
	public void logout() throws InterruptedException {
		
		System.out.println("Logout Test Start");
		
		Thread.sleep(5000);
		driver.get("https://troffice7.land.gov.bd/logout");
		
		System.out.println("Logout Test End");
	}
	
	
	

}
