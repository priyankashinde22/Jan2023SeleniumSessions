package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.WebDriver;

public class SeleniumManagerConcept {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
	//	co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.amazon.com");
		
		//String cPath=SeleniumManager.getInstance().getDriverPath("chromedriver");//4.8.1
		String cPath = SeleniumManager.getInstance().getDriverPath(co);//4.8.2/4.8.3 changes
		System.out.println(cPath);
		driver.quit();
		

	}

}
