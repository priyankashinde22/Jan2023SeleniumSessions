package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementConcept {
	static WebDriver driver ;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();//123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//create webelement +perform action(click,sendkeys,getText, isDisplayed...)
		//findElement() + click() + sendKeys();
		
		//1st
		//driver.findElement(By.id("input-email")).sendKeys("priyanka@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("priya@123");

		//2nd
		//WebElement emailId = driver.findElement(By.id("input-email"));
		//WebElement password = driver.findElement(By.id("input-password"));
		//emailId.sendKeys("priyanka@gmail.com");
		//password.sendKeys("priya@123");
		
		//3rd By loactor
		//By email = By.id("input-email");
		//By pwd = By.id("input-password");
		
		/*WebElement emailId= driver.findElement(email);
		WebElement password =driver.findElement(pwd);
		emailId.sendKeys("priyanka@gmail.com");
		password.sendKeys("priya@123");
		*/
		//4th by locator and create a generic function a web element
		/*By email = By.id("input-email");
		By pwd = By.id("input-password");
		
		WebElement emailId =getElement(email);
		WebElement password=getElement(pwd);
		emailId.sendKeys("priyanka@gmail.com");
		password.sendKeys("priya@123");
		*/
		
		//5th by locator and create a generic function for a web element and action
		/*By email = By.id("input-email");
		By pwd = By.id("input-password");
		doSendKeys(email,"priyanka@gmail.com");
		doSendKeys(pwd,"priya@123");*/
		
		//6th by locator and create a generic function for a web element and action in util class
		By email = By.id("input-email");
		By pwd = By.id("input-password");
		ElementUtil eleUtil = new ElementUtil(driver);//123-session id
		eleUtil.doSendKeys(email, "priyanka@gmail.com");
		eleUtil.doSendKeys(pwd, "priya@12");
		
	}
	/*public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
		
	}
	public static void doSendKeys(By locator, String value) {
		 getElement(locator).sendKeys(value);
		
		
	}*/

}
