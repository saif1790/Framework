package saif.alam.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//WebElement explore =driver.findElement(By.xpath("//a[contains(@href,'/plus')][text()='Explore']"));
		//explore.click();
		returnMenu(driver,"Custom");
		/*List<WebElement> explore =driver.findElements(By.xpath("//span//input[@type='radio']"));
		
		*/
		System.out.println("saif");
		
	}
	
	public  static void returnMenu(WebDriver driver,String menu)
	{
		WebElement wish = driver.findElement(By.xpath("//label[text()='"+menu+"']/preceding-sibling::input"));
		 wish.click();

	}
	

}
