package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoCart {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		ElementUtil eleUtil = new ElementUtil(driver);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		  By emailId = By.id("input-email");
		  By password = By.id("input-password");
		  By loginBtn = By.xpath("//input[@value ='Login']");
		 By quantity = By.id("input-quantity");
		 By addToCartBtn = By.id("button-cart");
		 By successCartMsg = By.cssSelector("div.alert.alert-success.alert-dismissible");
		  By search = By.name("search");
		 By searchIcon = By.cssSelector("div#search button");

		eleUtil.waitForElementVisible(emailId, 20);
		eleUtil.doSendKeys(emailId,"janautomation@gmail.com");
		eleUtil.doSendKeys(password, "Selenium@12345");
		eleUtil.doClick(loginBtn);
		eleUtil.waitForElementVisible(search, 10);
		eleUtil.doSendKeys(search, "Macbook");
		eleUtil.doClick(searchIcon);
		By productNameLocator = By.linkText("MacBook Pro");
		eleUtil.doClick(productNameLocator);
		eleUtil.doSendKeys(quantity, "1");
		eleUtil.doClick(addToCartBtn);
		eleUtil.waitForElementVisible(successCartMsg,20);
		String succemsg =eleUtil.doGetElementText(successCartMsg);
		if(succemsg.contains("MacBook Pro")) {
			System.out.println("PASS" + succemsg);
		}
	
	}

}
