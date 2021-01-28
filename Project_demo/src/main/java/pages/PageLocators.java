package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageLocators {
	 @FindBy(how=How.XPATH,using="(//button[@title='Select date']/ancestor::div[@class='left'])[1]")
	  public static  WebElement   first_calender;
	
	 @FindBy(how=How.XPATH,using="//div[@class='month-year-picker']/span/a[@class='picked-month']")
	 public  static WebElement  firstcalendarmonth;


 @FindBy(how=How.XPATH,using="//div[@class='views__months show']/table//tbody/tr/td[2]/a")
	 public  static WebElement  selectfirstcalendarmonth;

	 
	@FindBy(how=How.XPATH,using="//div[@class='views__days show']/table[@class='calendar']/tbody/tr[3]/td[@class=' weekend']/a")
	 public static WebElement  first_date;
	 @FindBy(how=How.XPATH,using="//div[@class='month-year-picker']/span/a[@class='picked-year']")
	  public static WebElement year;
	@FindBy(how=How.XPATH, using="//div[@class='views__years show']/table/tbody/tr/td[@class='selected']/a")
	 public  static WebElement firstyear;
	
	/*-------------------------------------------------------*/
	 @FindBy(how=How.XPATH,using="(//button[@title='Select date']/ancestor::div[@class='left'])[2]")
	  public static  WebElement   second_calender;
	 @FindBy(how=How.XPATH,using="//div[@class='month-year-picker']/span/a[@class='picked-month']")
	 public  static WebElement  secondcalendarmonth;


 @FindBy(how=How.XPATH,using="//div[@class='views__months show']/table//tbody/tr[3]/td[3]/a")
	 public  static WebElement  selectsecondcalendarmonth;
	 
 @FindBy(how=How.XPATH,using="//table[@class='calendar']/tbody/tr[3]/td[6]/a")
	  public static WebElement second_date;	 

	  @FindBy(how=How.XPATH,using="//div[@class='month-year-picker']/span/a[@class='picked-year']")
	  public static WebElement secondyear;
	  
	@FindBy(how=How.XPATH, using="//div[@class='views__years show']/table/tbody/tr[3]/td[2]/a")
	 public  static WebElement second_year;
	
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	public static  WebElement submit;

	@FindBy(how=How.XPATH,using="//div[@class='eight columns']/h2")
	public static  WebElement verifydetails;
	 

}
