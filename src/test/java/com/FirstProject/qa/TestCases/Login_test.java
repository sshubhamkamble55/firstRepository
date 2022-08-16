package com.FirstProject.qa.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.FirstProject.qa.Base.BaseClass;
import com.FirstProject.qa.Pages.Login_page;
import com.FirstProject.qa.Pages.RegistrationPage;

public class Login_test extends BaseClass {
	
	@BeforeClass
	public void openingBrowser(){
		openingBrowser("chrome");
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException{
		Thread.sleep(3000);
		driver.close();
		System.out.println("Closed successfully");
	}
	
	@Test
	public void varifyLoginPage() throws IOException{
		Login_page lp=new Login_page(driver);
		lp.varifyFacebookLoginPageLogo();
		lp.varifyFbCaption();
		lp.varifyFooterLinksSize();
		lp.varifyFacebookLoginPageForgottenPass();
		lp.varifyFacebookLoginPageMail();
		lp.varifyFacebookLoginPagePass();
		lp.varifyFacebookLoginPageCreateNewAccount();
		//lp.takeSS(driver);
		lp.readExcel();
		lp.border(driver);
		System.out.println("Success");
	}
	
	@Test
	public void varifyReg_page() throws IOException{
		RegistrationPage rp = new RegistrationPage(driver);
		rp.varify_reg_name();
		rp.varify_reg_lastName();
		rp.varify_reg_mail();
		rp.varify_reg_pass();
		//rp.takeSS(driver);
		
	}
}
