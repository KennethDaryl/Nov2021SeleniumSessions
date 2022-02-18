package selenium_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {

	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static String getAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(driver.getTitle());
		By emailid = By.id("input-email");
		doSendKeys(emailid, "kenkenken@gmail.com");
//		String attrvalue = driver.findElement(emailid).getAttribute("value");
//		System.out.println(attrvalue);
//		String attrgreytxt = driver.findElement(emailid).getAttribute("placeholder");
//		System.out.println(attrgreytxt);
		System.out.println(getAttribute(emailid, "value"));
	}

}
