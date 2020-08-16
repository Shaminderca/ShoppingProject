package com.AutomationPractice.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationPractice.qa.base.TestBase;

public class HomePage extends TestBase {

	public HomePage() {
		super();
	PageFactory.initElements(driver, this);
	}
	//Objects
	@FindBy(id="header_logo")
	WebElement headerLogo;
	
	@FindBy(className="login")
	WebElement logInButton;
	
	//Methods
	public boolean verifyLogo()
	{
		return headerLogo.isDisplayed();
		
	}
	
	public String getHomePageTitle()
	{
		String pageTitle = driver.getTitle();
		return pageTitle;
		
	}
	
	public SignInPage navigateToSignInPage()
	{   
		logInButton.click();
		return new SignInPage();
		
	}
	
	
}
