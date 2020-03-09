/**
 * 
 */
package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;

import library.DriverConnection;

/**
 * @author admin
 *
 */
public class LoginWordPressTest 
{
	
	  @Test 
	  public void validLogin()
      {
    	  WebDriver driver =DriverConnection.driverConnection("http://demosite.center/wordpress/wp-login.php","chrome");
    	 
    	  LoginPage login = new LoginPage(driver);
    	  login.username("admin");
    	  login.password("demo123");
    	  login.loginClick();
    	  
    	  driver.quit();
    	  
      }
}
