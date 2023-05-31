package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFooter {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		/*
		 * List<WebElement>
		 * footerList=driver.findElements(By.xpath("//div[@class='o3j99 c93Gbe']//div/a"
		 * )); System.out.println(footerList.size()); for(WebElement e:footerList) {
		 * String text=e.getText(); System.out.println(text); }
		 */
		By footer = By.xpath("//a[@class='pHiOh']");
		GoogleFooterList(footer,"Advertising");
		String advTitlePg=driver.getTitle();
		if(advTitlePg.contains("Google Ads")) {
			System.out.println("PASS");
			System.out.print(advTitlePg);
		}
		

	}

	public static void GoogleFooterList(By locator, String value) {
		List<WebElement> eleList = driver.findElements(locator);
		System.out.println(eleList.size());
		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}
			
			
		}

	}

}
