package com.rise.testcase;

import org.testng.annotations.DataProvider;

import com.rise.utilities.ExcelUtility;

public class testDataProvider {
  
	ExcelUtility read = new ExcelUtility();
	
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {read.readData(1, 0), read.readData(1, 1) },
      new Object[] {read.readData(2, 0), read.readData(1, 1) },
      new Object[] {read.readData(3, 0), read.readData(1, 1) },
      new Object[] {read.readData(4, 0), read.readData(1, 1) },
    };
  }
}
