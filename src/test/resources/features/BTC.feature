Feature: Search 

@AcceptanceTest 
Scenario: Successful search 
	Given I navigate to "BTCTurk Destek" page on URL "http://destek.btcturk.com/" 
	When I fill in search with "para" 
	And I click search button