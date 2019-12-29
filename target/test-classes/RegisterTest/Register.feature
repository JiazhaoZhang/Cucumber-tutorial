Feature: Register a user 

Scenario: Register a user with valid username and password 
	Given in the regiser page 
	When  enter username and password 
		|username|password|address|gender|
		|Jiazhao|jz123|36 Jack Aaron|male|
		|Curry|steph3points|Golden State|male|
		
	And   click on register button 
	Then  show register window 