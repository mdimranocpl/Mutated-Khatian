package com.bat.MutatedKhatian.Test;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bat.MutatedKhatian.Utils.DriverManager;
import com.bat.MutatedKhatian.Utils.UrlTextUtils;
import com.bat.MutatedKhatian.Utils.XpathUtils;

public class EntrykariDeskTest {
	
	private WebDriver driver = null;
	
	@Test
	public void loginTestTitleVerify() {
		
		driver = DriverManager.driver;
		driver.manage().window().maximize();
		driver.get(UrlTextUtils.Url.baseUrl);
		
		//home page title verify
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.Text.homePageTitle);
		
		System.out.println("Home page title verify successful");
		
	}

	@Test(dependsOnMethods = "loginTestTitleVerify")
	public void logintest() {
			
			System.out.println("Login Test Start");

			driver.findElement(By.id(XpathUtils.LoginModule.username)).sendKeys("imrandeo777");
			driver.findElement(By.id(XpathUtils.LoginModule.password)).sendKeys("Imran@123+");
			driver.findElement(By.xpath(XpathUtils.LoginModule.submit)).click();

			System.out.println("Login Test End");
	}
	
	@Test(dependsOnMethods = "logintest")
	public void khatianEntry() throws InterruptedException {
			
		    System.out.println("Khatian Entry Test Start");
			//goto form
			Thread.sleep(3000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.খারিজ_খতিয়ান)).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.নতুন_এন্ট্রি)).click();
			//goto form
			
			//খতিয়ান এন্ট্রি
			
			//খতিয়ানের মালিকের তথ্যাদি এন্ট্রি করুন
			
			//মৌজা
			Thread.sleep(3000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.মৌজা)).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.মৌজা_search)).sendKeys("চক দর্শনপাড়া"+ Keys.ENTER);
			
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.খতিয়ান_নং)).sendKeys("200");
			
			//handle error
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.রে_সা_নং)).click();
			Thread.sleep(2000);
			String actual_msg=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[1]/div[1]/div[1]/div[5]/div/label[2]/small")).getText();
			String expect="এই মৌজায় উক্ত খতিয়ানটি এন্ট্রি করা হয়েছে";
			Thread.sleep(2000);
			Assert.assertEquals(actual_msg, expect);
			Thread.sleep(2000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.খতিয়ান_নং)).clear();   
			Random random = new Random();
			int rand_num = random.nextInt(100);  
			Thread.sleep(2000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.খতিয়ান_নং)).sendKeys(Integer.toString(rand_num));
			//handle error
			
			Thread.sleep(3000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.রে_সা_নং)).sendKeys("10");
			Thread.sleep(2000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.নামজারী_মামলা_নম্বর)).sendKeys("101");
			
			//মালিক1
			Thread.sleep(3000);
			Select মালিকের_ধরণ = new Select(driver.findElement(By.id(XpathUtils.EntryKariDeskModule.মালিকের_ধরণ)));
			মালিকের_ধরণ.selectByValue("1");
			
			
			Thread.sleep(2000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.মালিক_অকৃষি_প্রজা_বা_ইজারাদারের_নাম)).clear();
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.মালিক_অকৃষি_প্রজা_বা_ইজারাদারের_নাম)).sendKeys("মালিক_অকৃষি_প্রজা_বা_ইজারাদারের_নাম");
			

			Thread.sleep(1000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.পিতা)).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.স্বামী)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.পিতা)).click();
			
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.পিতা_or_স্বামী_name)).clear();
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.পিতা_or_স্বামী_name)).sendKeys("পিতা");
			
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.মাতার_নাম)).clear();
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.মাতার_নাম)).sendKeys("মাতার_নাম");
			
			
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.অংশ)).sendKeys("0.5");
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.রাজস্ব)).sendKeys("2");
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.গ্ৰুপ)).sendKeys("3");
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.মোবাইল_নম্বর)).sendKeys("01763732521");
			
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.ঠিকানা)).clear();
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.ঠিকানা)).sendKeys("ঠিকানা");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.পরিচয়ের_ধরণ)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.পরিচয়ের_ধরণ_search)).sendKeys("জাতীয় পরিচয় পত্র নম্বর"+ Keys.ENTER);
			
			Thread.sleep(2000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.পরিচয়ের_নম্বর)).sendKeys("19928714713000225");
			
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.জন্ম_তারিখ)).clear();
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.জন্ম_তারিখ)).sendKeys("19-09-2010");
			//মালিক1
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.আরও_button)).click();
			
			//মালিক2
			Thread.sleep(3000);
			Select মালিকের_ধরণ2 = new Select(driver.findElement(By.id(XpathUtils.EntryKariDeskModule.মালিকের_ধরণ)));
			মালিকের_ধরণ2.selectByValue("1");
			
			
			Thread.sleep(2000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.মালিক_অকৃষি_প্রজা_বা_ইজারাদারের_নাম)).clear();
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.মালিক_অকৃষি_প্রজা_বা_ইজারাদারের_নাম)).sendKeys("মালিক_অকৃষি_প্রজা_বা_ইজারাদারের_নাম");
			

			Thread.sleep(1000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.পিতা)).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.স্বামী)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.পিতা)).click();
			
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.পিতা_or_স্বামী_name)).clear();
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.পিতা_or_স্বামী_name)).sendKeys("পিতা");
			
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.মাতার_নাম)).clear();
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.মাতার_নাম)).sendKeys("মাতার_নাম");
			
			
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.অংশ)).sendKeys("0.5");
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.রাজস্ব)).sendKeys("2");
			
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.গ্ৰুপ)).clear();
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.গ্ৰুপ)).sendKeys("3");
			
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.মোবাইল_নম্বর)).sendKeys("01763732521");
			
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.ঠিকানা)).clear();
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.ঠিকানা)).sendKeys("ঠিকানা");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.পরিচয়ের_ধরণ)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.পরিচয়ের_ধরণ_search)).sendKeys("জাতীয় পরিচয় পত্র নম্বর"+ Keys.ENTER);
			
			Thread.sleep(2000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.পরিচয়ের_নম্বর)).sendKeys("19928714713000225");
			
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.জন্ম_তারিখ)).clear();
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.জন্ম_তারিখ)).sendKeys("19-09-2010");
			//মালিক 2
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.সংরক্ষণ_করে_দাগ_এন্ট্রি_করুন_button)).click();
			
			
			
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]")).click();

			
			
