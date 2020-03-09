package library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void captureScreenshot(WebDriver driver, String img)
	{
		try{
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new File("./screenshot/"+img+".jpg"));
			
			System.out.println("Screenshot has taken");
			}
			catch(Exception e)
			{
				System.out.println("Exception while taking Screenshot"+ e.getMessage());
			}
	}

}
