package testngtutorial;

import library.DriverConnection;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentTestCase1 {
	
	String Home_URL = "https://www.netmeds.com/";
	
	WebDriver driver =null;
	
	@Test
	public void webOpen()
	{
		driver =DriverConnection.driverConnection(Home_URL,"chrome");
		
		String currenctUrl = driver.getCurrentUrl();
		
		System.out.println("currentUrl"+ currenctUrl);
		
		Assert.assertTrue(currenctUrl.contains("netmeds.com"));
		
	}
	
	
	@Test(dependsOnMethods="webOpen",description="this is test")
	public void login() throws InterruptedException
	{
		
	String loginUrl = driver.getCurrentUrl();
	
	System.out.println(loginUrl);
	
	driver.findElement(By.xpath("//a[text()=' Sign in / Sign up ']")).click();
		
	driver.findElement(By.xpath("//a[@id='closeButton']")).click();;
	
	driver.findElement(By.xpath("//input[@id='loginfirst_mobileno']")).sendKeys("7290859582");
	driver.findElement(By.xpath("//button[text()='USE PASSWORD']")).click();;
	
	}

}
