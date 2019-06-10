package com.stepdeenition;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerSteps {
	@Given("The user s in telecom home page")
	public void the_user_s_in_telecom_home_page() {
		Hook.driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}
	

	@When("The user is filling all the fields")
	public void the_user_is_filling_all_the_fields() {
		Hook.driver.findElement(By.xpath("//label[@for='done']")).click();
		Hook.driver.findElement(By.id("fname")).sendKeys("abc");
		Hook.driver.findElement(By.id("lname")).sendKeys("x");
		Hook.driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		Hook.driver.findElement(By.name("addr")).sendKeys("tamilnadu");
		Hook.driver.findElement(By.id("telephoneno")).sendKeys("1234567890");

	}

	@When("The user click on submit button")
	public void the_user_click_on_submit_button() {
		Hook.driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("The usr should be displayed the customer id")
	public void the_usr_should_be_displayed_the_customer_id() {
		Assert.assertTrue(Hook.driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}

	@Given("user has to goes to home page")
	public void user_has_to_goes_to_home_page() {
		Hook.driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();

	}

	@When("user fill tarif plan details {string},{string},{string},{string},{string},{string},{string}")
	public void user_fill_tarif_plan_details(String MR, String FreeLM, String FreeInterM, String FreeSms,
			String LocalCharge, String Internationalcharge, String SmsperCharge) {
		Hook.driver.findElement(By.id("rental1")).sendKeys(MR);
		Hook.driver.findElement(By.id("local_minutes")).sendKeys(FreeLM);
		Hook.driver.findElement(By.id("inter_minutes")).sendKeys(FreeInterM);
		Hook.driver.findElement(By.id("sms_pack")).sendKeys(FreeSms);
		Hook.driver.findElement(By.id("minutes_charges")).sendKeys(LocalCharge);
		Hook.driver.findElement(By.id("inter_charges")).sendKeys(Internationalcharge);
		Hook.driver.findElement(By.id("sms_charges")).sendKeys(SmsperCharge);

	}

	@Then("user has to get succeed message")
	public void user_has_to_get_succeed_message() {
		Assert.assertTrue(Hook.driver.findElement(By.tagName("h2")).isDisplayed());
	}
}
