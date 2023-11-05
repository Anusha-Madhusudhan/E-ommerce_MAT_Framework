/**
 * 
 */
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utills.WaitUtils;

/**
 * 
 */
public class HomePage {
	
	
	
	public HomePage(AppiumDriver<WebElement> driver) {
		
//		PageFactory.initElements(driver, this);
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		  
	}
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Samsung Galaxy S10 - Black')]")
	private WebElement samsung_galaxy_s10;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'U17 USB Portable M3 HUmidifier Air Purifier LED Night Light 200ML')]")
	private WebElement air_Purifier;
	
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Apple watch series 3 GPS 42mm Black')]")
	private WebElement apple_watch;
	
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Mini Digital Speaker TD-V26 USB FM Radio SD TF Card MP3 - Red')]")
	private WebElement digital_speaker;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'LED TV 43 Inch Smart TV TCL 43E3 UHD 4K Dolby Sound')]")
	private WebElement tcl_tv;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Dolce and Gabbana Heels')]")
	private WebElement heels;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Gold Titanium Diamond Women's Bracelet')]")
	private WebElement bracelet;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Short Sleeve Men's Batik Shirt OB 445')]")
	private WebElement shirt;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'SKMEI Children Sport Rubber LED Watch DG1100 - Black')]")
	private WebElement children_watch;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Mini Panda Backpack - Pink')]")
	private WebElement panda_packpack;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Hybrid Stroller Cabi Sport Rosse Gold ')]")
	private WebElement stroller;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Bib Slabber Waterproof')]")
	private WebElement bib;
	
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Portable Bottle Heater')]")
	private WebElement bottle;
	
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'GEA Baby RayQueen Plus JHS-400 UV Sterilizer - Metal White')]")
	private WebElement sterillizer;
	
//	@iOSXCUITFindBy(id = "")
//	@AndroidFindBy(id = "//android.widget.TextView[contains(@text,'Samsung Galaxy S10 - Black')]")
//	WebElement jumpsuit;
//	
//	@iOSXCUITFindBy(id = "")
//	@AndroidFindBy(id = "//android.widget.TextView[contains(@text,'Samsung Galaxy S10 - Black')]")
//	WebElement wall_shelves;
//	
//	
//	@iOSXCUITFindBy(id = "")
//	@AndroidFindBy(id = "//android.widget.TextView[contains(@text,'Samsung Galaxy S10 - Black')]")
//	WebElement copper_light;
//	
//	@iOSXCUITFindBy(id = "")
//	@AndroidFindBy(id = "//android.widget.TextView[contains(@text,'Samsung Galaxy S10 - Black')]")
//	WebElement mosquito_net;
//	
//	@iOSXCUITFindBy(id = "")
//	@AndroidFindBy(id = "//android.widget.TextView[contains(@text,'Samsung Galaxy S10 - Black')]")
//	WebElement vaccume_cleaner;
//	
//	
//	@iOSXCUITFindBy(id = "")
//	@AndroidFindBy(id = "//android.widget.TextView[contains(@text,'Samsung Galaxy S10 - Black')]")
//	WebElement stand_hanger;
	
//	@iOSXCUITFindBy(id = "")
//	@AndroidFindBy(id = "//android.widget.TextView[contains(@text,'Samsung Galaxy S10 - Black')]")
//	WebElement threadmill;
	
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Money Counter Kozure MC-101')]")
	private WebElement money_counter;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'ID Card holder / Name Tag Holder / Tempat ID Card - UHOO 6616')]")
	private WebElement name_tag_holder;

//	@AndroidFindBy(accessibility = "Search…")
//	WebElement search_btn;
	
	@AndroidFindBy(id = "com.solodroid.solomerce:id/search_src_text")
	WebElement search_text;
	
