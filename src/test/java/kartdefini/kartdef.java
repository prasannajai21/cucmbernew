package kartdefini;

import org.stepdefinition.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class kartdef extends Baseclass {
	loginpogo l;
	
	@Given("Launch the chrome browser")
	public void launch_the_chrome_browser() {
		launchBrowser();
		windowmaximize();
		
	}

	@When("launch the url of the page")
	public void launch_the_url_of_the_page() {
		launchurl("https://www.flipkart.com/");
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		l = new loginpogo();
		clickbtn(l.getLoginbtn());
	}

	@When("To enter the email or mobile number in field")
	public void to_enter_the_email_or_mobile_number_in_field() {
		l = new loginpogo();
        passtext("rajubhai123",l.getMblenum());
		
	    	}


}
