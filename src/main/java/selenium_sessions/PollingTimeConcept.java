package selenium_sessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PollingTimeConcept {

	static WebDriver driver;
	
	public static WebElement waitForElementVisible(By locator, int timeout, int pollingTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout),Duration.ofSeconds(pollingTime));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(driver.getTitle());
		// By emailID = By.id("inpt-email");
		By emailID = By.id("input-email");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
		// wait.pollingEvery(Duration.ofSeconds(2));
		WebElement email_ele = wait.until(ExpectedConditions.visibilityOfElementLocated(emailID));
		email_ele.sendKeys("kenkenkenken@gmail.com");

	}

}
