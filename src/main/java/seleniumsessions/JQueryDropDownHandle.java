package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(1500);

		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(1500);

		By choices = By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//li/span");
		

		// 1.TC_1:single selection:
		 selectChoice(choices, "choice 1");
		 DeSelectChoice(choices,"choice 1");
		// 2.TC_2:Multiple Selection:
	//	selectChoice(choices,"choice 1","choice 2","choice 6 2 1","choice 7","choice 4","choice 10");
	//	DeSelectChoice(choices,"choice 1","choice 2","choice 6 2 1","choice 7","choice 4","choice 10");
		// 3.TC_3:All selection:
		//selectChoice(choices, "all");
		//DeSelectChoice(choices,"all");
	}

	// String... is vararg or variable argument parameter
	public static void selectChoice(By locator, String... value) throws InterruptedException {

		List<WebElement> optionList = driver.findElements(locator);
		boolean flag =false;
		
		System.out.println(optionList.size());
		if (!value[0].equalsIgnoreCase("all")) {

			for (WebElement e : optionList) {
				String text = e.getText();
				System.out.println(text);

				// multiple selection logic:
				for (int i = 0; i < value.length; i++) {
					if (text.equals(value[i])) {
						flag=true;
						e.click();
						break;
					}
					
					
				}
			}
			if(flag==false) {
				System.out.println("choice is not available");
			}


		}
		else {
			//all selection logic
			for (WebElement e : optionList) {
				String text =e.getText();
				if(!text.equals("−")) {
					Thread.sleep(1000);
					e.click();
					flag = true;
				}
			}
			
		}
		
	}
	public static void DeSelectChoice(By locator, String... value) throws InterruptedException {

		List<WebElement> optionList = driver.findElements(locator);
		boolean flag =false;
		
		//System.out.println(optionList.size());
		if (!value[0].equalsIgnoreCase("all")) {

			for (WebElement e : optionList) {
				String text = e.getText();
			//	System.out.println(text);

				// multiple selection logic:
				for (int i = 0; i < value.length; i++) {
					if (text.equals(value[i])) {
						flag=true;
						e.click();
						break;
					}
					
					
				}
			}
			if(flag==false) {
				System.out.println("choice is not available");
			}


		}
		else {
			//all selection logic
			for (WebElement e : optionList) {
				String text =e.getText();
				if(!text.equals("−")) {
					Thread.sleep(1000);
					e.click();
					flag = true;
				}
			}
			
		}
		
	}
	
	
	
	

}
