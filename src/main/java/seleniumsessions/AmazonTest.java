package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("chrome");
		brUtil.launchURL("https://www.amazon.com");
		String actTitle = brUtil.getPageTitle();
		System.out.println("page title:" + actTitle);
		
		Verify.equalValues(actTitle, "Amazon.com. Spend less. Smile more.");
		/*if (actTitle.contains("Amazon.com")) {
			System.out.println("PASS--title");

		} else {
			System.out.println("FAIL--title");
		}*/
		
		String actUrl = brUtil.getPageURL();
		System.out.println("page URL:" + actUrl);
		Verify.containValues(actUrl, "amazon");
		
		/*if (actUrl.contains("amazon")) {
			System.out.println("PASS--URL");
		} else {
			System.out.println("FAIL --URL");
		}*/
		brUtil.quitBrowser();

	}

}
