package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		// 1.id: unique attribute
		//2.name: not unique attribute
	/*	driver.findElement(By.id("input-firstname")).sendKeys("priyan@gmail.com");
		driver.findElement(By.id("input-lastname")).sendKeys("abc@123");
		driver.findElement(By.name("agree")).click();*/
		
				
		//3.ClassName: not unique attribute
		//driver.findElement(By.className("form-control")).sendKeys("ppp@gmail.com");
		
		//4.Xpath: its not an attribute. its the address of the element in html DOM
		//it can be unique/duplicate
		/*driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Priya@gmail.com");
		driver.findElement(By.id("input-lastname")).sendKeys("abc@123");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();*/
		
		//5. CSS selector: its not an attribute
		/*driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Priya@gmail.com");
		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("abc@123");
		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
		*/
		
		//6.LinkText: only applicable for links
		
		//driver.findElement(By.linkText("Login")).click();
		//System.out.println(driver.getCurrentUrl());
		
		//7.Partial Link text.its only for link
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8/ tagname:
		String header =driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);
		if(header.equals("Register Account")) {
			System.out.println("PASS");
		}
		
		
		By rp =By.tagName("h1");
		String text =doGetElementText(rp);
		System.out.println(text);
		
	}

	public static String doGetElementText(By locator) {
		return getElement(locator).getText();
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
}
