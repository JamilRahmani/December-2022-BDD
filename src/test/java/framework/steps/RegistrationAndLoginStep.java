package framework.steps;

import org.junit.Assert;

import framework.page.POMFactory;
import framework.utilities.CommonUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationAndLoginStep extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	//Login Steps
	
	@When("User click on sign in option")
	public void userClickOnSignInOption() {
		click(factory.signInPage().signinOption);
		logger.info("User cliked on the sign in option");

	}
	@When("User enter emial {string} and password {string}")
	public void userEnterEmialAndPassword(String email, String password) {
		sendText(factory.signInPage().emailField, email);
		sendText(factory.signInPage().passwordField, password);
		logger.info("User entered email "+ email+ " and password " + password);
		slowDown();
		
	}
	@When("user click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		logger.info("User clicked on login button");
	}
	@Then("user should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().profileText));
		logger.info("user logged into the account");
		slowDown();
	}

}
