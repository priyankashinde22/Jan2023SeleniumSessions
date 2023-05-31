package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By emailID=By.id("input-email");
		
		ElementUtil eutil = new ElementUtil(driver);
		eutil.doSendKeys(emailID, "test@gmail.com");
		
	//	WebElement ele = driver.findElement(By.id("input-email"));//dom-v1
	//	ele.sendKeys("test@gmail.com");
		driver.navigate().refresh();
		eutil.doSendKeys(emailID, "priyanka@gmail.com");
		
	//	ele = driver.findElement(By.id("input-email"));//dom v2
	//	ele.sendKeys("priyanka@gmail.com");
		//org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
		  
	}

}
