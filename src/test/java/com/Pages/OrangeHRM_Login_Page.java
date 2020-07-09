package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;

public class OrangeHRM_Login_Page extends Library {

	public OrangeHRM_Login_Page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	//Locators
	@FindBy(id = "txtUsername")
	WebElement uname;

	@FindBy(id = "txtPassword")
	WebElement pass;

	@FindBy(id = "btnLogin")
	WebElement login;

	public void login(String username, String password) {
		uname.sendKeys("Admin");
		pass.sendKeys("admin123");
	}
	public void login_Button() {
		login.click();

	}
}
