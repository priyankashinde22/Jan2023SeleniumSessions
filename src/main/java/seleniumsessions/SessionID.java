package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SessionID {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);

		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);

		System.out.println(driver.getCurrentUrl());

		//driver.quit();
		 driver.close();
		 driver = new ChromeDriver(co);
		
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		//NoSuchSessionException: Session ID is null.[after quit-is null]
		
		//NoSuchSessionException: invalid session ID.[after close-is invalid]
		 driver.close();
	}

}
