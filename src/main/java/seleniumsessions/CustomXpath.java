package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		
		//Xpath: address of the element in html DOM
		/* types of xpath
		 * 1.absolute xpath: absolute address of the element in the html DOM2.
		 * 2.relative /custom xpath:
		 * xpath functions
		 * xpath properties
		 * xpath axes
		 ////-->direct + indirect child elelmets
		  * single : /->direct child elements
		  * ---//htmltag[@attr='value']
		  * //input[@id='input-email']
		  */
		//input[@name='email'](value,title,id name..etc)
		 // //htmltag[@attr='value' and @attr='value']
		// //img[@title='naveenopencart' and @alt='naveenopencart']
		driver.findElement(By.xpath("img[@title='naveenopencart' and @alt='naveenopencart']")).click();
		////input[@type='text' and @name='firstname' and @placeholder='First Name']
		//
		//text():label,header,link,span
		//htmltag[text()='value']
		////a[text()='Login']
		//a[text()='Order History']
		//h1[text()='Register Account']
		//span[text()='business impact.']
		//label[text()='First Name']
		
		//contains() with attribute:
		//htmltag[contains(@attr,'value')]
		//input[contains(@placeholder,'E-Mail' )]
		//a[contains(@href,'account/forgotten' )]
		
		//contains with 2 attributes:
		//htmltag[contains(@attr,'value') and contains(@attr,'value')]
		//input[contains(@placeholder,'E-Mail') and contains(@id,'email')]
		
		
		//contains with one attribute but no contains with second attr
		//htmltag[contains(@attr1,'value') and @attr2='value']
		//input[contains(@placeholder,'E-Mail') and @id='input-email']
		//input[@id='input-email' and contains(@placeholder,'E-Mail') ]
		
		//contain() with text():
		//httmltag[contains(text(),'value')]
		//a[contains(text(),'Delivery')]
		//div[contains(text(),'Warning')]
		////div[contains(text(),'No match for E-Mail Address and/or Password')]
		////p[contains(text(),'By creating an account you will be able to shop faster')]
		
		//contains with text() and contains with @attre
		//htmltag[contains(text(),'value') and contains(@attr,'value')]
		//a[contains(text(),'Terms') and contains(@href,'information')]
		
		////contains with text() and no contains with @attre
		
		//a[contains(text(),'Account') and @class='list-group-item']
		
		//start-with():
			//htmltag[starts-with(@attr,'value')]
			//input[starts-with(@placeholder,'E-Mail')]
			
			//ends-with() in xpath? -- NO
			
			//index:
			// (//input[@class='form-control'])[1]
			driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("naveen");
			// (//input[@class='form-control'])[position()=1]
			
			//last():
			// (//input[@class='form-control'])[last()]
			// (//input[@class='form-control'])[last()-(last()-1)]
			// ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]
			// ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()-(last()-1)]
			// ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[1]
		
			
			//-----------------amazon xpath practice link-----------
			//amazon renewed link->((//table[@class='navFooterMoreOnAmazon']//tr)[last()]//a)[last()]
			//eero WiFi link->((//table[@class='navFooterMoreOnAmazon']//tr)[last()]//a)[last()-(last()-1)]
		
		//----------freshworks----------
			//Freshworks Neo--->((//div[@class='sc-6293d692-0 eNMhGa'])[last()]//li)[last()]
			//((//div[@class='sc-6293d692-0 eNMhGa'])[last()]//li)[last()-(last()-1)]
			
			////a[starts-with(text(),'Gift')]
			
			//p[starts-with(text(),'Power')]/a?
		
	}

}
