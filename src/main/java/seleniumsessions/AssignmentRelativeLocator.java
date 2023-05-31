package seleniumsessions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentRelativeLocator {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

	/*	WebElement ele1 = driver.findElement(By.xpath("(//label[@class='radio-inline'])[2]"));

		driver.findElement(with(By.xpath("(//input[@type='radio'])[2]")).toLeftOf(ele1)).click();

		Thread.sleep(1000);

		WebElement ele2 = driver.findElement(By.xpath("(//label[@class='radio-inline'])[1]"));

		driver.findElement(with(By.cssSelector("input[type=radio][name='newsletter'][value='0']")).toRightOf(ele2))
				.click();

		WebElement ele3 = driver.findElement(By.xpath("//b[text()='Privacy Policy']"));
		driver.findElement(with(By.cssSelector("input[type='checkbox']")).toRightOf(ele3)).click();*/
		
		
		 WebElement ele = driver.findElement(By.xpath("//label[normalize-space()='No']"));

		   
		 driver.findElement(with(By.xpath("//input[@value=0 and @type='radio' and @name='newsletter']")).near(ele)).click();

	}

}
