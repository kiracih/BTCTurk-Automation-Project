package com.btcturk.framework.page.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.btcturk.framework.driver.Driver;
import com.btcturk.framework.page.objects.BasePage;

public class ActionsCommon {
	
	BasePage bPage = new BasePage();

	public void click(WebElement element) {

		element.click();

	}

	public void pressKey(WebElement element, String key) {

		try {
			element.sendKeys(Keys.valueOf(key));
		} catch (Exception e) {
			System.out.println(e.getMessage() + " " + e.getCause());
		}

	}

	public void clickButton(String buttonText) {

		WebElement button = Driver.instance.findElement(
				By.xpath("//button[(text() = '" + buttonText + "') or ./*/text() = '" + buttonText + "']"));
		button.click();

	}
	
	public void clickSearch() {
		
		click(bPage.searchButton);
	}

	public void fillInWith(WebElement element, String fillWord) {

		element.clear();
		element.sendKeys(fillWord);

	}
	
	public void fillInSearchWith(String searchTerm) {
		
		fillInWith(bPage.searchInput, searchTerm);
		
	}

	public void clickLink(String linkText) {
		
		WebElement link = Driver.instance.findElement(
				By.xpath("//a[(text() = '" + linkText + "') or ./*/text() = '" + linkText + "']"));
		link.click();
		
	}

}
