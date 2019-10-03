package com.automation.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.constants.Constants;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	// constructor
	public TestBase() {
		try {
			prop = new Properties();
			File file = new File("C:\\Users\\naresh.jakka\\FrameWorks\\FrameWork1\\src\\"
					+ "main\\java\\com\\automation\\config\\config.properties");
			FileInputStream fis = new FileInputStream(file);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void init() {

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\naresh.jakka\\FrameWorks\\FrameWork1\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\naresh.jakka\\FrameWorks\\FrameWork1\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constants.IMLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
