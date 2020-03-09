package testngtutorial;

import library.DriverConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VarifyErrorMsgTstNG {
	
  @Test
  public void  VarifyErrorMsg() {
	  
	  String home = "https://www.facebook.com/";
	  
	  WebDriver driver = DriverConnection.driverConnection(home,"firefox");
	  
	  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("khansaif324@gmail.com");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();;
	  String actualerror =driver.findElement(By.xpath("//div[@role='alert']")).getText();
	  String expectedError = "The password that you've entered is incorrect. Forgotten password?";
	  Assert.assertEquals(actualerror, expectedError);
	  Assert.assertTrue(actualerror.contains("The password that you've entered is incorrect. "));
  }
}
