package selenium_sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// WebDriverManager.firefoxdriver().setup();
		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ksrtc.in");
		// driver.get("https://m.redbus.in");
		System.out.println(driver.getTitle());
		// System.out.println(driver.getPageSource());
		// driver.quit();
		// System.out.println(driver.getTitle());
		driver.close();
		System.out.println(driver.getTitle());
	}

}
