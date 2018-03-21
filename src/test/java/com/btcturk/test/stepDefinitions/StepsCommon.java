package com.btcturk.test.stepDefinitions;

import com.btcturk.framework.page.actions.ActionsCommon;
import com.btcturk.framework.driver.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepsCommon {

	ActionsCommon action = new ActionsCommon();

	@Given("^I navigate to \"([^\"]*)\" page on URL \"([^\"]*)\"$")
	public void i_navigate_to_page_on_URL(String arg1, String arg2) throws Throwable {

		Driver.goToURL(arg2);

	}

	@When("^I click \"([^\"]*)\" button$")
	public void i_click_button(String arg1) throws Throwable {

		action.clickButton(arg1);

	}

	@When("^I fill in search with \"([^\"]*)\"$")
	public void i_fill_in_search(String arg1) throws Throwable {

		action.fillInSearchWith(arg1);

	}

	@When("^I click search button$")
	public void i_click_search_button() throws Throwable {

		action.clickSearch();

	}
}
