Feature: Home page
 
  Scenario: Login with correct credentials
   Given navigate to "https://profile.w3schools.com"
    When insert "rtoor04@gmail.com" and "Abc@1234" and click on login button
    Then user should land on home page
    When then it should click on videos menu
    Then user should land on videos menu page
    
   