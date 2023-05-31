package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(co);
		//SafariDriver driver = new SafariDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		//WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.amazon.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		//verification point/checkpoint/act vs exp result
		if(title.contains("Amazon.com")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		//automation steps + verification points = automation testing
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();//close the browser
		//driver.close();
		
		
	}

}
