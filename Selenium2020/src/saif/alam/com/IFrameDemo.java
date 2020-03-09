package saif.alam.com;

import java.util.List;

import library.DriverConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFrameDemo {
	
	public static void main(String[] args) {
		
		String multi_iframe="file:///D:/Study/MultiFrame.html";
		
		WebDriver driver = DriverConnection.driverConnection(multi_iframe,"chrome");
		
		int no_of_frame = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("total Number of iFrame"+ no_of_frame);
		
		//switch to 3rd iframe window
		driver.switchTo().frame("netmeds");
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("iBset");
		
		driver.findElement(By.xpath("//button[@type='submit' and @class='iconSearch']")).click();;
		
		//switch to parent window
		driver.switchTo().defaultContent();
		
		//driver.findElement(By.xpath("//a[@name='google']")).click();;
		
		//switch to 2nd iframe window
		driver.switchTo().frame("sarkarir_results");
		
		driver.findElement(By.xpath("//a[text()='SSC CGL Tier I']")).click();;
		
		driver.quit();
		
	}

}
