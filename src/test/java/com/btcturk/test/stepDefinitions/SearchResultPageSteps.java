package com.btcturk.test.stepDefinitions;

import com.btcturk.framework.page.actions.SearchResultPageActions;
import com.btcturk.framework.page.assertions.SearchResultPageAssertions;

import cucumber.api.java.en.Then;

public class SearchResultPageSteps{

	SearchResultPageActions searchAction = new SearchResultPageActions();
	SearchResultPageAssertions searchAssertion = new SearchResultPageAssertions();
	
	@Then("^I should see results more than zero$")
	public void i_should_see_message() throws Throwable {

		searchAssertion.assertResultCount();

	}
	
	@Then("^All results should be valid$")
	public void result_valid() throws Throwable {
		
		searchAssertion.assertResultsValid();
		
	}
	
	@Then("^I should see \"(.*)\" zero message$")
	public void i_should_see_zero_result(String arg1) throws Throwable {

		searchAssertion.assertZeroResult(arg1);

	}
	
	@Then("^I should see \"(.*)\" sorry message$")
	public void i_should_see_sorry(String arg1) {

		searchAssertion.assertSorry(arg1);

	}
	
	
}
