package seleniumsessions;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.*;

public class GetAndToMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		//driver.navigate().to("https://www.amazon.com");
		try {
		driver.navigate().to(new URL("https://www.amazon.com"));
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
		driver.get("https://www.amazon.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
	}

}
