package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithOutSelectMethods {

	static WebDriver driver;

	public static void main(String[] args) {
		
		//drop down ---html---select
		//Select class
		
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country =By.id("Form_getForm_Country");
		ElementUtil eleUtil = new ElementUtil(driver);
		boolean flag =eleUtil.doSelectDropDownValue(country, "priyn");
		System.out.println(flag);
		
	//	WebElement countryEle = driver.findElement(country);
	/*	int actCount =getDropDownValueCount(country);
		if(actCount == 233) {
			System.out.println("PASS--Count");
		}
		List<String> actCountryList =getAllDropDownOptions(country);
		System.out.println(actCountryList.contains("India"));
		System.out.println(actCountryList.contains("Zaire"));*/
		//doSelectDropDownValue(country,"India");

	}
	
	public static List<String> getAllDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList =select.getOptions();
		List<String> optionsValueList = new ArrayList<String>();
		System.out.println("total values are :" + (optionsList.size()));
		
		for(WebElement e :optionsList) {
			String text =e.getText();
			System.out.println(text);
			optionsValueList.add(text);
		}
		
		return optionsValueList;
	}
	public static void doSelectDropDownValue(By locator,String dropDownValue) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList =select.getOptions();
	
		System.out.println("total values are :" + (optionsList.size()));
		
		for(WebElement e :optionsList) {
			String text =e.getText();
			System.out.println(text);
			if(text.equals(dropDownValue)) {
				e.click();
				break;
			}
		}
		
		
	}
	
	
	public static int getDropDownValueCount(By locator) {
		return getAllDropDownOptions(locator).size();
	}
	

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
}
