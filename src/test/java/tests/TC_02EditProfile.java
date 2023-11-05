/**
 * 
 */
package tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages.ProfilePage;

/**
 * 
 */
public class TC_02EditProfile extends BaseTest{
	
	
	ProfilePage pg;
	ExtentTest test;
	
	@Test
	void verifyEditProfile(Method sMethodName) {
		test=extent.createTest(sMethodName.getName());
		logger.info("Inside verifyEditProfile method ");
		test.info("Inside verifyEditProfile method");
		pg=new ProfilePage(driver);
		pg.clickProfileTab(driver);
		logger.info("Clicked on Profile tab");
		test.info("Clicked on Profile tab");
//		Thread.sleep(4000);
		Assert.assertTrue(pg.verifyProfilePageDisplayed(driver));
		logger.info("Profile page displayed");
		test.info("Profile page displayed");
		pg.clickEdit(driver);
		logger.info("Clicked on edit btn");
		test.info("Clicked on edit btn");
//		Thread.sleep(4000);
		Assert.assertTrue(pg.verifyEditProfilePageDisplayed(driver));
		logger.info("Edit profile page is displayed");
		test.info("Edit profile page is displayed");
		pg.enterUserInfo(driver);
		logger.info("Entered user info");
		test.info("Entered user info");
//		Thread.sleep(4000);
		pg.clickBackBtn(driver);
		logger.info("Clicked on back btn");
		test.info("Clicked on back btn");
//		Thread.sleep(4000);
		Assert.assertTrue(pg.verifyEditedProfilePageDisplayed());
		logger.info("Edited profile page displayed");
		test.log(Status.PASS, "User successfully edited profile page");
		
	}

}
