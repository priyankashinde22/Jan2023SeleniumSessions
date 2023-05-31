package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDownMultiSelectionWithCascade {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(1500);

		driver.findElement(By.id("justAnInputBox1")).click();

		By choices = By.xpath("(//div[@class='comboTreeDropDownContainer'])[2]//li/span[@class='comboTreeItemTitle']");
		// selectChoice(choices, "choice 1", "choice 2", "choice 4","choice 6 2 1",
		// "choice 7");
		selectChoice(choices, "all");
		// selectChoice(choices, "choice 1","choice 7");
		//selectChoice(choices, "choice 8");
		// selectChoice(choices, "choice 1", "choice 2", "choice 7","choice 6 2 1",
	//	"choice 4","choice 8");

	}

	public static void selectChoice(By locator, String... value) throws InterruptedException {

		List<WebElement> optionList = driver.findElements(locator);
		boolean flag = false;

		if (!value[0].equalsIgnoreCase("all")) {

			for (WebElement e : optionList) {
				String text = e.getText();
				System.out.println(text);

				// multiple selection logic:
				for (int i = 0; i < value.length; i++) {
					if (text.equals(value[i])) {
						flag = true;
						e.click();
						System.out.println("choice is available : " + text);
						break;
					}
					else {
						flag=false;
						
						
					}

				}

			}

			if (flag == false) {
				System.out.println(value[0] +": choice is not available");
				// break;
			}

		} else {
			// all selection logic
			for (WebElement e : optionList) {
				String text = e.getText();
				Thread.sleep(1000);

				e.click();
				flag = true;

			}

		}

	}
}
