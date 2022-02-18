package selenium_sessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefExecptionConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println(driver.getTitle());
		WebElement fn_ele = driver.findElement(By.cssSelector("input#Form_submitForm_Name"));
		fn_ele.sendKeys("Kenneth");
		driver.navigate().refresh();
		// fn_ele.sendKeys("Keith");
		By fn_locator = By.cssSelector("input#Form_submitForm_Name");
		FluentWait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5), Duration.ofSeconds(1))
				.ignoring(StaleElementReferenceException.class).ignoring(NoSuchElementException.class)
				.withMessage(fn_locator + " is not found within given time");
		wait.until(ExpectedConditions.visibilityOfElementLocated(fn_locator)).sendKeys("Keith");
		// Or can use By locator strategy and then call driver.FE before and after
		// refresh
		By phone_locator = By.cssSelector("input#Form_submitForm_Contact");
		driver.findElement(phone_locator).sendKeys("9090909090");
		driver.navigate().refresh();
		driver.findElement(phone_locator).sendKeys("9090909021");
	}

}
