package selenium_sessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	static WebDriver driver;

	public static WebElement waitForElementPresenceWithFluentWait(By locator, int timeout, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.withMessage(locator + " is not found within given time");
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(driver.getTitle());
		By emailID = By.id("input-email");
		// By password = By.id("input-password");
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//									.withTimeout(Duration.ofSeconds(10))
//									.pollingEvery(Duration.ofSeconds(2))
//									.ignoring(NoSuchElementException.class)
//									.ignoring(StaleElementReferenceException.class)
//									.withMessage(emailID + "is not found within the given time");
//		WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(emailID));
//		email_ele.sendKeys("KenKeith@gmail.com");
//		driver.findElement(password).sendKeys("test@12333");
		waitForElementPresenceWithFluentWait(emailID, 5, 2).sendKeys("kenkenkenken@gmail.com");
	}

}
