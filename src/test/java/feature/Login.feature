Feature: Login page

  Scenario: Login with correct credentials
    Given Navigate to "https://profile.w3schools.com"
    When Insert "rtoor204@gmail.com" and "Abc@1234" and click on login button
    Then User should land on home page
    
    
    ## Scenario: Login with incorrect crendential
    ##Given Navigate to "https://profile.w3schools.com"
    ##When Insert "rtoor20@gmail.com" and "Abc@123" and click on login button
    ## Then A email with user does not exist
    
    ##Scenario: Login with empty username and password
    ##Given  Navigate to "https://profile.w3schools.com"
    ##When Insert " " and " " and click on login button
    ##Then User get message please enter email and password
    
    ##Scenario: Login with correct username and wrong password
    ##Given  Navigate to "https://profile.w3schools.com"
    ##When Insert "rtoor204@gmail.com" and "Abc@123" and click on login button 
    ##Then User get message Make sure you type your email and password correctly Both your password and email are casesensitive
    
    ##Scenario: Login with incorrect username and correct password
    ##Given  Navigate to "https://profile.w3schools.com"
    ##When Insert "rtoor20@gmail.com" and "Abc@1234" and click on login button
    ##Then A user with this email does not exist