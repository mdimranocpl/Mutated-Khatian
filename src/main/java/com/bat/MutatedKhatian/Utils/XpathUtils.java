package com.bat.MutatedKhatian.Utils;

public class XpathUtils {
	
	public static class LoginModule {

		public static final String username = "username"; //id
		public static final String password = "password"; //id
		public static final String submit = "/html/body/div[3]/div[2]/form[1]/div[4]/button";
		
	}
	
	public static class EntryKariDeskModule {

		//go to new entry form
		public static final String খারিজ_খতিয়ান = "/html/body/div[3]/div[1]/div/ul/li[6]/a"; 
		public static final String নতুন_এন্ট্রি = "/html/body/div[3]/div[2]/div/div[3]/div[1]/div/a/div/div[2]/div/i"; 
		//go to new entry form
		
		
		
		//খতিয়ানের মালিকের তথ্যাদি এন্ট্রি করুন
		public static final String মৌজা = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[1]/div[1]/div[1]/div[4]/div/span/span[1]/span/span[1]"; 
		public static final String মৌজা_search = "/html/body/span/span/span[1]/input"; 
		public static final String খতিয়ান_নং = "khatian_no"; //id
		public static final String রে_সা_নং = "reg_sarok_no"; //id
		public static final String নামজারী_মামলা_নম্বর = "namjari_case_no"; //id
		public static final String মালিকের_ধরণ = "owner_type_id"; //id
		public static final String মালিক_অকৃষি_প্রজা_বা_ইজারাদারের_নাম = "name"; //id
		public static final String পিতা = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[1]/div[2]/div/div/div[1]/div/div[4]/label/div/label[1]/div/span/input"; 
		public static final String স্বামী = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[1]/div[2]/div/div/div[1]/div/div[4]/label/div/label[2]/div/span"; 
		public static final String পিতা_or_স্বামী_name = "guardian"; //id
		public static final String মাতার_নাম = "mother_name"; //id
		public static final String অংশ = "portion"; //id
		public static final String রাজস্ব = "revenue"; //id
		public static final String গ্ৰুপ = "group_no"; //id
		public static final String মোবাইল_নম্বর = "mobile_number"; //id
		public static final String ঠিকানা = "address"; //id
		public static final String পরিচয়ের_ধরণ = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[1]/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/span/span[1]/span/span[1]"; 
		public static final String পরিচয়ের_ধরণ_search = "/html/body/span/span/span[1]/input";
		
		public static final String পরিচয়ের_নম্বর = "identity_value"; //id
		public static final String জন্ম_তারিখ = "date_of_birth"; //id
		public static final String আরও_button = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[1]/div[2]/div/div/div[3]/div/button[1]"; 
		public static final String সংরক্ষণ_করে_দাগ_এন্ট্রি_করুন_button = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[1]/div[2]/div/div/div[3]/div/button[2]"; 
		
		public static final String সম্পাদনা_button = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[2]/div/div/div/table/tbody/tr[1]/td[10]/button[1]"; 
		public static final String মুছে_ফেলুন_button = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[2]/div/div/div/table/tbody/tr/td[10]/button[2]"; 

		//দাগ সম্পর্কিত তথ্যাদি এন্ট্রি করুন
		public static final String দাগ_নং = "dag_no"; //id
		public static final String কৃষি_জমির_শ্রেণি = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div/span/span[1]/span/span[1]"; //id
		public static final String কৃষি_জমির_শ্রেণি_search = "/html/body/span/span/span[1]/input"; 
		public static final String অকৃষি_জমির_শ্রেণি = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div/span/span[1]/span/span[1]"; 
		public static final String অকৃষি_জমির_শ্রেণি_search = "/html/body/span/span/span[1]/input"; 
		public static final String মন্তব্য = "dokhol_sotto_montobbo"; //id
		public static final String দাগে_মোট_জমির_পরিমাণ = "dager_mot_poriman_sotansho"; //id
		public static final String দাগে_অংশ = "dage_otro_khatianer_onso"; //id
		public static final String অংশানুযায়ী_জমির_পরিমাণ = "ongso_onujayi_jomir_poriman"; //id
		public static final String আরও_dag_button = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[3]/div[2]/div[1]/div[3]/div/div/button[1]";
		public static final String দাগ_সংরক্ষণ_করুন_button = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[3]/div[2]/div[1]/div[3]/div/div/button[2]";

