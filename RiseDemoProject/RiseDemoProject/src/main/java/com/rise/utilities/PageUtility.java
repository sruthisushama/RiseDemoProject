package com.rise.utilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageUtility {
	
	public void inputDataToTextField(WebElement element,String data) {
		 element.sendKeys(data);
	}
	public void clickOnElement(WebElement element) {
		element.click();
	}
	
	public String getPageUrl(WebDriver driver)
	{
		return driver.getCurrentUrl();
	}
	
	public String getElementText(WebElement element)
	{
		return element.getText();
	}
	
	public void randomCLickOfNButtons(List<WebElement> buttonList, int n)
	{
		for(int i=0;i<n;i++)
		{
			buttonList.get(i).click();
		}
	}
	
	public int getElementListCount(List<WebElement> elementList)
	{
		return elementList.size();
	}


}
