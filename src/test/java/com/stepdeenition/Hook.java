package com.stepdeenition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	static WebDriver driver;
	@Before
	public static void browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\K.NISHANTH\\eclipse-workspace LiveProject\\Cucucmber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	}

	@After
	public static void Quit() {
		driver.close();
		driver.quit();
	}

}
