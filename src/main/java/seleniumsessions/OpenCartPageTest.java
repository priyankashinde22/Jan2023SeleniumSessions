package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartPageTest {

	public static void main(String[] args) {
		
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver= brUtil.initDriver("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title = brUtil.getPageTitle();
		System.out.println("Page title:" + title);
		System.out.println(brUtil.getPageURL());
		
		ElementUtil eleUtil = new ElementUtil(driver);
		By email = By.id("input-email");
		By pwd = By.id("input-password");
		eleUtil.doSendKeys(email, "priyanka@gmail.com");
		eleUtil.doSendKeys(pwd, "abc@123");
		
		eleUtil.doSendKeys(email, "priya@gmail.com");
		//brUtil.quitBrowser();
		
	}

}
