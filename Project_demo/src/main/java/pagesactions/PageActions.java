package pagesactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basepackage.BaseClass;
import pages.PageLocators;

public class PageActions {
	 
	 BaseClass bc= new BaseClass();
	 PageLocators pl=null;
	  
	WebDriver driver= bc.getDriver();
	  public PageActions(){
		   this.pl= new PageLocators();
		    PageFactory.initElements(  driver, pl);
	  }
	
	
	 public  void click_on_calender(WebElement clickcalender,WebElement clickonmonth, WebElement Selectmonth,WebElement clickyear,WebElement selectyear, WebElement selectdate){
		 bc.wait.until(ExpectedConditions.visibilityOf(clickcalender)).click();
	    bc.wait.until(ExpectedConditions.visibilityOf(clickonmonth)).click();
	    Selectmonth.click();
	    bc.wait.until(ExpectedConditions.visibilityOf(clickyear)).click();
	    bc.wait.until(ExpectedConditions.visibilityOf(selectyear)).click();
	    selectdate.click();
	  }
	 
	 public  void click_on_year(WebElement clickyear,WebElement selectyear, WebElement selectdate){
		 bc.wait.until(ExpectedConditions.visibilityOf(clickyear)).click();
	    bc.wait.until(ExpectedConditions.visibilityOf(selectyear)).click();
	    selectdate.click();
	  }
	 		 public void clickonresult( WebElement element){
			  element.click();
		  }
		   public String  verifyresult(WebElement element){
			String result=element.getText();
			 return result;
		   }
}