package saif.alam.com;

import library.DriverConnection;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VarifyTitle {
	
	public static void main(String[] args) {
		
		String HomePage = "https://www.guru99.com/";
		
		WebDriver driver =DriverConnection.driverConnection(HomePage,"chrome");
		String title = driver.getTitle();
		System.out.println("My title"+title);
		String expectedTitle = "Meet Guru99 - Free Training Tutorials & Video for IT Courses";
		Assert.assertEquals(title, expectedTitle);
		System.out.println("Test completed");
		
	}

}
