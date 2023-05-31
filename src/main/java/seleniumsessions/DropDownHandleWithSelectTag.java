package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleWithSelectTag {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//drop down ---html---select
		//Select class
		
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country =By.id("Form_getForm_Country");
		WebElement countryEle = driver.findElement(country);
		Select select =new Select(countryEle);
		//select.selectByIndex(5);
		//select.selectByVisibleText("Belgium");
		select.selectByValue("India");
		

	}
	
	

}
