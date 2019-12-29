Feature: Login feature 

Scenario Outline: Testing log in with correct credentials 
	Given  At the page 
	When Enter <username> and <password> 
	And Click on log in 
	Then Redirect me to correct page 
	
	Examples: 
		|username|password|
		|jiazhao|jiazhao|
		|zhang|zhang|
		|jz123|123jz|
		
Scenario: Testing log in with invalid credentials 
	Given  At the page 
	When Enter invalid username and password 
	And Click on log in 
	Then Pop up warning