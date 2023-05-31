package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.get("https://www.google.com");
		/*String pgSource =driver.getPageSource();
		System.out.println(pgSource);
		System.out.println(pgSource.contains("start details section"));//gives true
		*/
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		
		
		

	}

}
