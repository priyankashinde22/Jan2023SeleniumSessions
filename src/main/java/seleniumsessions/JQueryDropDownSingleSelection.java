package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDownSingleSelection {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(1500);

		driver.findElement(By.id("justAnotherInputBox")).click();
		Thread.sleep(1000);
		
		// By.xpath("(//div[@class='comboTreeDropDownContainer'])[3]//li/span");
		By choices = By.xpath("(//div[@class='comboTreeDropDownContainer'])[3]//li/span[@class='comboTreeItemTitle']");
		selectChoice(choices, "choice 4");

	}

	public static void selectChoice(By locator, String value) throws InterruptedException {
		List<WebElement> optionList = driver.findElements(locator);
		boolean flag = false;

		System.out.println(optionList.size());
		for (WebElement e : optionList) {
			String text = e.getText();
			// System.out.println(text);
			if (text.contains(value)) {
				flag = true;
				e.click();
				System.out.println("choice is selected");
				break;
			}

		}
		if(flag==false) {
			System.out.println("choice is not available");
		}
		

	}

}