		public static final String দাগ_সম্পাদনা_button = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[3]/div[2]/div[2]/div/table/tbody/tr[1]/td[6]/button[1]";
		public static final String দাগ_মুছে_ফেলুন_button = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[3]/div[2]/div[2]/div/table/tbody/tr[2]/td[6]/button[2]";

		//স্বাক্ষরিত -১
		public static final String স্বাক্ষরিত_1_নাম = "jachaikari_name"; //id
		public static final String স্বাক্ষরিত_1_তারিখ = "jachaikari_signature_date"; //name
		public static final String স্বাক্ষরিত_1_পদবী = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[3]/div[2]/div[3]/div/div[1]/div/div/div/div[2]/div/span/span[1]/span/span[1]";
		public static final String স্বাক্ষরিত_1_পদবী_search = "/html/body/span/span/span[1]/input";
		
		//স্বাক্ষরিত -২
		public static final String স্বাক্ষরিত_2_নাম = "tulonakari_name";
		public static final String স্বাক্ষরিত_2_তারিখ = "tulonakari_signature_date"; //name
		public static final String স্বাক্ষরিত_2_পদবী = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[3]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/span/span[1]/span/span[1]";
		public static final String স্বাক্ষরিত_2_পদবী_search = "/html/body/span/span/span[1]/input";
		
		//স্বাক্ষরিত -৩
		public static final String স্বাক্ষরিত_3_নাম = "onumodonkari_name";
		public static final String স্বাক্ষরিত_3_তারিখ = "onumodonkari_signature_date"; //name
		public static final String স্বাক্ষরিত_3_পদবী = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[3]/div[2]/div[3]/div/div[3]/div/div/div/div[2]/div/span/span[1]/span/span[1]";
		public static final String স্বাক্ষরিত_3_পদবী_search = "/html/body/span/span/span[1]/input";
		
		//পূর্ববর্তী খতিয়ান সম্পর্কিত তথ্য
		public static final String রেফারেন্স_খতিয়ান_নং_1 = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[3]/div[2]/div[4]/div[1]/div/div/div[2]/div[1]/div[1]/div/input"; 
		public static final String old_খতিয়ান_type_1 = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[3]/div[2]/div[4]/div[1]/div/div/div[2]/div[1]/div[2]/div/select"; 
		public static final String old_খতিয়ান_addmore_button = "add_more_ref_khatian"; //id
		public static final String রেফারেন্স_খতিয়ান_নং_2 = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[3]/div[2]/div[4]/div[1]/div/div/div[2]/div[2]/div[1]/div/input"; 
		public static final String old_খতিয়ান_type_2 = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[3]/div[2]/div[4]/div[1]/div/div/div[2]/div[2]/div[2]/div/select"; 
		
		public static final String সর্বশেষ_খতিয়ান_সংযুক্ত_করুন = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/div/div[3]/div[2]/div[4]/div[3]/div/div[1]/input[1]"; //id

		public static final String দাখিল_করুন = "/html/body/div[3]/div[2]/div[1]/div/div/div[2]/div[2]/form/button[1]"; 
		public static final String খসড়া_করুন = "btnDraft"; //id

		//ড্যাশবোর্ড
		public static final String ড্যাশবোর্ড = "/html/body/div[3]/div[1]/div/ul/li[1]/a"; 
		public static final String খসড়া_list = "/html/body/div[3]/div[2]/div/div[2]/div[3]/div/div/div[1]/div/a"; 
		
		//খসড়াকৃত খতিয়ানের তালিকা
		public static final String খসড়া_বিস্তারিত = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td[9]/a[2]"; 
		public static final String খসড়া_বিস্তারিত_close = "/html/body/div[3]/div[2]/div[2]/div[2]/div/div/button"; 
		public static final String খসড়া_সম্পাদন = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td[9]/a[1]"; 
	
		//খতিয়ান সম্পাদন
		public static final String খসড়া_দাখিল_করুন = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/button[1]"; 

