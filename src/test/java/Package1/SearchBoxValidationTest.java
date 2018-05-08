package Package1;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jdk.incubator.http.internal.common.Log;
import pageObjects.HomePage;
import resources.base;

public class SearchBoxValidationTest extends base{
	public static Logger Log = LogManager.getLogger(base.class.getName());
	
	public WebDriver driver;
	
//@BeforeTest
	/*
	public void browserinitiate() throws IOException
	{
		driver = initializeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	*/
	
@Test

public void ValidateSearchBox() throws IOException
{
	driver = initializeDriver();
	//LoginMethod("arpatech1@connection.com", "null");
	HomePage hp = new HomePage(driver);
	
	//LoginTest lt = new LoginTest();
	
	//lt.LoginMethod("arpatech1@connection.com", "Arp@tech5");
	
	try {
	Assert.assertTrue(hp.getsearchbox().isDisplayed());
	Log.info("Search Section got validated");
	}catch(Throwable e) {
		//Log.error(e.getMessage());
		Log.error("Search box not present");
	}
	Assert.assertTrue(hp.getsearchbox().isDisplayed());
	
	
	driver.close();
}

//@AfterMethod

/*public void closebrowser()
{
	driver.close();
}

*/

}
