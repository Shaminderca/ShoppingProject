package com.AutomationPractice.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationPractice.qa.base.TestBase;

public class SignInPage extends TestBase{
	
	public SignInPage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="input[type='text']")
	WebElement emailIdField;
	
	@FindBy(xpath="//input[name='passwd']")
	WebElement passwordFiled;
	
	@FindBy(id="SubmitLogin")
	WebElement submitLoginButton;
	
	@FindBy(id="email_create")
	WebElement emailAddressButton;
	
	@FindBy(name="SubmitCreate")
	WebElement submitButton;

}
