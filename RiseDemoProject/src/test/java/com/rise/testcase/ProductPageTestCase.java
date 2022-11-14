package com.rise.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rise.constant.Constant;
import com.rise.elementrepositories.LoginPage;
import com.rise.elementrepositories.ProductsPage;
import com.rise.elementrepositories.YourCartPage;


public class ProductPageTestCase extends BaseClass {
	
	LoginPage lp;
	ProductsPage pp;
	YourCartPage yp;
	
  @Test(dataProvider="dp", dataProviderClass=testDataProvider.class)
  public void testCase01VerifythatThreeItemsAddedInCart(String username, String password) {
	  
	  lp = new LoginPage(driver);
	  lp.enterUserName(username);
	  lp.enterPassword(password);
	  lp.clickLoginButton();
	  
	  pp = new ProductsPage(driver);
	  
	  pp.selectThreeItemsRandomly();
	  pp.clickOnCartLink();
	  
	  yp = new YourCartPage(driver);
	  
	  int expected = 3;
	  int actual = yp.getCartListCount();
	  
	  Assert.assertEquals(actual, expected, Constant.ASSERT_MESSAGE);
	  
  }
}
