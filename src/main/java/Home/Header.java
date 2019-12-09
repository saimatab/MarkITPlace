package Home;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {
	
public WebDriver driver;

public Header(WebDriver driver ) 
{
	// TODO Auto-generated constructor stub
	this.driver=driver;

}



By HeadLogo=By.xpath("//img[@class='logo']");	
By Searchbox=By.xpath("//input[@id='x_main-search']");

By CartIcon=By.xpath("//span[@class='notify-badge']");
//By CartIcon=By.xpath("//*[@id='top-header']/section/div[3]/div[2]/a");
By FavrtIcon=By.xpath("//a[@class='my-lists' and text()='Favorites']");
//By TrackBtn=By.className("track ");
//By TrackBtn=By.xpath("//a[@class='track active ']");

By TrackBtn=By.linkText("TRACK");

//By TrackBtnFF=By.xpath("(//a[text()='Track'])[1]");

By TrackBtnFF=By.xpath("(//a[text()='Track'])[1]");

By OrderBtn=By.xpath("(//a[@class='top-link'])[3]");

By Calendar=By.xpath("(//a[@class='top-link'])[1]");
//By PAnalysisBtn=By.xpath("(//a[@class='top-link'])[4]");
By Reports=By.xpath("(//a[@class='top-link'])[2]");
By track=By.xpath("(//div[contains(@class,'homepage-nav-item-container')]//a[contains(@class,'')][contains(text(),'Track')]");



By PAnalysisBtn=By.xpath("//a[@class='top-link'][contains(text(),'Purchase Analysis')]");
By Logo=By.xpath("//img[@class='logo']");
By StanCatalogLink=By.xpath("(//a[@class='top-link'])[1]");
By AllProductLink=By.xpath("(//a[@class='top-link'])[2]");
By Resources=By.xpath("//a[@class='top-link'][contains(text(),'Resources')]");
//a[@class='top-link'][contains(text(),'Resources')]
//By Resources=By.xpath("(//a[@class='top-link'])[3]");
By SpecialOffers=By.xpath("//a[@class='top-link'][contains(text(),'Special')]");
By BellIcon=By.xpath("//a[@class='icon-bell']");
By InternationalIcon=By.linkText("International");
By CommunityIcon=By.linkText("Community");
By HelpIcon=By.linkText("Help");
By LegacyLink=By.xpath("//html/body/nav[2]/div/div[2]/a[5]");
By MyAccountLink=By.xpath("//span[@class='account-title']");
By ShippingAddressLink=By.linkText("Shipping Addresses");
By MyProfileLink=By.linkText("My Profile");
By logoutLink=By.linkText("My Profile");

By ShopIcon = By.xpath("(//a[text()='Shop'])[1]");
By QuoteLink=By.xpath("//a[@class='top-link' and text()='Quotes']");

public WebElement getQuoteLink()
{
	return driver.findElement(QuoteLink);
}
public WebElement getShopIcon()
{
	return driver.findElement(ShopIcon);
}

public WebElement getTrackBtnFF()
{
	return driver.findElement(TrackBtnFF);
}
public WebElement getReports()
{
	return driver.findElement(Reports);
}

public WebElement getCalendar()
{
	return driver.findElement(Calendar);
}

public WebElement getPAnalysisBtn()
{
	return driver.findElement(PAnalysisBtn);
}

public WebElement getTrack()
{
	return driver.findElement(track);
}

public WebElement getOrderBtn()
{
	return driver.findElement(OrderBtn);
}
public WebElement getHeadLogo()
{
	return driver.findElement(HeadLogo);
}

public WebElement getlogoutLinkLink()
{
	return driver.findElement(logoutLink);
}


public WebElement getMyProfileLink()
{
	return driver.findElement(MyProfileLink);
}

public WebElement getMyAccountLink()
{
	return driver.findElement(MyAccountLink);
}

public WebElement getShippingAddressLink()
{
	return driver.findElement(ShippingAddressLink);
}
public WebElement getsearchbox()
{
	return driver.findElement(Searchbox);
}

public WebElement getCartIcon()
{
	return driver.findElement(CartIcon);
}

public WebElement getFavrtIcon()
{
	return driver.findElement(FavrtIcon);
}

public List<WebElement> getFavrtIconCount()
{
	return driver.findElements(FavrtIcon);
}



public WebElement getTrackBtn()
{
	return driver.findElement(TrackBtn);
}

public WebElement getLogo()
{
	return driver.findElement(Logo);
	
}

public WebElement getStanCatalogLink()
{
	return driver.findElement(StanCatalogLink);
	
}

public WebElement getAllProductLink()
{
	return driver.findElement(AllProductLink);
	
}


public WebElement getResources()
{
	return driver.findElement(Resources);
	
}

public WebElement getSpecialOffers()
{
	return driver.findElement(SpecialOffers);
	
}

public WebElement getBellIcon()
{
	return driver.findElement(BellIcon);
	
}


public WebElement getInternationalIcon()
{
	return driver.findElement(InternationalIcon);
	
}



public WebElement getCommunityIcon()
{
	return driver.findElement(CommunityIcon);
	
}


public WebElement getHelpIcon()
{
	return driver.findElement(HelpIcon);
	
}


public WebElement getLegacyLink()
{
	return driver.findElement(LegacyLink);
	
}


}
