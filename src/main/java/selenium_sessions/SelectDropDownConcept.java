package selenium_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownConcept {
	static WebDriver driver;

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropdownIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectDropDownVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

	public static void doSelectDropDownValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println(driver.getTitle());
		By country = By.id("Form_submitForm_Country");
		By state = By.id("Form_submitForm_State");
//		WebElement country_ele = driver.findElement(country);
//		Select select = new Select(country_ele);
//		Thread.sleep(2000);
//		select.selectByValue("American Samoa");
//		Thread.sleep(2000);
//		select.selectByIndex(31);
//		Thread.sleep(2000);
//		select.selectByVisibleText("India");
//		Thread.sleep(2000);
//		WebElement state_ele = driver.findElement(state);
//		Select select1 = new Select(state_ele);
//		select1.selectByVisibleText("Karnataka");
		doSelectDropdownIndex(country, 1);
		Thread.sleep(2000);
		doSelectDropDownVisibleText(country, "India");
		Thread.sleep(3000);
		doSelectDropDownValue(state, "Karnataka");
	}

}
