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
public class TC_03AddingItemsMoreThanAvailable extends BaseTest {
	
	HomePage hp;
	ExtentTest test;

	@Test
	void verifyAddingItemsMoreThanAvailable(Method sMathodName) throws InterruptedException {
		test=extent.createTest(sMathodName.getName());
//		test=extent.createTest("  ");
		logger.info("Inside verifyAddingItemsMoreThanAvailable method ");
		test.info("Inside verifyAddingItemsMoreThanAvailable method");
		hp=new HomePage(driver);
		hp.selectProductFromHomePage(" ",driver);
		logger.info("Product has been selected ");
		test.info("Product has been selected");
		String availability=hp.getProductQuantity(driver);
		logger.info("Available product quantity is : "+availability);
		test.info("Available product quantity is : "+availability);
		int quantity=Integer.parseInt(availability)+1;
		hp.addProductToCart(String.valueOf(quantity));
		logger.info("Adding one more item than availability :"+quantity);
		test.info("Adding one more item than availability :"+quantity);
		hp.clickCartBtn(driver);
		Assert.assertTrue(hp.verifyProductNotAdded(driver));
		logger.info("Product item not added to cart");
		test.info("Product item not added to cart");
		
	}

}
