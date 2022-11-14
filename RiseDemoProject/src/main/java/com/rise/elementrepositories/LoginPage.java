package com.rise.elementrepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rise.utilities.PageUtility;



public class LoginPage {
	
	WebDriver driver;
	
	PageUtility pu = new PageUtility();
	
	@FindBy(id = "user-name")
	WebElement userName;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "login-button")
	WebElement loginButton;
	
	@FindBy(xpath = "//div[@class='error-message-container error']")
	WebElement msgLockedUser;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterUserName(String name ) {
		pu.inputDataToTextField(userName, name);
	}
	
	public void enterPassword(String pwd ) {
		pu.inputDataToTextField(password, pwd);
	}
	
	public void clickLoginButton() {
		pu.clickOnElement(loginButton);
	}
	
	public String getCurrentPageUrl()
	{
		return pu.getPageUrl(driver);
	}
	
	public String lockedUserMessage()
	{
		return pu.getElementText(msgLockedUser);
	}

}
