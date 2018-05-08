package Package1;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LoginPage;
import resources.base;

public class ValidateHomePageTitle extends base{
	public static Logger Log = LogManager.getLogger(base.class.getName());
	
	/*public LoginTest(WebDriver driver) {
		
		this.driver=driver;
		return;
		// TODO Auto-generated constructor stub
	}*/


	/*@BeforeTest
	
	public void browserinitiate() throws IOException
	{
		driver = initializeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	*/
	
	@Test
	
	public void LoginMethod() throws IOException
	{
		
		//driver.get("url");
		
		//driver.get("http://markitplace-qa.arpatech.com/auth/login-form");
		driver = initializeDriver();
		/*Log.info("browser driver got initialized");
		driver.get(url);
		Log.info("browser is nevigated to the required URL");
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		lp.getusername().sendKeys(username);
		lp.getpassword().sendKeys(Password);
		lp.getloginbtn().click();		*/		
		String abc = driver.getTitle();
		System.out.println(abc);
		//Assert.assertEquals("Shop - MarkITPlace", abc);
		if(abc.contentEquals("Shop - MarkITplace"))
		{
		//Assert.assertEquals("XShop - MarkITplace", abc);
		Log.info("Title of the Home page got validated");
		}
		else
		{
			Log.error("Title of the Home Page not validated");
			Log.fatal("not matched error");
			System.out.println("i am in else block");
			//Log.error(e.getMessage());
		}
		Assert.assertEquals("Shop - MarkITplace", abc);
		
		driver.close();
		
		//System.out.println(abc);
	}
	                                                                     
	

	/*@AfterMethod
	
	public void closebrowser()
	{
		driver.close();
	}
	*/
	
	//@DataProvider
	
	/*
	public Object[][] getdata()
	{
		Object[][] data = new Object[1][2];
		data[0][0]="arpatech1@connection.com";
		data[0][1]="Arp@tech5";
		return data;
		
				
	}
	*/
}
