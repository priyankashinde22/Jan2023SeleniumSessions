package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		//driver.get("https://amazon.com");
		driver.get("https://classic.crmpro.com/");

		//JavascriptExecutor js = (JavascriptExecutor)driver;
	//	String title = js.executeScript("return document.title;").toString();
		//System.out.println(title);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
	//	String title = jsUtil.getTitleByJS();
		//System.out.println(title);
		
	//	jsUtil.generateAlert("this is my js alert");//use case: debugging point of you or demo time
//		String pageText = jsUtil.getPageInnerText();
//		System.out.println(pageText);
//		System.out.println(pageText.contains("Task & Event Tracking"));
//		System.out.println(pageText.contains("Marketing Campaigns"));
//		
		//jsUtil.zoomChromeEdge("400.0");
		//responsive testing --> 50% 100% 60% 400% (Various screen size or test on iphone and adroid for sanity check)
		
	//	WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
	//	jsUtil.drawBorder(login);//use case-found bug and highlight
		
		//WebElement form = driver.findElement(By.id("hs-login"));
//		jsUtil.drawBorder(form);
		
		//jsUtil.flash(form);
		//use case-want to know where is driver on which element(Ex.demo purpose)
		
//		jsUtil.scrollPageDown();
//		Thread.sleep(2000);
//		jsUtil.scrollPageUp();
		
	//	WebElement ele = driver.findElement(By.xpath("//span[text()='Frequently repurchased in Drugstore']"));
	//	jsUtil.scrollIntoView(ele);//specific element
		
		//for horizontal scrolling use scrollby method window.scrollBy(1000,2000)
		
		
		

	}

}
