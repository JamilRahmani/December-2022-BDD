Feature: Retail Home page

Background:
		Given User is on retail website
@Test
Scenario: Verify Retail page logo

	Then User verify retail page logo is present

@search	
Scenario: Verify User can search in electronic Department
	When User change the catagory to 'Electronics'
	And User search for item 'PlayStation'
	And user click on search icon
	Then Item should be present
		