//			Thread.sleep(3000);
//			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.সম্পাদনা_button)).click();
//
//			
//			Thread.sleep(2000);
//			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.অংশ)).sendKeys("0.5");
//
//			
//			Thread.sleep(2000);
//			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.আরও_button)).click();

			
//			Thread.sleep(3000);
//			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.মুছে_ফেলুন_button)).click();
			
			//দাগ সম্পর্কিত তথ্যাদি এন্ট্রি করুন
			//দাগ 1
			Thread.sleep(3000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.দাগ_নং)).sendKeys("22");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.কৃষি_জমির_শ্রেণি)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.কৃষি_জমির_শ্রেণি_search)).sendKeys("বাড়ী"+ Keys.ENTER);
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.মন্তব্য)).sendKeys("মন্তব্য");
			
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.দাগে_মোট_জমির_পরিমাণ)).sendKeys("200");
			
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.দাগে_অংশ)).sendKeys("0.5");
			//দাগ 1
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.আরও_dag_button)).click();
			
			//দাগ 2
			Thread.sleep(3000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.দাগ_নং)).sendKeys("22");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.কৃষি_জমির_শ্রেণি)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.কৃষি_জমির_শ্রেণি_search)).sendKeys("বাড়ী"+ Keys.ENTER);
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]")).click();

			Thread.sleep(2000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.মন্তব্য)).sendKeys("মন্তব্য");
			
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.দাগে_মোট_জমির_পরিমাণ)).sendKeys("200");
			
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.দাগে_অংশ)).sendKeys("0.5");
			//দাগ 2
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.দাগ_সংরক্ষণ_করুন_button)).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.দাগ_সম্পাদনা_button)).click();
			
			Thread.sleep(2000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.দাগ_নং)).clear();
			Thread.sleep(1000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.দাগ_নং)).sendKeys("23");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.দাগ_সংরক্ষণ_করুন_button)).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.দাগ_মুছে_ফেলুন_button)).click();
			
			//স্বাক্ষরিত -১
			Thread.sleep(2000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.স্বাক্ষরিত_1_নাম)).sendKeys("স্বাক্ষরিত_1_নাম");
			
			Thread.sleep(2000);
			driver.findElement(By.name(XpathUtils.EntryKariDeskModule.স্বাক্ষরিত_1_তারিখ)).sendKeys("08-09-2021");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.স্বাক্ষরিত_1_পদবী)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.স্বাক্ষরিত_1_পদবী_search)).sendKeys("ইউনিয়ন ভূমি সহকারী কর্মকর্তা"+ Keys.ENTER);
			
			//স্বাক্ষরিত -২
			Thread.sleep(2000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.স্বাক্ষরিত_2_নাম)).sendKeys("স্বাক্ষরিত_2_নাম");
			
			Thread.sleep(2000);
			driver.findElement(By.name(XpathUtils.EntryKariDeskModule.স্বাক্ষরিত_2_তারিখ)).sendKeys("08-09-2021");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.স্বাক্ষরিত_2_পদবী)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.স্বাক্ষরিত_2_পদবী_search)).sendKeys("কানুনগো"+ Keys.ENTER);
			
			
			//স্বাক্ষরিত -৩
			Thread.sleep(2000);
			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.স্বাক্ষরিত_3_নাম)).sendKeys("স্বাক্ষরিত_3_নাম");
			
			Thread.sleep(2000);
			driver.findElement(By.name(XpathUtils.EntryKariDeskModule.স্বাক্ষরিত_3_তারিখ)).sendKeys("08-09-2021");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.স্বাক্ষরিত_3_পদবী)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.স্বাক্ষরিত_3_পদবী_search)).sendKeys("সহকারী কমিশনার (ভূমি)"+ Keys.ENTER);
			
			
			//পূর্ববর্তী খতিয়ান সম্পর্কিত তথ্য
			Thread.sleep(2000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.রেফারেন্স_খতিয়ান_নং_1)).sendKeys("44");
			
			Thread.sleep(2000);
			Select old_খতিয়ান_type_1 = new Select(driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.old_খতিয়ান_type_1)));
			old_খতিয়ান_type_1.selectByValue("4");
			
