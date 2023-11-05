/**
 * 
 */
package utills;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

/**
 * 
 */
public class WaitUtils {



	public static boolean waitForElement(AppiumDriver<WebElement> driver, WebElement ele) {
		boolean isElementFound=false;
		try {
			WebDriverWait wait=new WebDriverWait(driver, 30);

			WebElement elemenet=wait.until(ExpectedConditions.visibilityOf(ele));
			isElementFound=true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return isElementFound;


	}

	public static boolean waitForElementToDisappear(AppiumDriver<WebElement> driver, WebElement ele) {
		boolean isElementDiasppeared=false;
		
		try {
			WebDriverWait wait=new WebDriverWait(driver, 30);

			isElementDiasppeared=wait.until(ExpectedConditions.invisibilityOf(ele));
			System.out.println(isElementDiasppeared);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return isElementDiasppeared;
	}

}
