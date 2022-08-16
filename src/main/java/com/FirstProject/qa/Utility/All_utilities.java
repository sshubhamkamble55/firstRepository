package com.FirstProject.qa.Utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.FirstProject.qa.Base.BaseClass;

public class All_utilities{
	public void screenshot(WebDriver driver,String FileName) throws IOException{
		File sourse = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		String name = "E:/java_Screenshots//"+FileName+"_"+d.toString().replace(":", "_").replace(" ", "_")+".png";
		File dest=new File(name);
		FileUtils.copyFile(sourse, dest);
	}
	
	public void take_border(WebDriver driver, WebElement element){
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='15px solid red'", element);
	}

}
