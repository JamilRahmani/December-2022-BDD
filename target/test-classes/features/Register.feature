Feature: 

  Background: 
    Given User is on retail website
@Login
  Scenario: Verify user can sign in into Retail application
    When User click on sign in option
    And User enter emial 'khan@gmail.com' and password 'password1$'
    And user click on login button
    Then user should be logged in into Account
