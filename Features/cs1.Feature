Feature: Signup Feature
Scenario: User registers on TestMe App
	Given the Signup page is opened
	When user enters username as "ssntkr12556"
	And user enters Firstname as "Sushant"
	And user enters Lastname as "Kumar"
	And user enters password as "pass345"
	And user enters confirm password as "pass345" 
 	And user enters gender as "male"
	And user enters "skersad@gmail.com" as Email
	And user enters "9786756453" as Mobile Number
	And user enters "5/12/1989" as DOB
	And user enters "bengaluru" as Address 
	And user enters the security question and its answer
	And user clicks on register button
	Then user registers successfully and finds himself on login page
	
	