package com.btcturk.framework.page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.btcturk.framework.driver.Driver;

public class BasePage {

	public BasePage() {

		PageFactory.initElements(Driver.instance, this);

	}

	@FindBy(how = How.ID, using = "q")
	public WebElement searchInput;

	@FindBy(how = How.ID, using = "support-search-submit")
	public WebElement searchButton;
	
	@FindAll(@FindBy(how = How.CSS, using = "#desk-rightcol > a"))
	public List<WebElement> contactLinks;

}
