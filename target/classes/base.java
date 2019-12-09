package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import Home.LoginPage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

	public class base {
		public static Logger Log = LogManager.getLogger(base.class.getName());
	public static WebDriver driver;
	public static String url;
	public static Properties prop;
	public static FileInputStream fis;
	public LoginPage lp;
	
	public WebDriver initializeDriver() throws IOException
	{   
		 DesiredCapabilities dCaps;
	 
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		url = prop.getProperty("url");
		
		System.out.println("Browser selected is "+browserName);
		
		if(browserName.equals("phantom"))
		{
			
			
		    File file = new File("phantomjs.exe");				
            System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
			//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			dCaps = new DesiredCapabilities();
			  dCaps.setJavascriptEnabled(true);
			  dCaps.setCapability("takesScreenshot", false);
			  
			  driver = new PhantomJSDriver(dCaps);
			 //driver = new ChromeDriver();
		}
		
		if(browserName.equals("chrome"))
		{
			
			
		   
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
			
			 driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("ie"))
		{
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		lp.getusername().sendKeys(prop.getProperty("username"));
		lp.getpassword().sendKeys(prop.getProperty("pswd"));
		lp.getloginbtn().click();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	/*

 public WebDriver genericDriver()  throws IOException{
        FileInputStream fs = new FileInputStream(".\\ConfigurationFile\\configuration.properties");
        try
        {
            logg.info("Browser function starts");
            Properties prop=new Properties();
            logg.info("Properties Class initialize here");
            logg.info("FileInputStream function calling and verifying here configuration file path");
            prop.load(fs);
            logg.info("FileInputStream loaded");
            String GetBrowser=prop.getProperty("Browser");
            logg.info("Get value of browser here from configuration file");
            String GetUrl=prop.getProperty("Url");
            logg.info("Get value of Url here from configuration file");
            String PageImplicit=prop.getProperty("implicitlywait");
            logg.info("Get value of implicitwait here from configuration file");
            String PageLoadTime=prop.getProperty("pageloadwait");
            logg.info("Get value of pageloadwait here from configuration file");

            if(GetBrowser.equalsIgnoreCase("GoogleChrome"))
            {
                logg.info("Enters in Chrome Browser Condition");
                System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");
                logg.info("Browser system property path Verified");
                driver=new ChromeDriver();
                logg.info("Chrome Browser opens successfully");
                driver.navigate().to(GetUrl);
                logg.info("Url Opened successfully in browser");
                driver.manage().window().maximize();
                assertEquals(LoginPageTitle, driver.getTitle());
                logg.info("Login assertion verified");
                driver.manage().timeouts().implicitlyWait(Long.parseLong(PageImplicit), TimeUnit.SECONDS);
                logg.info("ImplicitTime Defined In browser function");
                driver.manage().timeouts().pageLoadTimeout(Long.parseLong(PageLoadTime), TimeUnit.SECONDS);
                logg.info("Page Load time Defined In browser function");
                logg.info("*********************** Driver Function Passed ***********************");
            }
            
            else if(GetBrowser.equalsIgnoreCase("Firefox"))
            {
            	//Now working for Firefox driver
            	
                logg.info("Enters in Firefox Browser Condition");
                System.setProperty("webdriver.gecko.driver",".\\src\\main\\resources\\Firefox_win32\\geckodriver.exe");
                logg.info("Browser system property path Verified");
                driver=new FirefoxDriver();
                logg.info("Firefox Browser opens successfully");
                driver.navigate().to(GetUrl);
                logg.info("Url Opened successfully in browser");
                driver.manage().window().maximize();
                assertEquals(LoginPageTitle, driver.getTitle());
                logg.info("Login assertion verified");
                driver.manage().timeouts().implicitlyWait(Long.parseLong(PageImplicit), TimeUnit.SECONDS);
                logg.info("ImplicitTime Defined In browser function");
                driver.manage().timeouts().pageLoadTimeout(Long.parseLong(PageLoadTime), TimeUnit.SECONDS);
                logg.info("Page Load time Defined In browser function");
                logg.info("*********************** Driver Function Passed ***********************");
            }
        }
        catch (IOException ex) {
            logg.info("Must have some browser opening issue or some path issue "+ex.getMessage());
        }
        catch (NullPointerException ex) {
            logg.info("Must have some browser opening issue or some path issue "+ex.getMessage());
        }
        finally {
            fs.close();
        }
        return driver;
    }



*/
	public WebDriver initializeDriverWithoutCredentials() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		url = prop.getProperty("url");
		
		System.out.println("Browser selected is "+browserName);
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			 driver = new ChromeDriver();
	
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "C:\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	
	
	
	
	/* public String getConfigValue(String passConfigurationKey)
    {
        Properties prop=new Properties();
        try
        {
            logg.info("Get Configuration Value Test Here");
            FileInputStream fs= new FileInputStream(".\\ConfigurationFile\\configuration.properties");
            logg.info("FileInputStream function calling and verifying here configuration file path");
            prop.load(fs);
            GetURLValue=prop.getProperty(passConfigurationKey);
            logg.info("URL value stored in parameter");
        }

        catch (Exception ex) {
            logg.info("MainDriverClass - There is an issue in : getConfigValue "+ex.getMessage());
        }

        return GetURLValue;
    }*/
	
	
	
	public void getScreenshot(String result) throws IOException
	{
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFileToDirectory(src, new File("C:\\Automation-Snapshots\\"+result+" screenshot.png"));
	}

}
