package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentSpiceJetMoveToElement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		
		WebElement add_OnEle = driver.findElement(By.xpath("//div[text()='Add-ons']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(add_OnEle).build().perform();
		//List<WebElement> list = driver.findElements(By.cssSelector(".css-1dbjc4n.r-18u37iz.r-1w6e6rj.r-e65kyq.r-1t2hasf a"));
		
		
		List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class, 'r-cn9azx')]"));
		for(WebElement e: list) {
			String text=e.getText();
			
			System.out.println(text);
		}

	}

}
