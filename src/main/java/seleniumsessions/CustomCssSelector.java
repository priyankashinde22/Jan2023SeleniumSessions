package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelector {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//css selector:cypress,PW,WDIO
		//page :html +css
		//id:
		//  #id or tag#id
		//    #input-email or input#input-email 
		//class:
		//  .classname
		//  input.btn or input.form-control or input.form-control#input-email
		
		//c1 c2  c3
		//  .c1.c2.c3
		
		// tag.c1.c2.c3
		
		//    .btn.btn-primary or input.btn.btn-primary
		
		By.xpath("//input[@class='form-control private-form_control login -email']");//valid
		By.cssSelector("input.form-control.private-form_control.login-email");//valid
	//	By.xpath("//input[@class='form-control']");//invalid
		By.className("login-email");//valid
	//	By.className("form-control private-form_control login -email");//invalid *multiple classes are not allowed
		
		
		// other attribute
		// tag[attr='value']
		
		// input[type='email'] 
		//input[id='input-email']
		//input[type='submit']--css
		//input[@type='submit']--xpath
		//input[placeholder='Search']--css
		
		//multiple attribue:
		//  tag[attr1='value'][attr2='value']--css
		
		//input[placeholder='Search'][name='search'] 
		//input[placeholder='Search'][name='search']
		//input[placeholder='Search'][name='search'][type='text']
		//input[placeholder][name][type='text']
		
		
		
		//tag[@attr1='value' and attr2='value']--xpath
		//input[@placeholder and @name and @type='text']
		//input#input-email[placeholder='E-Mail Address']
		//input[placeholder='E-Mail Address']#input-email
		
		//css text in css: not applicable it was there in older version no support
		
		//contains in css:
		//  tag[attr*='value']
		// input[id*='email']
		//input[placeholder*='Address']
		// input[class*='login-email']--css
		//input[contains(@class,'login-email')]-xpath
		
		// start-with in css:
		//tag[attr^='value']
		//input[class^='form-control']
		
		//end-with in css:
		//tag[attr$='value']
		//input[class$='login-email']
		
		//parent to child:
		//direct +indirect child elements
		//parent tag child tag (space in between)
		// select#Form_getForm_Country option
		//   form#hs-login div
		// form#hs-login input#username
		
		
		//parent tag >child tag-->direct child element
		//   form#hs-login >div
		
		//child to parent :not availble backword traversing in CSS
		
		//following sibling in css:
		
		//label[for='input-email']+input#input-email-->for immediate sibling
		
	//	select#Form_getForm_Country>option[value='Afghanistan']~option
		
		//preceding sibling in css: not applicable
		
		//indexing in CSS:
	//	select#Form_getForm_Country option:first-child
	// select#Form_getForm_Country option:last-child
		// select#Form_getForm_Country option:nth-child(5)
		
		// select#Form_getForm_Country option:nth-last-child(4)
		// select#Form_getForm_Country option:nth-child(even)
		// select#Form_getForm_Country option:nth-child(odd)
		// select#Form_getForm_Country option:nth-child(n+4)
		// select#Form_getForm_Country option:nth-child(3n-1)
		// select#Form_getForm_Country option:nth-child(4n)

		//option[normalize-space()='India']-->xpath
		
		
	//	or in CSS:
		
		
		// not in CSS:
		
		// form-control private-form__control login-email
		// "form-control private-form__control login-password m-bottom-3"
	//	input.form-control.private-form__control:not(input#username)
		
		
		//Comma in CSS
		// input#username,input#password,input#remember,button#loginBtn
	List<WebElement> mandatoryEles=	driver.findElements(By.cssSelector("input#username,input#password,input#remember,button#loginBtn"));
		
	if(mandatoryEles.size()==4) {
		System.out.println("mandatory elements are present test is PASS");
	}
	
	//					xpath       vs CSS
	
	//1.syntax			hard			easy
	//2.text			yes				no
	//3.AND				yes				yes
	//4.OR				yes				yes(comma)
	//5.forward			yes				yes
			
	//6.Backward			yes			no
	//7.forwardsibling		yes			yes
	//8.backwordsibling 	yes			no
	//9.index				yes			yes
	//10.capture group		yes			no
	//11.contains			yes			yes
	//12.starts-with  		yes			yes
	//13.end-with			no			yes
	//14.normalize-spac		yes			no
	
	//15.first/last			yes			yes
	//16.parent to childe	yes			yes
	//17.child to parent 	yes			no
	//18.performance		good		slightly better than xpath /good
	
	//19.webtable			easy		limited
	
	}
	

}
