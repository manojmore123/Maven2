package Resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class basedata {
	
	
	public WebDriver driver;
//	public Properties prop=null;
	@BeforeTest
	public WebDriver initalization() throws IOException
	{		
		
		Properties prop = new Properties();	
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resource\\config.properties");	
		prop.load(fs);
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\Resource\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get(prop.getProperty("url"));
		return driver;
		
	}
	

}
