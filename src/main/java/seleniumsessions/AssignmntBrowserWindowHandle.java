package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmntBrowserWindowHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");// parent page
		Thread.sleep(3000);
		
	
		By twitter= By.xpath("//a[contains(@href,'twitter')]");
		By linkedin =By.xpath("//a[contains(@href,'linkedin')]");
		By facebook =By.xpath("//a[contains(@href,'facebook')]");
		By youtube = By.xpath("//a[contains(@href,'youtube')]");
		
		BrowserWindow("twitter");
		Thread.sleep(3000);
		BrowserWindow("linkedin");
		Thread.sleep(3000);
		BrowserWindow("facebook");
		Thread.sleep(3000);
		BrowserWindow("youtube");
		Thread.sleep(3000);
		
		driver.quit();

	}
	public static void BrowserWindow(String locator) {
		
		driver.findElement(By.xpath("//a[contains(@href,'"+locator+"')]")).click();
		
		Set<String> handles = driver.getWindowHandles();
		//Iterator<String> it = handles.iterator();
		List<String> handleList = new ArrayList<String>(handles);
	//	String parentWindowID = it.next();
		//String childWindowID = it.next();
		
		String parentWindowID = handleList.get(0);
		String childWindowID =handleList.get(1);
		
		System.out.println("Parent window id:" + parentWindowID);
		System.out.println("child window id:" + childWindowID);
		driver.switchTo().window(childWindowID);
		
		System.out.println("Child page:"+driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent Page :"+driver.getCurrentUrl());
		
		
	
		
		
	}

}
