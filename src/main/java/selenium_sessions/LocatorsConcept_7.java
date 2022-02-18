package selenium_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept_7 {

	private static WebDriver driver;

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static By getBy(String locatorType, String locatorValue) {
		By locator = null;
		switch (locatorType) {
		case "id":
			locator = By.id(locatorValue);
			break;

		default:
			break;
		}
		return locator;
	}

	public static void doSendKeys(String locatorType, String locatorValue, String value) {
		getElement(getBy(locatorType, locatorValue)).sendKeys(value);
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		System.out.println(driver.getTitle());
		String username = "username";
		String password = "password";
		LocatorsConcept_7.doSendKeys("id", username, "kenkeith@gmail.com");
		LocatorsConcept_7.doSendKeys("id", password, "abcde@1234567");
	}

}
