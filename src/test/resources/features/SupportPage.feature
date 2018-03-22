Feature: Search 

Background: User navigates to BTCTurk Destek Page 
	Given I navigate to "BTCTurk Home" page on URL "https://www.btcturk.com/" 
	Then I should see "Yardım Merkezi" link 
	When I click "Yardım Merkezi" link 
	Then I'm now on URL contains "destek.btcturk.com" 
	And I should see search bar 
	And I should see search button 
	
@Test 
Scenario: Successful search 
	When I fill in search with "para" 
	And I click search button