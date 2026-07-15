package com.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	@Given("^user navigate to login page$")
	public void user_navigate_to_login_page() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@When("^user enetrred username$")
	public void user_enetrred_username() {
		
	}

	@When("^password$")
	public void password() {
		
	}

	@Then("^click on login button$")
	public void click_on_login_button() {
		
	}

}
