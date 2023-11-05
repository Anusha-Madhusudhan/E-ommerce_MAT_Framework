/**
 * 
 */
package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.LocksDevice;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import utills.ExtentReportsCalss;

/**
 * 
 */
public class BaseTest extends ExtentReportsCalss{

	public static AppiumDriver<WebElement> driver;
	
	DesiredCapabilities dc;
	Logger logger;
	

	@SuppressWarnings("deprecation")
	@BeforeClass
	void setUp() throws MalformedURLException {
		logger=LogManager.getLogger(this.getClass().getName());
//	     server=new AppiumServer();
		
		
		
		logger.info("Inside the setUp method");
		
		

		dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
		dc.setCapability(MobileCapabilityType.UDID, "RF8M43J43DZ");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
//		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "30");
		dc.setCapability(AndroidMobileCapabilityType.UNLOCK_TYPE, "pin");
		dc.setCapability(AndroidMobileCapabilityType.UNLOCK_KEY, "3636");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.solodroid.solomerce");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.solodroid.solomerce.activities.MainActivity");
 
//		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		logger.info("Desired capability has been set");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
//
		 driver = new AndroidDriver<WebElement>(url, dc);
		
		logger.info("Appium server has started");
		
		logger.info("driver variable has been initialized");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 

		((LocksDevice) driver).unlockDevice();
		
		logger.info("Unlocked the device");
		

	}

	@AfterClass
	void tesrDown() {
		logger.info("Inside the tear down method");
		logger.info("Quiting the driver");
		driver.quit();
		
//		server.stop();
		logger.info("Appium server has stoped");
	}
	
	
}
