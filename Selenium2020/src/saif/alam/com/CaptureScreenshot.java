package saif.alam.com;


import java.io.IOException;

import library.DriverConnection;
import library.Utility;

import org.openqa.selenium.WebDriver;

public class CaptureScreenshot
{

	
	public static void main(String[] args) throws IOException {
		
		
		String home = "https://www.guru99.com/";
		
		WebDriver driver = DriverConnection.driverConnection(home,"chrome");
		
		Utility.captureScreenshot(driver,"Home");
 
	}
}
