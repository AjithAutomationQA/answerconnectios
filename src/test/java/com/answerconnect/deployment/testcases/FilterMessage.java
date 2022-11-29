package com.answerconnect.deployment.testcases;

import org.testng.annotations.Test;

import com.answerconnect.app.base.AutomationTest;
import com.answerconnect.deployment.pages.FilterMessagePage;

public class FilterMessage  extends AutomationTest{

	@Test(description = "Filter")
	public void filtermessage() throws InterruptedException
	{
		childTest= test.createNode("Filter").assignAuthor("Ajith Kumar").assignCategory("Smoke").assignDevice("iPhone 7 OS 14");
		System.out.println("extent report");
		FilterMessagePage filterMessagePage = new FilterMessagePage();
		filterMessagePage.filter();
	}

}
