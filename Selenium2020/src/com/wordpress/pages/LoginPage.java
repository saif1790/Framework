/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author admin
 *
 */
public class LoginPage
{
	   WebDriver driver;
      
	   By usename =By.id("user_login");
       By password = By.xpath("//input[@id='user_pass']");
       By login = By.xpath("//input[@value='Log In']");
       
       public   LoginPage(WebDriver driver) 
       {
    	   this.driver=driver;
		
	   }
       
       public void username(String name)
       {
    	   driver.findElement(usename).sendKeys(name);
       }
       
       public void password(String pass)
       {
    	   driver.findElement(password).sendKeys(pass);
       }
       
       public void loginClick()
       {
    	   driver.findElement(login).click();
       }

}
