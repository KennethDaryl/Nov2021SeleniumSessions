package selenium_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept_1 {
	static WebDriver driver;

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		System.out.println(driver.getTitle());
		By email = By.id("username");
		By pwd = By.id("password");
//		LocatorsConcept_1.doSendKeys(email, "kenneth@abc.com");
//		LocatorsConcept_1.doSendKeys(pwd, "qwerty!123456");
		ElementUtil ee = new ElementUtil(driver);
		ee.doSendKeys(email, "sUUUUuup@gmail.com");
		ee.doSendKeys(pwd, "Saikrupa@000000");
	}

}
