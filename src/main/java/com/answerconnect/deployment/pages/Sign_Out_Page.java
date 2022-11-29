package com.answerconnect.deployment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Sign_Out_Page extends BasePages {
	
	public Sign_Out_Page() {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"tabbar_item_more\"]")
	public WebElement moreItem;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My Directory\"]")
	public WebElement myDirectory;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Logout\"]")
	public WebElement logoutOption;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Log Out\"]")
	public WebElement logoutButton;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Email']")
	public WebElement emailId;
	
	
	
	
	public void signOut() throws Throwable {

		try {

			System.out.println("User is in logout page");
			tapTheElement(moreItem, "More item");
			isDisplayed(myDirectory);
			scrollDown(logoutOption, "Log out");
			tapTheElement(logoutOption, "Logout option" );
			tapTheElement(logoutButton, "Logout button");
			isDisplayed(emailId);
			takeSS(getBase64());
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

}
