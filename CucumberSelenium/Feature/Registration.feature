@tag1
Feature: registration Feature
Scenario: positive registration
Given user is on signin page
When enters credentials
|firstname|channu nagwar|
|email|channabasav23nag@gmail.com|
|mobile|8888899999|
|pass|vsjsjh@335|
And user clicks on continue btn
Then user is on home page
