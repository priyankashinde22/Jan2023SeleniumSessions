package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		/*String placeholder =driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
		System.out.println(placeholder);
		String name =driver.findElement(By.id("input-firstname")).getAttribute("name");
		System.out.println(name);
		String type =driver.findElement(By.id("input-firstname")).getAttribute("type");
		System.out.println(type);
		String loginUrl =driver.findElement(By.linkText("Login")).getAttribute("href");
		System.out.println(loginUrl);*/
		By fn =By.id("input-firstname");
		By loginUrl=By.linkText("Login");
		String placeholder= doGetAttributeValue(fn,"placeholder");
		String name =doGetAttributeValue(fn,"name");
		String type =doGetAttributeValue(fn,"type");
		String loginUr =doGetAttributeValue(loginUrl,"href");
		System.out.println(placeholder);
		if(placeholder.equals("First Name")) {
			System.out.println("Right placeholder value--PASS");
	
		}
		else {
			System.out.println("wrong placeholder value--Fail");
		}
		System.out.println(loginUr);
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	public static String doGetAttributeValue(By locator ,String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	

}
