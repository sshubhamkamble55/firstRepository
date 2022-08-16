package com.FirstProject.qa.Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.FirstProject.qa.Base.BaseClass;
import com.FirstProject.qa.Utility.All_utilities;

public class Login_page extends BaseClass{
	@FindBy (xpath="//img[@class='fb_logo _8ilh img']") private WebElement fb_logo;
	@FindBy (xpath="//h2[contains(text(),'Facebook helps you ')]") private WebElement caption;
	@FindBy (xpath="//input[@name='email']") private WebElement mail;
	@FindBy (xpath="//input[@name='pass']") private WebElement pass;
	@FindBy (xpath="//button[@name='login']") private WebElement log_btn;
	@FindBy (xpath="//a[text()='Forgotten password?']") private WebElement forgotten_pass;
	@FindBy (xpath="//a[@data-testid='open-registration-form-button']") private WebElement newAccount_btn;
	@FindBys({@FindBy (xpath="//div[@id='pageFooterChildren']//a")}) private List<WebElement> fotterLinks;
	
	
	//initiolization
	public Login_page(WebDriver driver){
		PageFactory.initElements(driver, this);
		System.out.println("Elements are initialized");
	}
	
	//usage
	public void varifyFacebookLoginPageLogo(){
		Assert.assertTrue(fb_logo.isDisplayed());
		System.out.println("logo varified");
		Reporter.log("logo is displayed");
	}
	
	public void varifyFbCaption(){
		Assert.assertTrue(caption.isDisplayed());
		Assert.assertEquals(caption.getText(), "Facebook helps you connect and share with the people in your life.");
		System.out.println("varifyFbCaption ");
		Reporter.log("Caption is displayed");
	}
	
	public void varifyFacebookLoginPageForgottenPass(){
		Assert.assertTrue(forgotten_pass.isDisplayed());
		Assert.assertEquals(forgotten_pass.getText(), "Forgotten password?");
		Reporter.log("Forgotten password? is displayed");
	}
	
	public void varifyFacebookLoginPageCreateNewAccount(){
		Assert.assertTrue(newAccount_btn.isDisplayed());
		newAccount_btn.click();
		Reporter.log("Button is displayed");
	}
	
	public void varifyFacebookLoginPageMail(){
		Assert.assertTrue(mail.isDisplayed());
		Assert.assertTrue(mail.isEnabled());
		mail.sendKeys("shubham");
		Reporter.log("Mail is displayed");

	}
	
	public void varifyFacebookLoginPagePass(){
		Assert.assertTrue(pass.isDisplayed());
		Assert.assertTrue(pass.isEnabled());
		pass.sendKeys("shubham");
		Reporter.log("pass is displayed");

	}
	
	public void varifyFooterLinksSize(){
		Assert.assertEquals(fotterLinks.size(), 31);
		Reporter.log("Fotter links is displayed");

	}
	
//	public void takeSS(WebDriver driver) throws IOException{
//		All_utilities utl=new All_utilities();
//		utl.screenshot(driver, "LogIn_PAge");
//		System.out.println("Screenshot Taken");
//	}
//
	public void border(WebDriver driver){
		All_utilities utl=new All_utilities();
		utl.take_border(driver, newAccount_btn);
		System.out.println("Border done");
	}
	
	public void readExcel() throws EncryptedDocumentException, IOException{
		FileInputStream file = new FileInputStream("E:/workspace3/com.FirstProject.qa/src/main/java/com/FirstProject/qa/Testdata/Userid.xlsx");
		int row = WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum();
		System.out.println("row= "+row);
	}

}
