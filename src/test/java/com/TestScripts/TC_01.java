package com.TestScripts;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.base.TestBase;
import com.automation.pages.LoginPage;

public class TC_01 extends TestBase {

	Logger log = Logger.getLogger(TC_01.class);

	public TC_01() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		// new TC_01();
		log.info("************Starting Test Execution************");
		init();
	}

	@Test
	public void test() {
		LoginPage login = new LoginPage();
		login.loginToApplication(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		log.info("************Chrome Browser Cloded************");
		log.info("************Stopped Test Execution************");
	}
}
