package framework.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup{
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}

	
	// Login 
		@FindBy(id = "signinLink")
		public WebElement signinOption;
		
		@FindBy(id = "email")
		public WebElement emailField;
		
		@FindBy(id = "password")
		public WebElement passwordField;
		
		@FindBy(xpath = "//button[contains(text(),'Login')]")
		public WebElement loginButton;
		
		@FindBy(id = "newAccountBtn")
		public WebElement createNewAccountbtn;
		
		@FindBy(id = "nameInput")
		public WebElement nameField;
		
		@FindBy(id = "emailInput")
		public WebElement signUpEmailField;
		
		@FindBy(id = "passwordInput")
		public WebElement signUpPassword;
		
		@FindBy(id = "confirmPasswordInput")
		public WebElement signupConfrimpassword;
		
		@FindBy(id = "signupBtn")
		public WebElement signUpButton;
		
		@FindBy(id = "//h1[contains(text(),'Your Profile')]")
		public WebElement profileText;
	
	
	
	
}
