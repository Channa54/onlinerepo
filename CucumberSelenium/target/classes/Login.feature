@login
Feature:login feature

Background:
Given user is on login page

@positive
Scenario:positive login feature
When user enters "admin" and "admin@123"
And user clicks on submit button
Then user is on home page
 
@negative
Scenario Outline:negative login feature
When user enters "<user>" and "<pass>"
And user clicks on submit button
Then user is on same page
Examples:

|user|pass|
|admin@|4366|
||sdfw|
|syu||
    
@tag
Scenario:positive login feature
When user enters credentials
|user|admin|
|pass|admin@34|
|mob|367229789|
And user clicks on submit button
Then user is on home page
    
    
    
    
    
    
    
