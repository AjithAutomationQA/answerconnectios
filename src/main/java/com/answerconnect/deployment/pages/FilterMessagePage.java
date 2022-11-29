package com.answerconnect.deployment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class FilterMessagePage extends BasePages {

	public FilterMessagePage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"tab_navbar_title\"]")
	public WebElement pageTitle;
	
	
	public void filter() {
		
		System.out.println("filter working");
	}

}
