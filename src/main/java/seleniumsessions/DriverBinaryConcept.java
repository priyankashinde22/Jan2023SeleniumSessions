package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverBinaryConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver.quit(); // it will stop exe
		//driver.close();//it will not stop exe.

	}

}