		//মোট এন্ট্রি 
		public static final String মোট_এন্ট্রি = "/html/body/div[3]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/a"; 

		//এন্ট্রিকৃত খতিয়ানের তালিকা
		public static final String অনুসন্ধান = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div/div[1]/div[2]/div/label/input"; 
		public static final String এন্ট্রিকৃত_খতিয়ানের_বিস্তারিত = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[9]/a"; 
		public static final String এন্ট্রিকৃত_খতিয়ানের_বিস্তারিত_close = "/html/body/div[3]/div[2]/div[2]/div[2]/div/div/button"; 

	}
	
	public static class JacaiKariDeskModule {
		
		
		public static final String খারিজ_খতিয়ান = "/html/body/div[3]/div[1]/div/ul/li[5]/a/span"; 
		public static final String যাচাই_এর_জন্য_অপেক্ষমাণ = "/html/body/div[3]/div[2]/div/div[3]/div[4]/div/div/div[1]/div/a/h3"; 
		
		//যাচাই এর জন্য প্রেরিত খতিয়ান লিস্ট
		public static final String  বিস্তারিত = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[5]/button"; 
		public static final String  বিস্তারিত_visit_bottom = "/html/body/div[3]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[2]/h4"; 
		public static final String  বিস্তারিত_visit_top = "/html/body/div[3]/div[2]/div[2]/div[2]/div/div/div/table[1]/tbody/tr[3]/td[3]"; 
		public static final String বিস্তারিত_close = "/html/body/div[3]/div[2]/div[2]/div[2]/div/div/button"; 
		
		public static final String  ওপেন = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[5]/a"; 
	
		public static final String  বিস্তারিত2 = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[2]/button"; 
		public static final String  বিস্তারিত2_close = "/html/body/div[3]/div[2]/div[2]/div[2]/div/div/button"; 
		
		public static final String  সকল_তথ্য_যাচাই_করেছি = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/label/div/span/input"; 
		public static final String  সিলেক্ট_স্টেটাস = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/div[3]/form/div/div/div/div[1]/div[2]/div/select"; 
		public static final String  সিলেক্ট_ডেস্ক = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/div[3]/form/div/div/div/div[2]/div[2]/div/select"; 
		public static final String  মন্তব্য = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/div[3]/form/div/div/div/div[3]/div[2]/div/textarea"; 
		public static final String   প্রেরণ = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/div[3]/form/div/div/div/div[7]/div[2]/div/button"; 

		
		
	}
	
	public static class TulonaKariDeskModule {
		

		public static final String খারিজ_খতিয়ান = "/html/body/div[3]/div[1]/div/ul/li[5]/a/span"; 
		public static final String তুলনার_জন্য_অপেক্ষমাণ = "/html/body/div[3]/div[2]/div/div[3]/div[2]/div/div/div[1]/div/a/h3"; 
		
		//তুলনা এর জন্য প্রেরিত খতিয়ান লিস্ট
		public static final String  বিস্তারিত = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[5]/button"; 
		public static final String  বিস্তারিত_visit_bottom = "/html/body/div[3]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[2]/h4"; 
		public static final String  বিস্তারিত_visit_top = "/html/body/div[3]/div[2]/div[2]/div[2]/div/div/div/table[1]/tbody/tr[3]/td[3]"; 
		public static final String বিস্তারিত_close = "/html/body/div[3]/div[2]/div[2]/div[2]/div/div/button"; 
		
		public static final String  ওপেন = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[5]/a"; 
	
		public static final String  বিস্তারিত2 = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[2]/button"; 
		public static final String  বিস্তারিত2_close = "/html/body/div[3]/div[2]/div[2]/div[2]/div/div/button"; 
		
		public static final String  খতিয়ান_সম্পাদনা  = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[2]/a"; 
		public static final String  দাখিল_করুন = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/button"; 

		
		public static final String  সকল_তথ্য_যাচাই_করেছি = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/label/div/span/input"; 
		public static final String  সিলেক্ট_স্টেটাস = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/div[3]/form/div/div/div/div[1]/div[2]/div/select"; 
		public static final String  সিলেক্ট_ডেস্ক = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/div[3]/form/div/div/div/div[2]/div[2]/div/select"; 
		public static final String  মন্তব্য = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/div[3]/form/div/div/div/div[3]/div[2]/div/textarea"; 
		public static final String   প্রেরণ = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/div[3]/form/div/div/div/div[7]/div[2]/div/button"; 

		
	}
	
