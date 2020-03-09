package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverConnection {
	
	        static WebDriver driver;
	         
	        public static WebDriver driverConnection(String getUrl,String browserName)
	        {
	        	if(browserName.equalsIgnoreCase("chrome"))
	        	{
	        	
			System.setProperty("webdriver.chrome.driver", "D:\\Study\\Selenium Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(getUrl);
			driver.manage().window().maximize();
			Utility.captureScreenshot(driver,"maximize window");
			return driver;
	        	}
	        	
	        	else if(browserName.equalsIgnoreCase("firefox"))
	        	{
	        	
	        		System.setProperty("webdriver.gecko.driver","D:\\Study\\Selenium Driver\\geckodriver.exe");
			        driver = new FirefoxDriver();
			        driver.get(getUrl);
			        driver.manage().window().maximize();
			        Utility.captureScreenshot(driver,"maximize window");
			         return driver;
	         	}
	        	else if(browserName.equalsIgnoreCase("ie"))
	        	{
	        	
	        		System.setProperty("webdriver.ie.driver","D:\\Study\\Selenium Driver\\IEDriverServer.exe");
	    		    driver = new InternetExplorerDriver();
			        driver.get(getUrl);
			        driver.manage().window().maximize();
			        Utility.captureScreenshot(driver,"maximize window");
			         return driver;
	         	}
				return driver;

		    }
}
