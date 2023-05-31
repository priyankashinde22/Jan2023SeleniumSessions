package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	//	driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		By searchTextBox = By.name("q");
		
		testGoogleSearch(searchTextBox,"Selenium testing tools cookbook");
	}
	
	
	
	public static void testGoogleSearch(By locator,String value) throws InterruptedException {
		
	WebElement e=	driver.findElement(locator);
	e.sendKeys(value);
		e.submit();
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
		
		
	}

}
