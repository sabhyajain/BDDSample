Feature: Free CRM Login
   
  Scenario: Free CRM Login Test scenario
  
    Given User is already on Login Page
     When User enters credentials
       |          username    | password |
  	   |sabhya93jain@gmail.com| Active@01|
     Then Should display home page
     Then close the browser
   
 
