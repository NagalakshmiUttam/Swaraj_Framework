package com.swaraj.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.swaraj.pageobjects.loginPage;
import com.swaraj.pageobjects.welcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TC1_WebsiteLoginTest extends BaseClass {
	
	@Test
	public void VerifyLogin() throws IOException 
	{

		logger.info("***************TestCase Verify Login starts*****************"); 

		welcomePage wpg = new welcomePage(driver);

		wpg.clickOnLogin();
		logger.info("Clicked on Login link");

		loginPage loginpg = new loginPage(driver);

		loginpg.enterEmailAddress("newuser@gmail.com");
		logger.info("Entered email address");

		loginpg.enterPassword("newuser@gmail.com@1");
		logger.info("Entered password");

		loginpg.clickLogIn();
		logger.info("Clicked on login button..");


//		registeredUserAccount regUser = new registeredUserAccount(driver);
//		String userName = regUser.getUserName();
//
//
//		if(userName.equals("Prachi Gupta"))
//		{
//			logger.info("VerifyLogin - Passed");
//			regUser.clickOnSignOut();
//			Assert.assertTrue(true);
//		}
//		else
//		{
//			logger.info("VerifyLogin - Failed");
//			captureScreenShot(driver,"VerifyLogin");
//			Assert.assertTrue(false);
//
//		}
//
//		logger.info("***************TestCase Verify Login ends*****************"); 
//
//
//	}
//
//
//	@Test
//	public void VerifySignOut() throws IOException 
//	{
//
//		logger.info("***************TestCase Verify Sign out starts*****************"); 
//
//		indexPage pg = new indexPage(driver);
//
//		pg.clickOnSignIn();
//		logger.info("Clicked on sign in link");
//
//		myAccountPage myAcpg = new myAccountPage(driver);
//
//		myAcpg.enterEmailAddress("cs923@gmail.com");
//		logger.info("Entered email address");
//
//		myAcpg.enterPassword("cs923");
//		logger.info("Entered password");
//
//		myAcpg.clickSignIn();
//		logger.info("Clicked on sign in link..");
//
//
//		registeredUserAccount regUser = new registeredUserAccount(driver);
//		regUser.clickOnSignOut();
//
//		if(pg.getPageTitle().equals("Login - My Store"))
//		{
//			logger.info("VerifySignOut - Passed");
//			Assert.assertTrue(true);
//		}
//
//		else
//		{
//			logger.info("VerifySignOut - Failed");
//			captureScreenShot(driver,"VerifySignOut");
//			Assert.assertTrue(false);
//		}
//
//	
//		logger.info("***************TestCase Verify Sign out ends*****************"); 
//
	}
//
//

}
