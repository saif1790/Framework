package com.wordpress.pages;

import library.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageFactory 
{
	WebDriver driver;
	
    public LoginPageFactory(WebDriver driver)
    {
		this.driver = driver;
	}

	@FindBy(id="user_login")
	@CacheLookup
    WebElement username;
    
    @FindBy(how=How.ID,using="user_pass")
    @CacheLookup
    WebElement password;
    
    @FindBy(id="wp-submit")
    @CacheLookup
    WebElement submit_Button;
    
    @FindBy(how=How.LINK_TEXT,using="Lost your password?")
    WebElement forgot_password_link;
    
    public void username(String name)
    {
 	   username.sendKeys(name);
 	  Utility.captureScreenshot(driver,"username");
    }
    
    public void password(String pass)
    {
 	   password.sendKeys(pass);
 	   Utility.captureScreenshot(driver,"password");
    }
    
    public void loginClick()
    {
    	submit_Button.click();
    }
}   
