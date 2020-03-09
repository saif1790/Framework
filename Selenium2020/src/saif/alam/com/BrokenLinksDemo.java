package saif.alam.com;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import library.DriverConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinksDemo {
	
	public static void main(String[] args) {
		
		String homePage="https://www.guru99.com/";
		String link ="";
		String url = "";
		int i=0;
		HttpURLConnection huc = null;
        int respCode = 200;
        
		WebDriver driver = DriverConnection.driverConnection(homePage,"ie");
		  
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		
		//Iterator<WebElement> it =allLink.iterator();
		 for(i=0;i<allLink.size();i++)
		 {
			  WebElement ele  = allLink.get(i);
			  url = ele.getAttribute("href");
			  varifyLink(url);
		 }
	 
              driver.quit();
		
		//count number of link
		System.out.println("total Number of links"+i);
	}

	public static void varifyLink(String url) {
		
		try{
			URL url1 = new URL(url);
			HttpURLConnection huc = (HttpURLConnection) url1.openConnection();
		    huc.setConnectTimeout(3000);
		    huc.connect();
		    if(huc.getResponseCode()==200)
		    {
		       System.out.println(url+"  "+huc.getResponseMessage());	
		    }
		    if(huc.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
		    {
		    	System.out.println(url+"  "+huc.getResponseMessage()+" "+HttpURLConnection.HTTP_NOT_FOUND);
		    }
		}
		catch(Exception e)
		{
			
		}
	}

}
