package saif.alam.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class DropDownTesting {
	
	DropDownTesting dd = new DropDownTesting();
	public static void main(String[] args) throws InterruptedException,UnexpectedTagNameException  {
		DropDownTesting dd = new DropDownTesting();
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Selenium Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.guru99.com/");
		
		driver.manage().window().maximize();
		
		/*//select day
		WebElement selct_day = driver.findElement(By.id("day"));
		
		Select dd_day = new Select(selct_day);
		
		dd_day.selectByVisibleText("1");
		 
		System.out.println("hay.");
		Thread.sleep(3000);
		//select month
   
		WebElement selct_month = driver.findElement(By.id("month"));
		
		Select dd_month = new Select(selct_month);
		
		dd_month.selectByVisibleText("Jul");
		
		Thread.sleep(3000);
		// select year
		
        WebElement selct_year = driver.findElement(By.id("year"));
		
		Select dd_year = new Select(selct_year);
		
		dd_year.selectByVisibleText("1990");*/
		
		WebElement rMenu =  dd.returnMenu(driver,"Home");// driver.findElement(By.xpath("//span[@class='g-menu-item-title' and text()='Testing']"));
		Actions action = new Actions(driver);
		action.moveToElement(rMenu).perform();
		driver.findElement(By.xpath("//span[@class='g-menu-item-title' and text()=' Selenium']")).click();
		
	}
	
	public   WebElement returnMenu(WebDriver driver,String menu)
	{
		WebElement wish = driver.findElement(By.xpath("//span[@class='g-menu-item-title' and text()='"+menu+"']"));
		return wish;
		
	}


}
