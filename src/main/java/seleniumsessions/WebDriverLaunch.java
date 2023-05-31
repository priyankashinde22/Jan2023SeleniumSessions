package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLaunch {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();
	//testing for 2 web appliction by login with admin and user multiple driver
		driver.get("https://www.google.com");
		driver1.get("https://www.amazon.com");
		driver = driver1;
		System.out.println(driver.getTitle());//it gives amazon title
	}

}
