package saif.alam.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	
	public static void main(String arg[]) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Selenium Driver\\chromedriver.exe");
		
		WebDriver driver =new  ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		WebElement customerId = driver.findElement(By.xpath("//input[@name='cusid']"));
		
		customerId.sendKeys("1234");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).submit();
		
		Alert alert = driver.switchTo().alert();
		
		alert.dismiss();
		
		String alertMsg = driver.switchTo().alert().getText();
		
		System.out.println("alert Msg"+ alertMsg);
		
		Thread.sleep(3000);
		
		alert.accept();
	}

}
