package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver= brUtil.initDriver("chrome");
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = brUtil.getPageTitle();
		System.out.println("Page title:" + title);
		System.out.println(brUtil.getPageURL());
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By confirm = By.id("input-confirm");
		eleUtil.doSendKeys(firstname, "Priyanka");
		eleUtil.doSendKeys(lastname, "Borhade");
		eleUtil.doSendKeys(email, "priyankaborhade@gmail.com");
		eleUtil.doSendKeys(telephone, "1234567890");
		eleUtil.doSendKeys(pwd, "abc@123");
		eleUtil.doSendKeys(confirm, "abc@123");
		
		/*String fn=eleUtil.doGetAttributeValue(firstname, "value");
		System.out.println(fn);
		String ln=eleUtil.doGetAttributeValue(lastname, "value");
		System.out.println(ln);
		String emailid=eleUtil.doGetAttributeValue(email,"value");
		System.out.println(emailid);
		String telph=eleUtil.doGetAttributeValue(telephone,"value");
		System.out.println(telph);
		String paswd=eleUtil.doGetAttributeValue(pwd,"value");
		System.out.println(paswd);
		String cnfmpwd=eleUtil.doGetAttributeValue(confirm,"value");
		System.out.println(cnfmpwd);*/
		
		//Placeholder
		String fn=eleUtil.doGetAttributeValue(firstname, "placeholder");
		System.out.println(fn);
		String ln=eleUtil.doGetAttributeValue(lastname, "placeholder");
		System.out.println(ln);
		String emailid=eleUtil.doGetAttributeValue(email,"placeholder");
		System.out.println(emailid);
		String telph=eleUtil.doGetAttributeValue(telephone,"placeholder");
		System.out.println(telph);
		String paswd=eleUtil.doGetAttributeValue(pwd,"placeholder");
		System.out.println(paswd);
		String cnfmpwd=eleUtil.doGetAttributeValue(confirm,"placeholder");
		System.out.println(cnfmpwd);
		
		
		/*By agree = By.name("agree");
		eleUtil.doClick(agree);

		By cntinue = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		eleUtil.doClick(cntinue);
		By accntCreated =By.tagName("h1");
		String text=eleUtil.doGetElementText(accntCreated);
		System.out.println(text);
		if(text.equals("Your Account Has Been Created!")) {
			System.out.println("PASS");
		}*/
		brUtil.quitBrowser();
		

	}

}
