package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Loginpage extends TestBase {
	
	@FindBy(xpath="//a[@class='signinwithemail']")
	WebElement email;
	
	@FindBy(name="j_username")
	WebElement username ;
	
	@FindBy(name="j_password")
	WebElement password ;
	
	@FindBy(id="loginajax")
	WebElement submit;
	
	public Loginpage() {
		init();
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickEmail() {
		email.click();
	}
	
	public void enterusername(String un) {
		username.sendKeys(un);
	}
	
	public void enterpassword(String pw) {
		password.sendKeys(pw);
	}
	
	public void clicksubmit() {
		submit.click();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
}
