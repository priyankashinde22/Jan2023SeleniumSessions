package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandleWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {
		
		
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By countryOptions =By.xpath("//select[@id='Form_getForm_Country']/option");
		boolean flag =DoSelectValueFromDropDownWithoutSelect(countryOptions,"India");
		System.out.println(flag);

	}
	public static boolean DoSelectValueFromDropDownWithoutSelect(By locator,String value) {
		boolean flag =false;
		List<WebElement> optionList =driver.findElements(locator);
		for(WebElement e:optionList) {
			String text =e.getText();
			if(text.equals(value)) {
				flag=true;
				e.click();
				break;
			}
		}
		if(flag==false) {
			System.out.println(value +"is not present in the drop down " +locator);
		}
		
		return flag;
	}

}
