package com.answerconnect.deployment.testcases;

import org.testng.annotations.Test;

import com.answerconnect.deployment.pages.InboxPage;

public class Inbox extends BaseTest{
	

		@Test(description = "Inbox")
		public void inbox() throws Throwable
		{
			childTest= test.createNode("Inbox").assignAuthor("Ajith Kumar").assignCategory("Smoke").assignDevice("iPhone 7 OS 14");
			System.out.println("extent report");
			InboxPage inboxPage = new InboxPage();
		//	inboxPage.selectMessage();
			inboxPage.shareThroughMail();
		//	inboxPage.shareViaConnect();
		//	inboxPage.archiveMessage();
		//	inboxPage.deleteMessage();
		//	inboxPage.feedback();
		}
		

}
