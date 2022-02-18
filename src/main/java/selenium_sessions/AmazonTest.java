package selenium_sessions;

public class AmazonTest {

	public static void main(String[] args) {
		String browser = "Chrome";
		BrowserUtil br = new BrowserUtil();
		br.launchBrowser(browser);
		br.enterUrl("https://www.amazon.com");
		String title = br.getPageTitle();
		if (title.contains("Amazon")) {
			System.out.println("Title is correct");
		}
		if(br.getPageUrl().contains("amazon")) {
			System.out.println("url is correct");
		}
		br.quitBrowser();
	}

}
