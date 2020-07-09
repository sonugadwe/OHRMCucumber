package com.StepDefination;

import com.BaseClass.Library;
import com.Pages.OrangeHRM_Login_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Step extends Library {
	OrangeHRM_Login_Page login=new OrangeHRM_Login_Page(driver);
	
	@Given("^To launch the browser and navigate to url$")
	public void to_launch_the_browser_and_navigate_to_url() throws Throwable {
	    browserSetUp();
	}

	@When("^User Enter details \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Enter_details_and(String username, String password) throws Throwable {
	    login.login(username, password);
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    login.login_Button();
	}

}
