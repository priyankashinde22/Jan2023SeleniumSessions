package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsNotPresentConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	
		
		By search =By.id("twotabsearchtextbox");
		getElement(search);
	//	ElementUtil elUtil = new ElementUtil(driver);
		
	}

	public static WebElement getElement(By locator) {
		WebElement element =null;
		try {
		element = driver.findElement(locator);
		System.out.println("Element is found using this locator.." +locator);
		}
		catch(NoSuchElementException e){
			System.out.println("Element is not found using this locator.." +locator);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();
			}//static wait
			element = driver.findElement(locator);
			
		}
		return element;
		
	}
	
}
