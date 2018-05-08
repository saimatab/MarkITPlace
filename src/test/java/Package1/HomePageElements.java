package Package1;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import resources.base;

public class HomePageElements extends base{

	
public static Logger Log = LogManager.getLogger(base.class.getName());
	
	public WebDriver driver;
	
	@Test

	public void ValidateHomePageElements() throws IOException
	{
		driver = initializeDriver();
		//LoginMethod("arpatech1@connection.com", "null");
		HomePage hp = new HomePage(driver);
		hp.getsearchbox().sendKeys("s");
		System.out.println(hp.getStandardCatalogBtn().getTagName());
		System.out.println(hp.getShopAllProductBtn().getTagName());
		System.out.println(hp.getAllMyfavrtsLinks().getTagName());
		System.out.println(hp.getRecentlyViewedLink().getTagName());
		System.out.println(hp.getFavrtsBckBtn().getTagName());
		System.out.println(hp.getFavrtsFrwrdBtn().getTagName());
		
		
		//LoginTest lt = new LoginTest();
		
		//lt.LoginMethod("arpatech1@connection.com", "Arp@tech5");
		
		
		
		
		driver.close();
	}
}
