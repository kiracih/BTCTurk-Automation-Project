Feature: Search 

Background: User navigates to BTCTurk Destek Page 
	Given I navigate to "BTCTurk Home" page on URL "https://www.btcturk.com/" 
	Then I should see "Yardım Merkezi" link 
	When I click "Yardım Merkezi" link 
	Then I'm now on URL contains "destek.btcturk.com" in new tab 
	And I should see search bar 
	And I should see search button 
	
@Test 
Scenario: Search with a valid search term 
	When I fill in search with "para" 
	And I click search button 
	Then I'm now on URL contains "search?q=para" 
	And I should see results more than zero 
	And All results should be valid 
	
@Test 
Scenario: Search with an invalid search term 
	When I fill in search with "asdfghjkl" 
	And I click search button 
	Then I'm now on URL contains "search?q=asdfghjkl" 
	And I should see "0 results found for "asdfghjkl"" zero message 
	And I should see "Sorry. Try searching again or send us an email" sorry message 
	
	
	
	
	
	