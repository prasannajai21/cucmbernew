package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.stepdefinition.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class facebook extends Baseclass {
   
	@Given("To Launch the chrome browser and maximize window")
	public void to_Launch_the_chrome_browser_and_maximize_window() {
		launchBrowser();
		windowmaximize();	   
	}
	@When("To launch the url")
	public void to_launch_the_url() {
		launchurl("https://www.facebook.com/");
	}
	
	@When("To Pass the data {string} in email field")
	public void to_Pass_the_data_in_email_field(String em) {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(em);
	    
	}

	@When("To Pass the data {string} in Password field")
	public void to_Pass_the_data_in_Password_field(String pas) {
	    WebElement passw = driver.findElement(By.id("pass"));
	    passw.sendKeys(pas);
	}

	@When("To click the Login button")
	public void to_click_the_Login_button() {
		WebElement clk = driver.findElement(By.name("login"));
		clickbtn(clk);
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closebrowser();
	}

}
