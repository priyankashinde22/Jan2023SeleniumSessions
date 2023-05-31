package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsSections {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		/*
		 * List<WebElement> rightPanelLinkList
		 * =driver.findElements(By.className("list-group-item"));
		 * System.out.println(rightPanelLinkList.size()==13); for(WebElement
		 * e:rightPanelLinkList) { String text =e.getText(); System.out.println(text); }
		 */
		By rightPanelLinks = By.className("list-group-item");
		By footerPageLinks = By.xpath("//footer//a");
		
		clickElementFromPageSection(rightPanelLinks,"Forgotten Password");
		//List<String> footerLinks =getElementsTextList(footerPageLinks);
		//System.out.println("Total number of footer links:" + footerLinks.size());
		
		//clickElementFromPageSection(footerPageLinks,"AboutUs");//Newsletter About Us
		
		/*List<WebElement> rightPanelLinkList = getElements(rightPanelLinks);
		for(WebElement e: rightPanelLinkList) {
			String text= e.getText();
			if(text.equals("Forgotten Password")) {
				e.click();
				break;
			}
		}
		
		if (getElements(rightPanelLinks).size() == 13) {
			System.out.println("Right panel links count is correct");
		}

		List<String> rightPanelLinksTextList = getElementsTextList(rightPanelLinks);
		if (rightPanelLinksTextList.contains("My Account")) {
			System.out.println("My account --PASS");

		}

		if (rightPanelLinksTextList.contains("Register")) {
			System.out.println("Register --PASS");

		}*/
	}
	public static void clickElementFromPageSection(By locator, String eleText) {
		List<WebElement> eleList =getElements(locator);
		for(WebElement e:eleList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(eleText)) {
				e.click();
				break;
			}
		}
		
	}

	public static List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}

	public static List<String> getElementsTextList(By locator) {
		List<WebElement> elementsLinkList = getElements(locator);
		List<String> elesTextList = new ArrayList<String>();
		for (WebElement e : elementsLinkList) {
			String text = e.getText();
			elesTextList.add(text);

		}
		return elesTextList;

	}

}
