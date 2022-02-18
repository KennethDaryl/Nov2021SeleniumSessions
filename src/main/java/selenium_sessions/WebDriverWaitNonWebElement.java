package selenium_sessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitNonWebElement {

	static WebDriver driver;

	public static boolean waitForPageTitleContains(String titleVal, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.titleContains(titleVal));
	}

	public static String doGetPageTitleContains(String titleVal, int timeout) {
		if (waitForPageTitleContains(titleVal, timeout)) {
			return driver.getTitle();
		}
		return null;
	}

	public static boolean waitForPageActualTitle(String ActTitle, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.titleIs(ActTitle));
	}

	public static String doGetPageTitleIs(String ActTitle, int timeout) {
		if (waitForPageActualTitle(ActTitle, timeout)) {
			return driver.getTitle();
		}
		return null;
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.titleContains("Smile more."));
//		System.out.println(driver.getTitle());
		System.out.println(doGetPageTitleContains(".com", 5));
		System.out.println(doGetPageTitleIs("Amazon.com. Spend less. Smile more.", 5));
	}

}
