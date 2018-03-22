package com.btcturk.framework.page.assertions;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.btcturk.framework.page.objects.SearchResultPage;

public class SearchResultPageAssertions extends AssertionsCommon {

	SearchResultPage sPage = new SearchResultPage();
	
	public void assertResultCount() {
		
		Assert.assertTrue(Integer.parseInt(sPage.resultHead.getText().trim().split(" ")[0]) > 0);
		
	}

	public void assertResultsValid() throws Exception {
		
		for (WebElement result : sPage.resultsList) {
			assertUrlValidity(result.getAttribute("href"));
		}
		
	}

	public void assertZeroResult(String returnZero) {
	
		Assert.assertEquals(sPage.resultHead.getText(), returnZero);
		
	}

	public void assertSorry(String sorryMessage) {
		
		Assert.assertEquals(sPage.resultBody.getText(), sorryMessage);
		
	}

}
