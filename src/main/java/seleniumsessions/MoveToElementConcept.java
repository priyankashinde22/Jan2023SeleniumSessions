package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
	/*	WebElement contactMenu =driver.findElement(By.className("menulink"));
		Actions act = new Actions(driver);
		
		act.moveToElement(contactMenu).build().perform();
		Thread.sleep(1500);
		driver.findElement(By.linkText("COURSES")).click();*/
		By contentParentMenu=By.className("menulink");
		By courseschildMenu=By.linkText("COURSES");
		
		//handleTwoLevelMenu(contentParentMenu,courseschildMenu);
		handleTwoLevelMenu(contentParentMenu,"ARTICLES");
	}
	
	public static void handleTwoLevelMenu(By parentMenu,By childMenu) throws InterruptedException {

		WebElement contactMenu =driver.findElement(parentMenu);
		Actions act = new Actions(driver);
		
		act.moveToElement(contactMenu).build().perform();
		Thread.sleep(1500);
		driver.findElement(childMenu).click();
		
	}
	public static void handleTwoLevelMenu(By parentMenu,String childMenuLinkText) throws InterruptedException {

		WebElement contactMenu =driver.findElement(parentMenu);
		Actions act = new Actions(driver);
		
		act.moveToElement(contactMenu).build().perform();
		Thread.sleep(1500);
		driver.findElement(By.linkText(childMenuLinkText)).click();
		
	}
	

}
