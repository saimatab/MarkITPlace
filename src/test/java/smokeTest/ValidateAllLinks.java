package smokeTest;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.List;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.AllProducts;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.FavouritePage;
import pageObjects.Footer;
import pageObjects.Header;

import pageObjects.MyProfilePage;
import pageObjects.PDP;
import pageObjects.PurchaseAnalysis;

import pageObjects.StandardsCatalog;
import org.openqa.selenium.WebElement;
import pageObjects.TrackPage;
import resources.base;
public class ValidateAllLinks extends base {
	public static Logger Log = LogManager.getLogger(base.class.getName());

	public WebDriver driver;
    HttpURLConnection huc = null;
    int respCode = 200;
	@Test(priority = 0)

	public void ValidateLinks() throws IOException {
		driver = initializeDriver();
		   List<WebElement> links = driver.findElements(By.tagName("a"));
		    
		    //Printing the size, will print the no of links present in the page.
		    System.out.println("Total Links present is "+links.size());
		    
		    //Printing the links in the page, we get through the href attribute.
		    for(int i = 0; i<links.size();i++){
		   	
		    	System.out.println("Links are listed "+links.get(i).getAttribute("href"));
		    }
        
  /*
        
      links = driver.findElements(By.tagName("a"));
        
        Iterator<WebElement> it = links.iterator();
        
        while(it.hasNext()){
            
            url = it.next   List<WebElement>().getAttribute("href");
            
            System.out.println(url);
        
            if(url == null || url.isEmpty()){
System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }
            
       
            
            try {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                
                huc.setRequestMethod("HEAD");
                
                huc.connect();
                
                respCode = huc.getResponseCode();
                
                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                    System.out.println(url+" is a valid link");
                }
                    
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    */
    }

	}
	
	
	
	
	
	

	

