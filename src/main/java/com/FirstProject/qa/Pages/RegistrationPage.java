package com.FirstProject.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.FirstProject.qa.Base.BaseClass;
import com.FirstProject.qa.Utility.All_utilities;

public class RegistrationPage extends BaseClass{
	@FindBy (name="firstname") private WebElement reg_name;
	@FindBy (name="lastname") private WebElement reg_last;
	@FindBy (name="reg_email__") private WebElement reg_mail;
	@FindBy (name="reg_passwd__") private WebElement reg_pass;
	@FindBy (name="birthday_day") private WebElement reg_dob;
	@FindBy (name="birthday_month") private WebElement reg_mob;
	@FindBy (name="birthday_year") private WebElement reg_yob;
	@FindBy (xpath="//label[text()='Male']") private WebElement reg_gender;
	
	public RegistrationPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void varify_reg_name(){
		Assert.assertTrue(reg_name.isDisplayed(), "not displayed");
		Assert.assertTrue(reg_name.isEnabled(), "Enabled");
		Reporter.log("Registration page is Varified");
		reg_name.sendKeys("shubham");
	}
	
	public void varify_reg_lastName(){
		Assert.assertTrue(reg_last.isDisplayed(), "not displayed");
		Assert.assertTrue(reg_last.isEnabled(), "Enabled");
		Reporter.log("Registration page is Varified");
		reg_last.sendKeys("kamble");
	}
	
	public void varify_reg_mail(){
		Assert.assertTrue(reg_mail.isDisplayed(), "Mail id not displayed");
		reg_mail.sendKeys("shubham@gmail.com");
		Reporter.log("varify_reg_mail");
	}
	
	public void varify_reg_pass(){
		Assert.assertTrue(reg_pass.isDisplayed(), "Password is diaplayed");
		reg_pass.sendKeys("shubham");
	}
	
	public void takeSS(WebDriver driver) throws IOException{
		All_utilities utl=new All_utilities();
		utl.screenshot(driver, "reg_PAge");
		System.out.println("Screenshot Taken");
	}

}
