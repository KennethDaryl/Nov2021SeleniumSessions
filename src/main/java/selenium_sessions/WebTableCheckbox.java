package selenium_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableCheckbox {
	static WebDriver driver;

	public static void selectCheckbox(String name) {
		WebElement checkbox = driver
				.findElement(By.xpath("//a[text()='" + name + "']/parent::td/preceding-sibling::td/child::input"));
		checkbox.click();
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		System.out.println(driver.getTitle());
//		WebElement checkbox = driver
//				.findElement(By.xpath("//a[text()='Garry.White']/parent::td/preceding-sibling::td/child::input"));
//		checkbox.click();
		selectCheckbox("Jasmine.Morgan");
		selectCheckbox("Joe.Root");
		selectCheckbox("John.Smith");
	}

}
