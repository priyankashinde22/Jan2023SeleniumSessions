package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PesudoElementHandle {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//window.getComputedStyle(document.querySelector("label[for='input-firstname']"),'::before').getPropertyValue('content')
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//mandatoryFileds("input-firstname");
		mandatoryFileds("input-email");
		
		
		//JsExecutor:
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String man_field_text = js
		.executeScript(" return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')")
						.toString();
		
		System.out.println(man_field_text);
		String man_field_lasttext = js
				.executeScript(" return window.getComputedStyle(document.querySelector(\"label[for='input-lastname']\"),'::before').getPropertyValue('content')")
								.toString();
				
				System.out.println(man_field_lasttext);
				if(man_field_lasttext.contains("*")) {
					System.out.println("last name is  a mandatory filed");
					
				}*/
		
	}
	
	public static void mandatoryFileds(String name) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String man_field_text = js
		.executeScript(" return window.getComputedStyle(document.querySelector(\"label[for='"+name+"']\"),'::before').getPropertyValue('content')")
						.toString();
		
		System.out.println(man_field_text);
		if(man_field_text.contains("*")) {
			System.out.println("this is  a mandatory filed");
			
		}

		
		
	}

}
