package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForPageLoadConcept {

	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
		waitForPageLoad(20);
		driver.findElement(By.linkText("Sign Up")).click();
		waitForPageLoad(10);

	}
	
	public static void waitForPageLoad(int timeOut) {
		long endTime =System.currentTimeMillis()+ timeOut;
		while(System.currentTimeMillis()<endTime) {
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			String pageState =js.executeScript("return document.readyState").toString();
			if(pageState.equals("complete")) {
				System.out.println("Page Dome is fully loaded now...");
				break;
				
			}
			else {
				System.out.println("Page is not loaded..." +pageState);
			}
			
		}
		
		
	}
	
	public static Boolean isPageLoaded() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		String flag=wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == \'complete\'")).toString();
		return Boolean.parseBoolean(flag);
		
	}

}
