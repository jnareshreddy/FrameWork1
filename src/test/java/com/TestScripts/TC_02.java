package com.TestScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.base.TestBase;
import com.automation.pages.LoginPage;

public class TC_02 extends TestBase {

	public TC_02() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		// new TC_01();
		init();
	}

	@Test
	public void test() {
		LoginPage login = new LoginPage();
		login.loginToApplication(prop.getProperty("usernam"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
