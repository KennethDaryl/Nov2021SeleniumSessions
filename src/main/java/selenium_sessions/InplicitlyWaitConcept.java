package selenium_sessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InplicitlyWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		By emailID = By.id("input-email");
		By password = By.id("input-paaassword");
		WebElement email_ele = driver.findElement(emailID);
		email_ele.sendKeys("kennnnnnnnnnnnn@gmail.com");
		WebElement pass_ele = driver.findElement(password);
		pass_ele.sendKeys("Test@1111");

	}

}
