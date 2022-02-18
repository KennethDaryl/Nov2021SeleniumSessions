package selenium_sessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForURL {

	static WebDriver driver;

	public static String waitForUrlContains(String urlFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
			return driver.getCurrentUrl();
		}
		return null;
	}

	public static String waitForUrlToBe(String url, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if (wait.until(ExpectedConditions.urlToBe(url))) {
			return driver.getCurrentUrl();
		}
		return null;
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Register")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		if (wait.until(ExpectedConditions.urlContains("account/register"))) {
//			System.out.println(driver.getCurrentUrl());
//		}

		System.out.println(waitForUrlContains("account/register", 5));
		System.out.println(waitForUrlToBe("https://demo.opencart.com/index.php?route=account/register", 6));
	}

}
