/**
 * 
 */
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utills.WaitUtils;

/**
 * 
 */
public class ProfilePage {
	
	
	
	public ProfilePage(AppiumDriver<WebElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy(id = "com.solodroid.solomerce:id/nav_profile")
	WebElement profile;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Profile')]")
	WebElement progile_page_heading;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'EDIT')]")
	WebElement edit;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@index='1']")
	WebElement email;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@index='2']")
	WebElement phoneNum;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@index='3']")
	WebElement name;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='User Profile']")
	WebElement editProfile_page_heading;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='1']")
	WebElement editName;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='2']")
	WebElement editEmail;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='3']")
	WebElement editPhoneNum;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
	WebElement backBtn;
	
	@AndroidFindBy(id = "android:id/edit")
	WebElement editText;
	
	@AndroidFindBy(id = "android:id/button1")
	WebElement okBtn;

	public void clickProfileTab(AppiumDriver<WebElement> driver) {
		if(profile.isDisplayed()) {
			if(WaitUtils.waitForElement(driver, profile)) {
			profile.click();
			}
		}else {
			System.out.println("Profile tab is not displayed");
		}
		
	}

	public boolean verifyProfilePageDisplayed(AppiumDriver<WebElement> driver) {
		boolean isProfilePageDisplayed=false;
		if(progile_page_heading.isDisplayed()) {
			if(WaitUtils.waitForElement(driver, progile_page_heading)) {
			if(progile_page_heading.getText().equals("Profile")) {
				isProfilePageDisplayed=true;
			}
			}
		}
		
		return isProfilePageDisplayed;
	}

	public void clickEdit(AppiumDriver<WebElement> driver) {
		if(edit.isDisplayed()) {
			if(WaitUtils.waitForElement(driver, edit)) {
			edit.click();
			}
		}else {
			System.out.println("Edit btn is not displayed");
		}
		
	}

	public boolean verifyEditProfilePageDisplayed(AppiumDriver<WebElement> driver) {
		boolean flag=false;
		
		if(editProfile_page_heading.isDisplayed()) {
			if(WaitUtils.waitForElement(driver, editProfile_page_heading)) {
			if(editProfile_page_heading.getText().equals("User Profile")) {
				flag=true;
			}
			}
		}
		
		return flag;
	}

	public void enterUserInfo(AppiumDriver<WebElement> driver) {
		if(editName.isDisplayed()) {
			if(WaitUtils.waitForElement(driver, editName)) {
			editName.click();
			if(editText.isDisplayed()) {
				editText.clear();
				editText.sendKeys("Anusha");
				if(okBtn.isDisplayed()) {
					okBtn.click();
				}
			}
			}
		}
		if(editEmail.isDisplayed()) {
			editEmail.click();
			if(editText.isDisplayed()) {
				editText.clear();
				editText.sendKeys("anu.sha28@gmail.com");
				if(okBtn.isDisplayed()) {
					okBtn.click();
				}
			}
		}
		
		if(editPhoneNum.isDisplayed()) {
			editPhoneNum.click();
			if(editText.isDisplayed()) {
				editText.clear();
				editText.sendKeys("+1234056789");
				if(okBtn.isDisplayed()) {
					okBtn.click();
				}
			}
		}
		
	}

	public void clickBackBtn(AppiumDriver<WebElement> driver) {
		if(backBtn.isDisplayed()) {
			if(WaitUtils.waitForElement(driver, backBtn)) {
			backBtn.click();
			}
		}
		
	}

	public boolean verifyEditedProfilePageDisplayed() {
		boolean flag=false;
		
		if(email.isDisplayed()) {
			if(email.getText().equals("anu.sha28@gmail.com")) {
				flag=true;
			}
		}
		return flag;
	}
	
	

	
}
