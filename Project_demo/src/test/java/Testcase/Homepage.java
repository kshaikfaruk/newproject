 package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.PageLocators;
import pagesactions.PageActions;

public class Homepage {
	  BaseClass mbs;  
	  PageActions page= new PageActions();
	  @Test(priority=1)
	 public void launchurl( ){
		  mbs= new BaseClass();
		 mbs.launchurl("https://www.timeanddate.com/date/duration.html");
		 
	 }
	   @Test(priority=2)
	   public void click_oncalender(){
		  
		   page.click_on_calender(PageLocators.first_calender, PageLocators.firstcalendarmonth, PageLocators.selectfirstcalendarmonth,PageLocators.year, PageLocators.firstyear, PageLocators.first_date);
		   
//		   page.click_on_year(PageLocators.year, PageLocators.firstyear, PageLocators.first_date);
	  page.click_on_calender(PageLocators.second_calender, PageLocators.secondcalendarmonth, PageLocators.selectsecondcalendarmonth,PageLocators.secondyear, PageLocators.second_year, PageLocators.second_date);
//		  page.click_on_year(PageLocators.secondyear, PageLocators.second_year, PageLocators.second_date);
		 
		  page.clickonresult(PageLocators.submit);
		  String result=page.verifyresult(PageLocators.verifydetails);
		   Assert.assertEquals(result, "Result: 1734 days");
		  
		  
	   }
	  
	    
	   
		    }
	    
	
	    
	     
	


