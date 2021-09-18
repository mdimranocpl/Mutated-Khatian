//package com.bat.MutatedKhatian.Test;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import com.bat.MutatedKhatian.Utils.DriverManager;
//import com.bat.MutatedKhatian.Utils.UrlTextUtils;
//import com.bat.MutatedKhatian.Utils.XpathUtils;
//
//public class LoginTest {
//	
//private WebDriver driver = null;
//	
//	@Test
//	public void loginTestTitleVerify() {
//		
//		driver = DriverManager.driver;
//		driver.get(UrlTextUtils.Url.baseUrl);
//		
//		//home page title verify
//		Assert.assertEquals(driver.getTitle(), UrlTextUtils.Text.homePageTitle);
//		
//		System.out.println("Home page title verify successful");
//		
//	}
//
//	@Test(dependsOnMethods = "loginTestTitleVerify")
//	public void logintest() {
//			
//			int i=1;
//		
//			if(i==1) {	
//				//User 1 (এন্ট্রিকারী) login
//				driver.findElement(By.id(XpathUtils.LoginModiule.username)).sendKeys("imrandeo777");
//				driver.findElement(By.id(XpathUtils.LoginModiule.password)).sendKeys("Imran@123+");
//				driver.findElement(By.xpath(XpathUtils.LoginModiule.submit)).click();
//				i++;
//			}else if(i==2) {				
//				//User 2 (যাচাইকারী) login
//				driver.findElement(By.id(XpathUtils.LoginModiule.username)).sendKeys("imranoa777");
//				driver.findElement(By.id(XpathUtils.LoginModiule.password)).sendKeys("Imran@123+");
//				driver.findElement(By.xpath(XpathUtils.LoginModiule.submit)).click();
//				i++;
//			}else if(i==3) {
//				//User 3 (তুলনাকারী) login
//				driver.findElement(By.id(XpathUtils.LoginModiule.username)).sendKeys("imrank777");
//				driver.findElement(By.id(XpathUtils.LoginModiule.password)).sendKeys("Imran@123+");
//				driver.findElement(By.xpath(XpathUtils.LoginModiule.submit)).click();
//				i++;
//			}else if(i==4) {
//				//User 4 (অনুমোদনকারী) login
//				driver.findElement(By.id(XpathUtils.LoginModiule.username)).sendKeys("imranacland777");
//				driver.findElement(By.id(XpathUtils.LoginModiule.password)).sendKeys("Imran@123+");
//				driver.findElement(By.xpath(XpathUtils.LoginModiule.submit)).click();			
//			}else {
//				
//			}
//			
//		
//			System.out.println("User "+i+" Login Successful");
//	}
//
//}
