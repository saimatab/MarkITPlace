package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
public WebDriver driver;
	
	public CheckoutPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By Attention = By.xpath("(//div[@class='field-container']/input)[1]");
	By Newbtn=By.xpath("//a[text()='Use This Address']");
	//By PO = By.xpath("//input[@id='tbPO']");
	By PO = By.xpath("(//input[@type='text'])[1]");
	By BillingDropdown=By.xpath("//div[@class='predictive-dropdown-arrow']");
	By Listvalue=By.xpath("//li[@value='[object Object]']");
	
	//By ShippingAddValue=By.xpath("(//li[@value='[object Object]'])[1]");
	By ShippingAddValue=By.xpath("//li[contains(text(),'Cali7, 4050 Taylor St , SAN DIEGO, CA, 921102737, 5555555555')]");

	By PlaceOrderBtn=By.xpath("(//a[@class='btn btn-primary btn-save placeOrderBtn'])[1]");
	By PlaceOrderBtn2=By.xpath("(//a[@class='btn btn-primary btn-save placeOrderBtn'])[2]");
	By EmailConfirm=By.xpath("//input[@id='tbEmailConfirmation']");
	By JavaClose=By.xpath("//button[@class='btn btn-default']");
	By Reference=By.xpath("//input[@type='text' and @id='tbReference']");
	By UseThisAddress=By.xpath("//a[@class='btn btn-primary use-this-address']");
	
	public WebElement getAttention()
	{
		return driver.findElement(Attention);
	}
	public WebElement getUseThisAddress()
	{
		return driver.findElement(UseThisAddress);
	}
	public WebElement getReference()
	{
		return driver.findElement(Reference);
	}
	
	
	public WebElement getNewbtn()
	{
		return driver.findElement(Newbtn);
	}
	
	
	public WebElement getJavaClose()
	{
		return driver.findElement(JavaClose);
	}
	
	public WebElement getEmailConfirm()
	{
		return driver.findElement(EmailConfirm);
	}
	
	public WebElement PlaceOrderBtn2()
	{
		return driver.findElement(PlaceOrderBtn2);
	}
	
	public WebElement getPO()
	{
		return driver.findElement(PO);
	}
	public WebElement getBillingDropdown()
	{
		return driver.findElement(BillingDropdown);
	}

	public WebElement getListvalue()
	{
		return driver.findElement(Listvalue);
	}
	
	
	
	public WebElement ValidateordersPage()
	{
		return driver.findElement(ShippingAddValue);
		
	}
	
	public WebElement getPlaceOrderBtn()
	{
		return driver.findElement(PlaceOrderBtn);
	}
	
	public WebElement getShippingAddValue()
	{
		return driver.findElement(ShippingAddValue);
		
	}
	
	//input[@id='tbPO']

}
