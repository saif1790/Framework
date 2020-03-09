package testngtutorial;

import library.DriverConnection;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.annotations.Test;



public class VarifyTitleListenerDemo {
	
  
  @Test
  public void varifytitleDemp() {
	  
	  String getUrl = "https://www.google.co.in/";
	 WebDriver driver = DriverConnection.driverConnection(getUrl,"chrome");
	 String actualTitle =driver.getTitle();
	 System.out.println("title is "+  actualTitle);
	 Assert.assertEquals(actualTitle, "Google");
  }
  
  
  @Test
  public void varifytitle() {
	  
	 System.out.println("Test2");
	 Assert.assertTrue(false);
  }
}
