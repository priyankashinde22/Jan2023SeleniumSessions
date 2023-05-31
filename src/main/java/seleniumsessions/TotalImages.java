package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	static WebDriver driver;

	// find out all links on the page
	// count of images
	// image-->html tag--<img>
	// find multiple elements
	// print the alt or src of each img
	// skip the blank text
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		/*List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		int totalImages = imagesList.size();
		System.out.println("total Images =" + totalImages);

		for (WebElement e : imagesList) {

			String altValue = e.getAttribute("src");
			System.out.println(altValue);

		}*/
		
		By image = By.tagName("img");
		By links = By.tagName("a");
		int imageCount =getElementCount(links);
		System.out.println(imageCount);
		
		
		List<String> imageAttrList=getElementsAttributeValue(image,"alt");
		if(imageAttrList.contains("Computer mice")) {
			System.out.println("PASS");
		}
		getElementsAttributeValue(links,"href");

	}

	

	public static List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}

	public static List<String> getElementsAttributeValue(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleAttrList= new ArrayList<String>();
		for (WebElement e : eleList) {
			String attrValue = e.getAttribute(attrName);
			System.out.println(attrValue);

		}
		return eleAttrList;

	}
	public static int getElementCount(By locator) {
		return getElements(locator).size();
	}

}
