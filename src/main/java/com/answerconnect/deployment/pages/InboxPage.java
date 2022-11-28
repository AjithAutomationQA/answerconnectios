package com.answerconnect.deployment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class InboxPage extends BasePages {

	public InboxPage() {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"tab_navbar_title\"]")
	public WebElement pageTitle;

	@iOSFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"inboundmessagecell_title\"])[1]")
	public WebElement inboxMessage;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"interactiondetail_header_backbutton\"]")
	public WebElement backButton;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"interactiondetail_header_namebutton\"]")
	public WebElement messageHeaderName;

	@iOSFindBy(xpath = "// XCUIElementTypeButton[@name=\"interactiondetails_share_button\"]")
	public WebElement shareButton;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Share through Email\"]")
	public WebElement shareThroughEmail;

	@iOSFindBy(xpath = "// XCUIElementTypeTextField[@name=\"addnoteview_mailtotextfield\"]")
	public WebElement toMailId;

	@iOSFindBy(xpath = "// XCUIElementTypeStaticText[@name=\"Your Message\"]")
	public WebElement writeMessage;

	@iOSFindBy(xpath = "// XCUIElementTypeStaticText[@name=\"Send\"]")
	public WebElement sendButton;

	@iOSFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"tnteractiondetailssharecollectionviewcell_nameLabel\"])[4]")
	public WebElement searchButton;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@name=\"search_baseView_searchText\"]")
	public WebElement searchConnect;
	
	@iOSFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Share\"])[2]")
	public WebElement share;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"interactiondetail_header_moreoptionsbutton\"]")
	public WebElement moreOption;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Move to Archive\"]")
	public WebElement archiveButton;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Move to Trash\"]")
	public WebElement deleteButton;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Give Feedback\"]")
	public WebElement feedbackButton;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
	public WebElement cancelButton;
	
	@iOSFindBy(xpath  = "//XCUIElementTypeApplication[@name=\"AnswerConnect\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTextView")
	public WebElement writeFeedback;
	
	@iOSFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Button\"])[1]")
	public WebElement happyEmoji;
	
	@iOSFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Button\"])[2]")
	public WebElement sadEmoji;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"chat send active icon\"]")
	public WebElement sendActiveIcon;
	

	
//  
	
	
	public void selectMessage() throws Throwable {

		try {

			System.out.println("User is in inbox");
			isDisplayed(pageTitle);
			assertEquals(pageTitle, "Inbox", "User is in inbox page");
			wait(inboxMessage);
			String messageName = getText(inboxMessage);
			tapTheElement(inboxMessage, "Message");
			assertEquals(messageHeaderName, messageName, "Message is clicked");
			
			//XCUIElementTypeStaticText[@name="Share via Connect"]
			takeSS(getBase64());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	public void shareThroughMail() throws Throwable {

		try {
			System.out.println("Share message through mail");
			selectMessage();
			tapTheElement(shareButton, "Share button");
			tapTheElement(shareThroughEmail, "Share through email");
			sendKey(toMailId, "ajithautomationqatester@gmail.com", "To Mail ID");
			sendKey(writeMessage, "This is an automation email for testing", "Write message");
			tapTheElement(sendButton, "Send button");
			tapTheElement(backButton, "Back button");
			takeSS(getBase64());

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();

		}
	}
	
	public void shareViaConnect() throws Throwable {

		try {
			System.out.println("Share message via connect");
			selectMessage();
			tapTheElement(shareButton, "Share button");
			tapTheElement(searchButton, "Search button");
			sendKey(searchConnect, "Arun Prasath", "Search bar");

			xpathByText("Arun Prasath", "Search bar");
			tapTheElement(share, "Share");
			tapTheElement(backButton, "Back button");
			takeSS(getBase64());

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();

		}
	}
	
	public void archiveMessage() throws Throwable {

		try {
			System.out.println("Archive a message");
			selectMessage();
			tapTheElement(moreOption, "More option");
			tapTheElement(archiveButton, "Archive button");
		
			takeSS(getBase64());

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();

		}
	}
	
	public void deleteMessage() throws Throwable {

		try {
			System.out.println("Delete a message");
			selectMessage();
			tapTheElement(moreOption, "More option");
			tapTheElement(deleteButton, "Delete button");
		
			takeSS(getBase64());

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();

		}
	}
	
	public void feedback() throws Throwable {

		try {
			System.out.println("Delete a message");
			selectMessage();
			tapTheElement(moreOption, "More option");
			tapTheElement(feedbackButton, "Feedback button");
			sendKey(writeFeedback, "Automation feedback", "Write feedback");
			tapTheElement(happyEmoji, "Feedback button");
			tapTheElement(sendActiveIcon, "Send active icon");
			takeSS(getBase64());
		
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();

		}
	}
	
}