	public static class OnumodonKariDeskModule {

		public static final String খারিজ_খতিয়ান = "/html/body/div[3]/div[1]/div/ul/li[5]/a/span"; 
		public static final String অনুমোদন_এর_জন্য_অপেক্ষমাণ = "/html/body/div[3]/div[2]/div/div[3]/div/div/div/div[1]/div/a/h3"; 
		
		//তুলনা এর জন্য প্রেরিত খতিয়ান লিস্ট
		public static final String  বিস্তারিত = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[5]/button"; 
		public static final String  বিস্তারিত_visit_bottom = "/html/body/div[3]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[2]/h4"; 
		public static final String  বিস্তারিত_visit_top = "/html/body/div[3]/div[2]/div[2]/div[2]/div/div/div/table[1]/tbody/tr[3]/td[3]"; 
		public static final String বিস্তারিত_close = "/html/body/div[3]/div[2]/div[2]/div[2]/div/div/button"; 
		
		public static final String  ওপেন = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[5]/a"; 
	
		public static final String  বিস্তারিত2 = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[2]/button"; 
		public static final String  বিস্তারিত2_close = "/html/body/div[3]/div[2]/div[2]/div[2]/div/div/button"; 
		
		public static final String  খতিয়ান_সম্পাদনা  = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[2]/a"; 
		public static final String  দাখিল_করুন = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/form/button"; 

		
		public static final String  সকল_তথ্য_যাচাই_করেছি = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/label/div/span/input"; 
		public static final String  সিলেক্ট_স্টেটাস = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/div[3]/form/div/div/div/div[1]/div[2]/div/select"; 
		public static final String  সিলেক্ট_ডেস্ক = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/div[3]/form/div/div/div/div[2]/div[2]/div/select"; 
		public static final String  মন্তব্য = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/div[3]/form/div/div/div/div[3]/div[2]/div/textarea"; 
		public static final String   প্রেরণ = "/html/body/div[3]/div[2]/div[1]/div/div/div/div/div/div[3]/form/div/div/div/div[7]/div[2]/div/button"; 
		
		//অনুমোদিত খতিয়ান অনুসন্ধান
		public static final String  ড্যাশবোর্ড = "/html/body/div[3]/div[1]/div/ul/li[1]/a/span"; 
		public static final String   অনুমোদিত_খতিয়ান_দেখুন = "/html/body/div[3]/div[2]/div/div[3]/div/div/div[2]/div[2]/div/div[4]/div/div/div/a/h3"; 

		public static final String   মৌজা_নির্বাচন = "/html/body/div[3]/div[2]/div[1]/div/div/div[1]/div[2]/div/div/form/div[1]/div/div/span/span[1]/span/span[1]"; 
		public static final String   মৌজা_নির্বাচন_search = "/html/body/span/span/span[1]/input"; 
		public static final String   খতিয়ান_নং = "/html/body/div[3]/div[2]/div[1]/div/div/div[1]/div[2]/div/div/form/div[2]/div/div/input"; 
		public static final String    অনুসন্ধান_করুন = "/html/body/div[3]/div[2]/div[1]/div/div/div[1]/div[2]/div/div/form/div[3]/div/button"; 

	}
	
	public static class LogoutModule {

		public static final String user_icon = "/html/body/div[1]/div/div[3]/div/ul/li[3]/a/img"; 
		public static final String এল_আই_এস_এফ_এ_ফিরুন  = "/html/body/div[1]/div/div[3]/div/ul/li[4]/ul/li[2]/a"; 
		public static final String user_name = "/html/body/div[1]/div/div[3]/div/ul/li[3]/a/span";
		public static final String logout = "/html/body/div[1]/div/div[3]/div/ul/li[3]/ul/li[2]/a";
		
	}

}
