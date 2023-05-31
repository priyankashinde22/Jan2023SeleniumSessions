package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDislayed {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	//	boolean flag =driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
	//	System.out.println(flag);
		By search =By.id("twotabsearchtextbox");
		ElementUtil elUtil = new ElementUtil(driver);
		if(elUtil.checkElementIsDisplayed(search)) {
			elUtil.doSendKeys(search, "Macbook");
			System.out.println("Search element is present");
		}
		else {
			System.out.println("Search element is not present");
		}
		

	}

}
