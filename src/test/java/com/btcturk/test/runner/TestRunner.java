package com.btcturk.test.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.btcturk.framework.driver.Driver;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.DriverManagerType;

@CucumberOptions(features = "src/test/resources/features", glue = { "com.btcturk.test.stepDefinitions" }, plugin = { "pretty",
		"html:target/cucumber" }, tags = {"@Test"})
public class TestRunner extends AbstractTestNGCucumberTests {

	@Parameters({"driverType"})
	@BeforeClass
	public void initializeTest(DriverManagerType driverType) {

		Driver.initiliaze(driverType);

	}

	@AfterClass
	public void cleanUp() {

		if (Driver.instance != null) {
			Driver.close();
		}
	}
}