package com.serenity.pages.flightbooking;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.jruby.RubyIO.Sysopen;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.serenity.pages.HomePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;

import net.thucydides.core.pages.PageObject;

public class FlightBookingPage extends HomePage{
	WebDriverWait wt = new WebDriverWait(getDriver(), 30);	
	
	

	
	
@FindBy(xpath = "//input[@value='roundtrip']")
public WebElementFacade  rtn_roundtrip;

@FindBy(xpath = "//div[@class='makeFlex']/ul/li[@data-cy='oneWayTrip']")
public WebElementFacade  rtn_onetrip;

@FindBy(xpath = "//input[@id='fromCity']")
public WebElementFacade  ddl_fromPort;

@FindBy(xpath = "//input[@placeholder='From']")
public WebElementFacade  input_From;

@FindBy(xpath = "//input[@placeholder='To']")
public WebElementFacade  input_To;

@FindBy(xpath = "//ul[@role='listbox']/li[1]")
public WebElementFacade  ddl_fromSearchedResult;

@FindBy(xpath = "//label[@for='departure']")
public WebElementFacade  cal_departure;

@FindBy(xpath = "//div[@class='DayPicker-Caption']/div")
public List<WebElement> months;

@FindBy(xpath = "//div[@class='DayPicker-Day']/div")
public List<WebElement>  days;

@FindBy(xpath = "//p[@data-cy='submit']/a")
public WebElementFacade  btn_searchFlight;

@FindBy(xpath = "//div[@class='listingCard appendBottom5']")
public List<WebElement>  lst_flight_search_result;


@FindBy(xpath = "//p[contains(text(),'Flights sorted by')]")
public WebElementFacade  title_flight_search_title;

@FindBy(xpath = "//span[@class='langCardClose']")
public WebElementFacade  closePopup;














@FindBy(xpath = "//select[contains(@name,'fromMonth')]")
public WebElementFacade  ddl_fromMonth;

@FindBy(xpath = "//select[contains(@name,'fromDay')]")
public WebElementFacade  ddl_fromDay;

@FindBy(xpath = "//select[contains(@name,'toPort')]")
public WebElementFacade  ddl_toPort;

@FindBy(xpath = "//select[contains(@name,'toMonth')]")
public WebElementFacade  ddl_toMonth;

@FindBy(xpath = "//select[contains(@name,'toDay')]")
public WebElementFacade  ddl_toDay;

@FindBy(xpath = "//input[contains(@value,'Coach')]")
public WebElementFacade  rbtn_coach_economic;

@FindBy(xpath = "//input[contains(@name,'findFlights')]")
public WebElementFacade  btn_findFlights;


//li[@data-cy='roundTrip']






public void one_way_booking_flight(Map<String, String> userDetails) throws Exception {
	rtn_onetrip.click();
	booking_flight(userDetails);
	Thread.sleep(2000);
		
}

public void two_way_booking_flight(Map<String, String> userDetails) throws Exception {
	btn_roundtrip.click();
	booking_flight_twoway(userDetails);
	Thread.sleep(2000);
		
}

public void validate_flight_search_result() throws Exception

{
	if(lst_flight_search_result.size()>=1 )
	{
		System.out.println("Flight search result are displayed");
		
		String asas = title_flight_search_title.getText();
		
		System.out.println("dsadsadas"+asas);
		
		assertEquals("Flights sorted by Popularity (based on price, duration & convenience)", title_flight_search_title.getText());
	
	}
	
	else
	{
		throw new Exception("Search result not displayed");
	}	
}

public void  round_way_booking_flight(Map<String, String> userDetails) throws InterruptedException {
	rtn_roundtrip.click();
	booking_flight(userDetails);
	ddl_toPort.selectByVisibleText("To");
	
}

private void booking_flight(Map<String, String> userDetails) throws InterruptedException {
//	ddl_fromPort.selectByVisibleText(userDetails.get("From"));
	
	ddl_fromPort.click();
	Thread.sleep(2000);
	input_From.sendKeys(userDetails.get("From"));
	Thread.sleep(2000);
	ddl_fromSearchedResult.click();
	
	System.out.println("From date selected");
	
	Thread.sleep(5000);
	input_To.sendKeys(userDetails.get("To"));
	Thread.sleep(3000);
	ddl_fromSearchedResult.click();
	System.out.println("To date selected");
	
	Thread.sleep(2000);	
	String[] date=userDetails.get("Date").split("-");
	
	String month_year = date[0];
	
	String select_day = date[1];
	
	selectDate(month_year, select_day);
	
	Thread.sleep(2000);
	
	
	
	
}



private void booking_flight_twoway(Map<String, String> userDetails) throws InterruptedException {
//	ddl_fromPort.selectByVisibleText(userDetails.get("From"));
	
	ddl_fromPort.click();
	Thread.sleep(2000);
	input_From.sendKeys(userDetails.get("From"));
	Thread.sleep(2000);
	ddl_fromSearchedResult.click();
	
	System.out.println("From date selected");
	
	Thread.sleep(5000);
	input_To.sendKeys(userDetails.get("To"));
	Thread.sleep(3000);
	ddl_fromSearchedResult.click();
	System.out.println("To date selected");
	
	Thread.sleep(2000);	
	String[] date=userDetails.get("Date").split("-");
	String month_year = date[0];
	
	String select_day = date[1];
	

	
	
	
	Thread.sleep(2000);	
	String[] date2=userDetails.get("RetunDate").split("-");

	
	String month_yearR = date2[0];
	
	String select_dayR = date2[1];
	
	selectDateRetun(month_year, select_day,month_yearR,select_dayR);
	
	Thread.sleep(2000);
	
	
	
	
}

public void selectDateRetun(String month_year1, String select_day1,String month_yearRT, String select_dayRT ) throws InterruptedException
{ 

for (int i=0; i<months.size();i++)
{
 String[] el=  months.get(i).getText().split("\\s+");
 
 String currentmonth= el[0];

 if(currentmonth.equals(month_year1))
 
{ 

for (WebElement d:days)
{ 
//System.out.println(d.getText());
if(d.getText().equals(select_day1))
{
d.click();
System.out.println("Finally date selected");

//return;
}
} 

} 

}


for (int i=0; i<months.size();i++)
{
 String[] el=  months.get(i).getText().split("\\s+");
 
 String currentmonth= el[0];

 if(currentmonth.equals(month_yearRT))
 
{ 

for (WebElement d:days)
{ 
//System.out.println(d.getText());
if(d.getText().equals(select_dayRT))
{
d.click();
System.out.println("Finally date selected");

//return;
}
} 

} 

	}

	}





public void selectDate(String month_year1, String select_day1) throws InterruptedException
{ 

for (int i=0; i<months.size();i++)
{
 String[] el=  months.get(i).getText().split("\\s+");
 
 String currentmonth= el[0];

 if(currentmonth.equals(month_year1))
 
{ 

for (WebElement d:days)
{ 
//System.out.println(d.getText());
if(d.getText().equals(select_day1))
{
d.click();
System.out.println("Finally date selected");

//return;
}
} 

} 

}

}



}