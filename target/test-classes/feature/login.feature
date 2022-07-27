Feature: login verification

  Scenario: : verify  login page with valid credentials
    Given user lunching application
    When user enter '<username>' and '<password>' and click
    Then user should be navigated to home page
    
   Examples:
 
      | username | password |
      | user1    | pwd1     |
      | user2    | pwd2     |
      | admin    | admin123 |
  