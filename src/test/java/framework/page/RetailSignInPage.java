package framework.page;

import org.openqa.selenium.support.PageFactory;

import framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup{
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}

}
