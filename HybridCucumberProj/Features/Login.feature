@login
Feature:login feature

Background:
Given user is on login page

@positive
Scenario:positive login feature
When user enters "admin" and "admin@123"
And user clicks on submit button
Then user is on home page
 

    
    
    
