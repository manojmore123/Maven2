package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.com.LoginPage;

import Resource.basedata;



public class LoginTestcases extends basedata {
	public WebDriver driver;	
	
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initalization();
		 	}

	@Test
	public void Login() throws IOException
	
	{
		
		LoginPage loginp = new LoginPage(driver);
		
		loginp.button_login.click();
//		loginp.loginintoapp();
		
//		
	}

}
