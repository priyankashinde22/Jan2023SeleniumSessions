package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndFindElementException {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//driver.findElement(By.name("search111")).sendKeys("macbook");
		//NoSuchElementException
		//List<WebElement> paneLinks =driver.findElements(By.className("list-group-item11"));
		//System.out.println(paneLinks.size());
		By search = By.name(("search"));
		if(checkElementIsDisplayed(search)) {
			System.out.println("Enter the value");
			
		}

	}
	public static boolean checkElementIsDisplayed(By locator) {
		List<WebElement> eleList=driver.findElements(locator);
		if(eleList.size()>0) {
			System.out.println(locator + "Element is present on the page");
			return true;
		}
		else {
			return false;
			
		}
	}

}
