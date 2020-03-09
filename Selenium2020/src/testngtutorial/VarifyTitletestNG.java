package testngtutorial;

import library.DriverConnection;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VarifyTitletestNG {
	
  @Test(description="This is varifying thr title")
  public void varifyTitle()
  {
	        String HomePage = "https://www.guru99.com/";
	  		WebDriver driver =DriverConnection.driverConnection(HomePage,"chrome");
	  		String title = driver.getTitle();
	  		System.out.println("My title"+title);
	  		String expectedTitle = "Meet Guru99 - Free Training Tutorials & Video for IT Courses";
	  		Assert.assertEquals(title, expectedTitle);
	  		System.out.println("Test completed"+"  "+expectedTitle);
  }
}
