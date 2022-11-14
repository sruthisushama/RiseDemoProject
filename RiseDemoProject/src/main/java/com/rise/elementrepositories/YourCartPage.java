package com.rise.elementrepositories;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rise.utilities.PageUtility;


public class YourCartPage {
	
	WebDriver driver;
	PageUtility pu = new PageUtility();
	
	@FindBy(xpath = "//div[@class='inventory_item_name']")
	List<WebElement> cartItemsList;
	
	public YourCartPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public int getCartListCount()
	{
		return pu.getElementListCount(cartItemsList);
	}
	

}
