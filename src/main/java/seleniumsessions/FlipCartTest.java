package seleniumsessions;

public class FlipCartTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("chrome");
		brUtil.launchURL("https://www.eBay.com");
		String actTitle = brUtil.getPageTitle();
		System.out.println("page title:" + actTitle);
		
		Verify.equalValues(actTitle, "Electronics, Cars, Fashion, Collectibles & More | eBay");
		
		String actUrl = brUtil.getPageURL();
		System.out.println("page URL:" + actUrl);
		Verify.containValues(actUrl, "ebay");
		
		
		brUtil.quitBrowser();


	}

}
