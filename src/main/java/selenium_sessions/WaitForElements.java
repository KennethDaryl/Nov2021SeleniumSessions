package selenium_sessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForElements {

	static WebDriver driver;
	
	public static List<WebElement> waitForWebElementsVisible(By locator, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public static List<WebElement> waitForWebElementsPresence(By locator, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		System.out.println(driver.getTitle());
		By footers = By.cssSelector("ul.footer-nav>li");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
		List<WebElement> footersList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footers));
		for (WebElement e : footersList) {
			System.out.println(e.getText());
		}
	}

}
