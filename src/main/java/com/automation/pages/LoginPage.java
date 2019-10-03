package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name = "userid")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "logsubmit")
	WebElement loginbutton;

	/*
	 * Constructor to initialize page elements
	 */
	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public void loginToApplication(String un, String pw) {

		username.sendKeys(un);
		password.sendKeys(pw);
		loginbutton.click();
	}

}
