Feature: Login

Scenario: open browser and enter test url login page should be displayed, enter valid username and 
password click on login button home page should be displayed

Given open browser and enter url
Then login page should be displayed 
When enter valid username, valid password
And click on login button
Then Home page should be displayed.