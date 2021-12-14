package TestCases;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.com.LoginPage;

import Resource.basedata;


public class LoginTestcases extends basedata {
	public WebDriver driver;	
	
	public String username="manzoor490@gmail.com";
	public String pass="manzoor";
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initalization();
		 	}

	@Test(priority =1,dataProvider="getdata")
	public void registration(String fistname, String lastname,String email, String phoneno,String adress1, String adress2,String city, String postcode,String country,String region, String password, String confirmpass) throws InterruptedException
	
	
	{
		
		Random rand = new Random();
		
		int rand_int1 = rand.nextInt(1000);
		
		String ran=  Integer.toString(rand_int1);
		String successMesage="Congratulations! Your new account has been successfully created!";
		
		
		LoginPage loginp = new LoginPage(driver);
		
		String email1=email+ran+"@gmail.com";
		
		loginp.button_login.click();
		loginp.button_register.click();
		loginp.input_firstName.sendKeys(fistname);
		loginp.input_LastName.sendKeys(lastname);
		loginp.input_email.sendKeys(email1);
		System.out.println(email1);
		loginp.input_telephone.sendKeys(phoneno);
		loginp.input_Adress1.sendKeys(adress1);
		loginp.input_Adress2.sendKeys(adress2);
		loginp.input_City.sendKeys(city);
		loginp.input_PostCode.sendKeys(postcode);
		loginp.dropdown_Country.sendKeys(country);
		
		
		loginp.dropdown_Zone.sendKeys(region);
		
		loginp.input_password.sendKeys(password);
		loginp.input_confirmpassword.sendKeys(confirmpass);
		Thread.sleep(6000);
		loginp.selectdropdownvalue(loginp.dropdown_state, "Maharashtra");
		loginp.checkbox_privacy.click();
		loginp.continueButton.click();
		
		Assert.assertEquals(loginp.LoginSucess.getText(),successMesage);
	}

	@Test
	public void login()
	
	{
		LoginPage p;
		LoginPage loginp = new LoginPage(driver);
		loginp.button_login.click();
		loginp.button_login.click();
		
		loginp.input_email.sendKeys(username);
		loginp.input_password.sendKeys(pass);
		
		loginp.button_login.click();
	}

	@DataProvider
	public Object[][] getdata()
	{
		Object [][] data = new Object[1][12];
		
		data[0][0]="manzoor";
		data[0][1]="mehadi";
		data[0][2]="manzoor";
		data[0][3]="9876543210";
		data[0][4]="yeshwanthapur";
		data[0][5]="bangalore";
		data[0][6]="bangalore";
		data[0][7]="560022";
		data[0][8]="India";
		data[0][9]="Karnataka";
		data[0][10]="manzoor1";
		data[0][11]="manzoor1";
		
		return data;
  	}
	
}


