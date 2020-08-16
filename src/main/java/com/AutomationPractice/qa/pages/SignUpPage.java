package com.AutomationPractice.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationPractice.qa.base.TestBase;

public class SignUpPage extends TestBase{

	public SignUpPage() {
		// TODO Auto-generated constructor stub
		super();
	PageFactory.initElements(driver, this);
	}
	//customer_firstname
	@FindBy(id="id_gender1")
	WebElement mr;
	
	@FindBy(id="id_gender2")
	WebElement mrs;
	
	@FindBy(id="customer_firstname")
	WebElement firstName;
	
	@FindBy(name="customer_lastname")
	WebElement lastName;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement emailID;
	
	@FindBy(css="input[name='password']")
	WebElement passwordFiled;
	
	@FindBy(id="firstname")
	WebElement addressFirstName;
	
	@FindBy(id="lastname")
	WebElement addresslastName;
	
	@FindBy(id="address1")
	WebElement addressField;
	
	@FindBy(id="city")
	WebElement cityField;
	
	@FindBy(id="id_state")
	WebElement stateField;
	
	@FindBy(id = "postcode")
	WebElement postCode;

	@FindBy(id = "id_country")
	WebElement country;

	@FindBy(id = "phone_mobile")
	WebElement phoneMobile;

	@FindBy(id = "alias")
	WebElement commonName;

	@FindBy(xpath = "//span[contains(text(),'Register')]")
	WebElement registerButton;

	@FindBy(xpath="//div[@id='create_account_error']")
	WebElement create_account_error;

}
