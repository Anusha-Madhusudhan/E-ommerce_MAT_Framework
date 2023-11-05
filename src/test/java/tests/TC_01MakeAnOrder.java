/**
 * 
 */
package tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages.HomePage;

/**
 * 
 */
public class TC_01MakeAnOrder extends BaseTest {
	
	HomePage hp;
	ExtentTest test;

	@Test
	void verifyMakeAnOrder(Method sMathodName) {
		test=extent.createTest(sMathodName.getName());
//		test=extent.createTest("  ");
		logger.info("Inside verifyMakeAnOrder method ");
		test.info("Inside verifyMakeAnOrder method");
		hp=new HomePage(driver);
		hp.selectProductFromHomePage("ID card holder",driver);
		logger.info("Product has been selected ");
		test.info("Product has been selected");
		hp.addProductToCart("2");
		logger.info("Product has been added to cart ");
		test.info("Product has been added to cart");
		hp.goToCartAndMakeAnOrder(driver);
		logger.info("product has been checked out ");
		test.info("product has been checked out");
		Assert.assertTrue(hp.verifyCogradulationMsg(driver));
		logger.info("Got the congratulations msg");
		test.info("Got the congratulations msg");
		Assert.assertTrue(hp.verifyAfterMakingAnOrderUserComesBackToHomePage(driver));
		logger.info("User has been navigated to home page after successful order ");
		test.info("User has been navigated to home page after successful order");
		test.log(Status.PASS, "User successfully placed an order");
	}
}
