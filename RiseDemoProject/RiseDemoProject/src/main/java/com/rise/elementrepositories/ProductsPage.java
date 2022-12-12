package com.rise.elementrepositories;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rise.utilities.PageUtility;

public class ProductsPage {
	
	WebDriver driver;
	
	PageUtility pu = new PageUtility();
	
	@FindBy(xpath = "//span[@class='title']")
	WebElement pageTitle;
	
	@FindBy(xpath = "//button[text()='Add to cart']")
	List<WebElement> addToCartButtonList;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement cartLink;
	
	public ProductsPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle()
	{
		return pu.getElementText(pageTitle);
	}
	
	public void selectThreeItemsRandomly()
	{
		pu.randomCLickOfNButtons(addToCartButtonList, 3);
	}
	
	public void clickOnCartLink()
	{
		pu.clickOnElement(cartLink);
	}

}
