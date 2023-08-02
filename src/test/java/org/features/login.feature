
  Feature: sign in
    Scenario: Successful Login with valid credentials
      Given user is on the website saucedemo
      When user fills in user-name textbox with standard_user
      And user fills in password textbox with secret_sauce
      And user clicks login-button
      Then user should see Products title

    #Scenario: Unsuccessful Login
     # When user fills in "user-name textbox" with "not_standard_user"
      #And user fills in "password textbox with "secret_sauce"
      #And user clicks "login-button"
      #Then user should see error message "Epic sadface: Username and password do not match any user in this service" text
