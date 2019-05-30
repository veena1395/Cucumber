package com.stepdeenition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerSteps {
	static WebDriver driver;
	@Given("The user s in telecom home page")
	public void the_user_s_in_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\K.NISHANTH\\eclipse-workspace LiveProject\\Cucucmber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		
	}

	@Given("The user click on add customer")
	public void the_user_click_on_add_customer() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		
	}

	@When("The user is filling all the fields")
	public void the_user_is_filling_all_the_fields() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys("abc");
		driver.findElement(By.id("lname")).sendKeys("x");
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("tamilnadu");
		driver.findElement(By.id("telephoneno")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

	@When("The user click on submit button")
	public void the_user_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("The usr should be displayed the customer id")
	public void the_usr_should_be_displayed_the_customer_id() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}


}
