package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
		
		//testing is happening behind scene
		//faster
		//can be helpful in linux machine
		//can be used  with CI CD pipeline -jenkins,Githubactions ,AWS
		
		//Problem -might not work for complex app-html,menu items
		//might not work for internal navigations, mouse hover and mouse movement
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co);
		//FirefoxOptions fo = new FirefoxOptions();
		//fo.addArguments("--headless");
		//fo.addArguments("--incognito");
		//WebDriver driver = new ChromeDriver(fo);
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
	}

}
