package com.rise.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShotCapture {
	
	public void captureScreenShot(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot scrShot = (TakesScreenshot) driver; //creating object of interface TakesScreenshot
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE); //capturing screenshot code

		File f1 = new File(System.getProperty("user.dir") + "\\OutputScreenshot");
		if (!f1.exists()) {
			f1.mkdirs(); //java command to create directory
		}
		
		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date()); //code to access current system date and time


		File finalDestination = new File(
				System.getProperty("user.dir") + "\\OutputScreenshot\\" + name + timeStamp + ".png");

		FileHandler.copy(screenShot, finalDestination);
	}

}
