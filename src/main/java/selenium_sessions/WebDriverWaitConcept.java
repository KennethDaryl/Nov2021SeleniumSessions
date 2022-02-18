package selenium_sessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	
	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement waitForElementPresence(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement waitForElementVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(driver.getTitle());
		//By emailID = By.id("input-emeail");
		By emailID = By.id("input-email");
		By password = By.id("input-password");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(emailID));
//		email_ele.sendKeys("kkkeeennn@gmail.com");
//		driver.findElement(password).sendKeys("Test@22222");
		
		waitForElementPresence(emailID, 5).sendKeys("keitharyl@gmail.com");
		//getElement(emailID).sendKeys("kennethmendonsa@gmail.com");
		waitForElementVisible(password, 4).sendKeys("TEst22222222222");
		
	}

}
