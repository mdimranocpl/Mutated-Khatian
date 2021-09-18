package com.bat.MutatedKhatian.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	
	//	static {
	//	System.setProperty("webdriver.gecko.driver","D:\\Work\\Office\\OCPL\\Learning\\Selenuim\\Selenium WebDriver\\tools\\browser driver 64 bit\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	//}
	//
	//public static WebDriver driver = new FirefoxDriver();
	
	static {
		System.setProperty("webdriver.chrome.driver","D:\\Work\\Office\\OCPL\\Learning\\Selenuim\\Selenium WebDriver\\tools\\browser driver 64 bit\\chromedriver_win32\\chromedriver.exe");
	}
	
	public static WebDriver driver = new ChromeDriver();
	
	
	DriverManager() {
	
	}


}
