package seleniumsessions;

public class GoogleTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("chrome");
		brUtil.launchURL("https://www.google.com");
		String actTitle = brUtil.getPageTitle();
		System.out.println("page title:" + actTitle);
		
		Verify.equalValues(actTitle, "Google");
		
		String actUrl = brUtil.getPageURL();
		System.out.println("page URL:" + actUrl);
		Verify.containValues(actUrl, "google");
		
		
		brUtil.quitBrowser();

	}

}
