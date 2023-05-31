package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	static WebDriver driver;

	//find out all links on the page
	//count of links
	//link-->html tag--<a>
	//find multiple elements 
	//print the text of each link
	//skip the blank text
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> linkList =driver.findElements(By.tagName("a"));
		int totalLinks= linkList.size();
		System.out.println("total links =" + totalLinks);
	/*	for(int i=0;i<totalLinks;i++) {
			String text=linkList.get(i).getText();
			
			if(text.length()>0) {
				
				System.out.println(i + "=" +text);
				
			}
		}*/
		int count=0;
		
	 for(WebElement e:linkList) {
		 
		 String text= e.getText();
		 if(text.length()>0) {
			 System.out.println(count + " = " +text);
		 }
		 
		 count++;
	 }
		
		

	}

}
