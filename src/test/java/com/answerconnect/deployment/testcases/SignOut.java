package com.answerconnect.deployment.testcases;

import org.testng.annotations.Test;

import com.answerconnect.deployment.pages.Sign_Out_Page;

public class SignOut extends BaseTest {
	

	@Test(description = "SignOut")
	public void signOut() throws Throwable
	{
		childTest= test.createNode("SignOut").assignAuthor("Ajith Kumar").assignCategory("Smoke").assignDevice("iPhone 7 OS 14");
		System.out.println("extent report");
		Sign_Out_Page signOutPage = new Sign_Out_Page();
		signOutPage.signOut();
	}

}
