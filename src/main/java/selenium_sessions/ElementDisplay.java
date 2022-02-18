package selenium_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisplay {

	static WebDriver driver;

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(driver.getTitle());
		By emailid = By.id("input-email");
//		if (driver.findElement(By.id("input-email")).isDisplayed()) {
//			driver.findElement(By.id("input-email")).sendKeys("ssssssssss@gmail.com");
//		}
		if (doIsDisplayed(emailid)) {
			doSendKeys(emailid, "kkkkkkk@gmail.com");
		}

		boolean aaa = driver.findElement(emailid).isEnabled();
		System.out.println(aaa);
	}

}
