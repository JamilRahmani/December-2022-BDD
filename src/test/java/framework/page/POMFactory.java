package framework.page;

import framework.base.BaseSetup;

public class POMFactory extends BaseSetup{
	
	private RetailHomePage homePgae;
	private RetailSignInPage signInPage;

	public POMFactory() {
		this.homePgae = new RetailHomePage();
		this.signInPage = new RetailSignInPage();
	}
	
	public RetailHomePage homePage() {
		return this.homePgae;
	}
	
	public RetailSignInPage signInPage() {
		return this.signInPage;
	}
	
}
