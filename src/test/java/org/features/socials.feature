Feature: Social media links
  Background:
    Given user is on the website saucedemo
    And Logged in

    Scenario: navigate to twitter account
      When user clicks on twitter icon
      Then user should go to twitter