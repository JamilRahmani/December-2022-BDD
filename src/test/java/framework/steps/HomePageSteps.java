package framework.steps;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import framework.page.POMFactory;
import framework.utilities.CommonUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends CommonUtility {
	// all your step definitions classess will extends CommonUtility class
	// We need to create object of POMFactory class
	// POMFactory instance should be on top of the class

	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void user_is_on_retail_website() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();// Wrote this one in commonUtility
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle + " is equal to " + expectedTitle);
	}

	@Then("User verify retail page logo is present")
	public void user_verify_retail_page_logo_is_present() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().logo));
		logger.info("logo is present");

	}

	// ****************Search Scenario************************************

	@When("User change the catagory to {string}")
	public void userChangeTheCatagoryTo(String value) {
		selectByVisibleText(factory.homePage().allDepartment, value);
		logger.info(value + " Was selected from the drop down");
	}

	@When("User search for item {string}")
	public void userSearchForItem(String value) {
		sendText(factory.homePage().searchInputField, value);
		logger.info("user entered " + value);
	}

	@When("user click on search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchButton);
		logger.info("user clicked on search button");
	}

	@Then("Item should be present")
	public void itemShouldBePresent() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().playStationitem));
		logger.info("item is present");
	}

	// **********Verify user can click on all section***********************************
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allElement);
		logger.info("user clicked on All element");
	}
	
	@Then("User verifies {string} is present")
	public void userVerifies(String value) {
		String expectedValue = "Shop By department";
		String actualValue = getElementText(factory.homePage().shopByDepartment);
		assertEquals(expectedValue, actualValue);
		logger.info(actualValue+ " is present " + expectedValue);
	}

}
