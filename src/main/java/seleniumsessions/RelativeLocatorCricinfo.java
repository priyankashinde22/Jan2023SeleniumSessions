package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorCricinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/indian-premier-league-2023-1345038/delhi-capitals-vs-mumbai-indians-16th-match-1359490/full-scorecard");
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Prithvi Shaw']"));
		
		String wkTakerName = driver
			.findElement(with(By.cssSelector(".ds-flex.ds-cursor-pointer.ds-items-center"))
						.toRightOf(ele)).getText();
		
		System.out.println(wkTakerName);

	}

}
