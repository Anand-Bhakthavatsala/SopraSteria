Feature: About Testers
	In order to get a High paid job 
	As a Tester 
	I want to learn Automation
	
	Scenario: I am a Manual Tester
		Given I am a "manual" tester
		When I apply for a job
		Then I got "less" paid job
		Then I am "not" satisfied with my salary
		But my parents are "still" satisfied
@SmokeTest
	Scenario: I am a Automation Tester
		Given I am a "Automation" tester
		When I apply for a job
		Then I got "highly" paid job
		Then I am "very" satisfied with my salary
		But my parents are "super" satisfied
		
	Scenario: I am a API Tester
		Given I am a "API" tester
		When I apply for a job
		Then I got "decent" paid job
		Then I am "quite" satisfied with my salary
		But my parents are "super" satisfied
	
	

 