//			Thread.sleep(4000);
//			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.old_খতিয়ান_addmore_button)).click();
//			
//			Thread.sleep(2000);
//			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.রেফারেন্স_খতিয়ান_নং_2)).sendKeys("45");
//			
//			Thread.sleep(2000);
//			Select old_খতিয়ান_type_2 = new Select(driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.old_খতিয়ান_type_2)));
//			old_খতিয়ান_type_2.selectByValue("4");
			
			Thread.sleep(3000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.সর্বশেষ_খতিয়ান_সংযুক্ত_করুন)).sendKeys("C:\\Users\\pc\\Desktop\\data\\test.pdf");
			
			
			
//			Thread.sleep(5000);
//			driver.findElement(By.id(XpathUtils.EntryKariDeskModule.খসড়া_করুন)).click();
			

			//ড্যাশবোর্ড
			Thread.sleep(5000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.ড্যাশবোর্ড)).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.খসড়া_list)).click();
			
			//খসড়াকৃত খতিয়ানের তালিকা
			Thread.sleep(2000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.খসড়া_বিস্তারিত)).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.খসড়া_বিস্তারিত_close)).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.খসড়া_সম্পাদন)).click();
			
			//খতিয়ান সম্পাদন
//			Thread.sleep(5000);
//			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.খসড়া_দাখিল_করুন)).click();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.ড্যাশবোর্ড)).click();
			
			//মোট এন্ট্রি 
			Thread.sleep(3000);
			driver.findElement(By.xpath(XpathUtils.EntryKariDeskModule.মোট_এন্ট্রি)).click();

			System.out.println("Khatian Entry Test End");
	}
	
	@Test(dependsOnMethods = "khatianEntry")
	public void logout() throws InterruptedException {
		
		System.out.println("Logout Test Start");
//		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(XpathUtils.LogoutModule.user_icon)).click();
//		
//		System.out.println("first click");
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(XpathUtils.LogoutModule.এল_আই_এস_এফ_এ_ফিরুন)).click();
//		
//		System.out.println("second click");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(XpathUtils.LogoutModule.user_name)).click();
//		
//		System.out.println("third click");
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(XpathUtils.LogoutModule.logout)).click();
		
		Thread.sleep(5000);
		driver.get("https://troffice7.land.gov.bd/logout");
		
		System.out.println("Logout Test End");
	}
	
	

}
