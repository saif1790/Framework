package saif.alam.com;

import java.util.Set;

import library.DriverConnection;
import library.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HandleMultipleWindow {
	
	public static void main(String[] args) throws InterruptedException {
		
		String home ="https://www.naukri.com/";
		
		WebDriver driver = DriverConnection.driverConnection(home,"firefox");
		
		Utility.captureScreenshot(driver,"Home");
		
		String parent = driver.getWindowHandle();
		
		System.out.println("Parent window id is"+parent);
		
		Set<String> multiWindow =driver.getWindowHandles();
		
		for(String child : multiWindow)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				
				System.out.println("Child window title is"+driver.getTitle());
				
				Utility.captureScreenshot(driver,"child window");
				
				Thread.sleep(3000);
				
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		
		System.out.println("parent window title "+driver.getTitle());
				
		/*driver.findElement(By.xpath("//input[@name='qp' and @placeholder='Skills, Designations, Companies']")).sendKeys("JAVA");;
		
		driver.findElement(By.xpath("//button[@class='qsbSrch blueBtn']")).click();*/	
	}

}
