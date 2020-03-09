package saif.alam.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {
	
	public static void main(String a[])
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Study\\Selenium Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://materializecss.com/radio-buttons.html");
	driver.manage().window().maximize();
	
	//
	List<WebElement> radioButton =driver.findElements(By.xpath("//form//label/span"));
	 
	for(int i=0;i<radioButton.size();i++)
	{
		WebElement radio =radioButton.get(i);
		String r1 =radio.getText();
		System.out.println("==="+r1);
		
	}
	

     }

	

}