package com.btcturk.framework.page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.btcturk.framework.driver.Driver;

public class SearchResultPage extends BasePage {
	
	public SearchResultPage() {
		
		PageFactory.initElements(Driver.instance, this);
		
	}
	
	@FindBy(how = How.CLASS_NAME, using = "support-head")
	public WebElement resultHead;
	
	@FindBy(how = How.CLASS_NAME, using = "support-body")
	public WebElement resultBody;
	
	@FindAll(@FindBy(how = How.CSS, using = ".row-fluid.search-result.article a"))
	public List<WebElement> resultsList;

}
