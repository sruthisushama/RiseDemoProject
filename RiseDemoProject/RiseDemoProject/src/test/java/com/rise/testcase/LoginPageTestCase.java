package com.rise.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rise.constant.Constant;
import com.rise.elementrepositories.LoginPage;
import com.rise.elementrepositories.ProductsPage;

/*
 * testCase01VerifyValidthatUserCanLoginAndLockedUserCannotLogin() verifies that the valid users are able to navigate to products page,also 
 * testCase01VerifyValidthatUserCanLoginAndLockedUserCannotLogin() verifies that the blocked user is not able to login.
 * testCase01VerifyValidthatUserCanLoginAndLockedUserCannotLogin() accepting parameters from testDataProvider
 */

public class LoginPageTestCase extends BaseClass {
	
	LoginPage lp;
	ProductsPage pp;
	
	
  @Test(dataProvider = "dp", dataProviderClass = testDataProvider.class)
  public void testCase01VerifyValidthatUserCanLoginAndLockedUserCannotLogin(String username,String password) {
	  
	  lp = new LoginPage(driver);
	  
	  lp.enterUserName(username);
	  lp.enterPassword(password);
	  
	  String url1 = lp.getCurrentPageUrl();
	  
	  lp.clickLoginButton();
	  
	  String url2 = lp.getCurrentPageUrl();
	  
	  String expected; 
	  String actual ;
	  if(!url1.equals(url2))
	  {
		  pp = new ProductsPage(driver);
		   expected = "PRODUCTS";
		   actual = pp.getPageTitle() ;
	  }
	  else
	  {
		   expected = "Epic sadface: Sorry, this user has been locked out.";
		   actual = lp.lockedUserMessage();
	  }
	  
	 Assert.assertEquals(actual, expected, Constant.ASSERT_MESSAGE);
	  
	  
  }
}