//	@AndroidFindBy(id = "com.solodroid.solomerce:id/btn_add_cart")
//	WebElement cart_btn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'E-Commerce Android App')]")
	private WebElement home_page_heading_text;
	
	@AndroidFindBy(accessibility = "Category")
	WebElement category;
	
	@AndroidFindBy(accessibility = "Help")
	private WebElement help;
	
	@AndroidFindBy(accessibility = "Profile")
	private WebElement profile;
	
	@AndroidFindBy(id = "com.solodroid.solomerce:id/btn_add_cart")
	private WebElement addToCart_btn;
	
	
	@AndroidFindBy(id = "com.solodroid.solomerce:id/cart")
	private WebElement cart_btn;
	
	@AndroidFindBy(id = "com.solodroid.solomerce:id/userInputDialog")
	private WebElement number_of_order_text;
	
	@AndroidFindBy(id = "android:id/button1")
	private WebElement add_btn;
	
	@AndroidFindBy(id = "com.solodroid.solomerce:id/btn_checkout")
	private WebElement checkOut_btn;
	
	@AndroidFindBy(id = "com.solodroid.solomerce:id/btn_submit_order")
	private WebElement process_checkout_btn;
	
	@AndroidFindBy(id = "android:id/button1")
	private WebElement yes_btn;
	
	@AndroidFindBy(id = "android:id/alertTitle")
	private WebElement congradulations_msg;
	
	@AndroidFindBy(id = "android:id/button1")
	private WebElement ok_btn;
	
	@AndroidFindBy(id = "com.solodroid.solomerce:id/no_item_message")
	private WebElement no_item_message;
	
	@AndroidFindBy(id = "com.solodroid.solomerce:id/product_quantity")
	private WebElement product_quantity;
	
	@AndroidFindBy(id = "android:id/alertTitle")
	private WebElement alertTitle;
	

	public void selectProductFromHomePage(String string, AppiumDriver<WebElement> driver) {
		
		
		WebElement product=((AndroidDriver<WebElement>) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.solodroid.solomerce:id/recycler_view\"))"
				+ ".scrollIntoView(new UiSelector().textContains(\"Samsung Galaxy S10\"))");

		
//		Point p2=name_tag_holder.getLocation();
//		
//		Point p1=samsung_galaxy_s10.getLocation();
//		
//		TouchAction action=new TouchAction(driver);
//		
//		action.moveTo(PointOption.point(p2)).release().perform();
		
		if(samsung_galaxy_s10.isDisplayed()) {
			samsung_galaxy_s10.click();
		}
		else {
			System.out.println("Name tag holder product not displayed on the page");
		}
		
//		if(apple_watch.isDisplayed()) {
//			apple_watch.click();
//		}
//		else {
//			System.out.println("Money counter product not displayed on the page");
//		}
	}

	public void addProductToCart(String numOfItems) {
		
		if(addToCart_btn.isDisplayed()) {
			addToCart_btn.click();
			
			if(number_of_order_text.isDisplayed()) {
				number_of_order_text.sendKeys(numOfItems);
				
				if(add_btn.isDisplayed()) {
					add_btn.click();
				}
			}
		}else {
			System.out.println("add to cart Btn not displayed");
		}
		
	}

	public void goToCartAndMakeAnOrder(AppiumDriver<WebElement> driver)  {
		if(cart_btn.isDisplayed()) {
		if(WaitUtils.waitForElement(driver, cart_btn)) {
			cart_btn.click();
			}
		//	Thread.sleep(5000);
			if(checkOut_btn.isDisplayed()) {
				if(WaitUtils.waitForElement(driver, checkOut_btn)) {
				checkOut_btn.click();
				}
//				Thread.sleep(5000);
				if(process_checkout_btn.isDisplayed()) {
					if(WaitUtils.waitForElement(driver, process_checkout_btn)) {
					process_checkout_btn.click();
					}
//					Thread.sleep(5000);
					if(yes_btn.isDisplayed()) {
						if(WaitUtils.waitForElement(driver, yes_btn)) {
						yes_btn.click();
						}
//						Thread.sleep(5000);
					}
				}
			}
		}
		
	}

	public boolean verifyCogradulationMsg(AppiumDriver<WebElement> driver) {
		boolean isMsgDisplayed=false;
		if(WaitUtils.waitForElementToDisappear(driver,alertTitle)) {
		if(congradulations_msg.isDisplayed()) {
			if(WaitUtils.waitForElement(driver, congradulations_msg)) {
			if(congradulations_msg.getText().equals("Congratulation")) {
				isMsgDisplayed=true;
			}
			
			}
		}
		}
		return isMsgDisplayed;
	}

	public boolean verifyAfterMakingAnOrderUserComesBackToHomePage(AppiumDriver<WebElement> driver)  {
		boolean isHomePageDisplayed=false;
//		Thread.sleep(5000);
		if(ok_btn.isDisplayed()) {
			if(WaitUtils.waitForElement(driver, ok_btn)) {
			ok_btn.click();
			}
		if(home_page_heading_text.isDisplayed()) {
			if(WaitUtils.waitForElement(driver, home_page_heading_text)) {
			if(home_page_heading_text.getText().equals("E-Commerce Android App")) {
				isHomePageDisplayed=true;
			}
			}
		}
		}
		return isHomePageDisplayed;
	}

	public String getProductQuantity(AppiumDriver<WebElement> driver)  {
		String proQuantity = null;
		if(product_quantity.isDisplayed()) {
			if(WaitUtils.waitForElement(driver, product_quantity)) {
//			Thread.sleep(5000);
			String[] s=product_quantity.getText().split(" ");
			proQuantity=s[0];
		}
		}else {
			System.out.println("Product quantity is not displayed");
		}
		
		return proQuantity;
	}

	public boolean verifyProductNotAdded(AppiumDriver<WebElement> driver) {
		boolean isCartEmpty=false;
		if(no_item_message.isDisplayed()) {
			if(WaitUtils.waitForElement(driver, no_item_message)) {
			if(no_item_message.getText().equals("Whoops, your cart is empty")) {
				isCartEmpty=true;
			}
			}
		}
		return isCartEmpty;
	}

	public void clickCartBtn(AppiumDriver<WebElement> driver)  {
		if(cart_btn.isDisplayed()) {
			if(WaitUtils.waitForElement(driver, cart_btn)) {
			cart_btn.click();
		}
		}
		
	}
}
