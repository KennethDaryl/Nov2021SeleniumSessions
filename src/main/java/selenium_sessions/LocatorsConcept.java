package selenium_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		System.out.println(driver.getTitle());
		By email = By.id("username");
		By password = By.id("password");
		WebElement em = driver.findElement(email);
		WebElement pwd = driver.findElement(password);
		em.sendKeys("ken@gmail.com");
		pwd.sendKeys("Test@12345");

	}

}
