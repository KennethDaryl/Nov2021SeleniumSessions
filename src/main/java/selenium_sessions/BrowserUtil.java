package selenium_sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	private WebDriver driver;

	public WebDriver launchBrowser(String browser) {
		System.out.println("Browser is: " + browser);
		switch (browser.toLowerCase()) {
		case "chrome":
			// System.setProperty("webdriver.chrome.driver",
			// "C:\\Users\\admin\\Downloads\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			// System.setProperty("webdriver.gecko.driver",
			// "C:\\Users\\admin\\Downloads\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		default:
			System.out.println("Pass the right browser");
			break;
		}
		return driver;
	}

	public void enterUrl(String url) {
		if (url.contains("http") || url.contains("https")) {
			driver.get(url);
		} else {
			System.out.println("Incorrect url");
			try {
				throw new Exception("INCORRECT URL - MISSING HTTP or HTTPS");
			} catch (Exception e) {
			}
		}
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}
}
