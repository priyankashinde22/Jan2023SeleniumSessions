package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		//right click -- context click --context menu
		
	//	WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		
		/*Actions action = new Actions(driver);
		action.contextClick(rightClickBtn).build().perform();
		
		List<WebElement> rightClickEles=driver.findElements(By.cssSelector("ul.context-menu-list span"));
		System.out.println(rightClickEles.size());
		
		
		for(WebElement e :rightClickEles)
		{
			String text =e.getText();
			
			System.out.println(text);
			
			if(text.equals("Edit")) {
				e.click();
			
				Alert alert = driver.switchTo().alert();
				String alertText=alert.getText();
				System.out.println(alertText);
				alert.accept();
				break;
				
			}
			
			
			
			
		}*/
		
		By rhtClkBtn =By.xpath("//span[text()='right click me']");
		
		//rightClickBtnMenu(rhtClkBtn,"Edit");
		//rightClickBtnMenu(rhtClkBtn,"Cut");
		//rightClickBtnMenu(rhtClkBtn,"Copy");
		//rightClickBtnMenu(rhtClkBtn,"Paste");
		//rightClickBtnMenu(rhtClkBtn,"Delete");
		rightClickBtnMenu(rhtClkBtn,"Quit");
	}
	
	public static void rightClickBtnMenu(By locator,String rhtMenuText) throws InterruptedException {
		
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(locator)).build().perform();
		
		List<WebElement> rightClickEles=driver.findElements(By.cssSelector("ul.context-menu-list span"));
		System.out.println(rightClickEles.size());
		
		
		for(WebElement e :rightClickEles)
		{
			String text =e.getText();
			
			System.out.println(text);
			
			if(text.equals(rhtMenuText)) {
				e.click();
			
				Alert alert = driver.switchTo().alert();
				String alertText=alert.getText();
				Thread.sleep(4000);
				System.out.println(alertText);
				alert.accept();
				break;
				
			}
			
			
			
		}
		
		
	}
	

}
