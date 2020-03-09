package testngtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	WebDriver driver;
	
  @Test
  @Parameters("browserTesting")
  public void varifyTitle(String browsername) 
  {
	  System.out.println(browsername);
	  if(browsername.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","D:\\Study\\Selenium Driver\\geckodriver.exe");
		  driver = new FirefoxDriver();
	  }
	  else if(browsername.equalsIgnoreCase("chrome"))
	  {
		  
		  System.setProperty("webdriver.chrome.driver","D:\\Study\\Selenium Driver\\chromedriver.exe");
		   driver = new ChromeDriver();
	  }
	  else if(browsername.equalsIgnoreCase("ie"))
	  {
		  System.setProperty("webdriver.ie.driver","D:\\Study\\Selenium Driver\\IEDriverServer.exe");
		    driver = new InternetExplorerDriver();
	  }
	  
	  driver.get("http://demo.guru99.com/");
	  driver.manage().window().maximize();
	  String actualTitle =driver.getTitle();
	  Assert.assertEquals(actualTitle, "Guru99 Bank Home Page");
	  driver.quit();
	  
  }
}
