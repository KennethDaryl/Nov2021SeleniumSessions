package selenium_sessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForFrame {
	
	static WebDriver driver;
	
	public static WebDriver waitForFrameByIndex(int frameIndex, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}

	public static WebDriver waitForFrameByLocator(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	}
	
	public static WebDriver waitForFrameByElement(WebElement frameElement, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		System.out.println(driver.getTitle());
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("main")));
//		String header = driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();
//		System.out.println(header);
		By namelocator = By.name("main");
		waitForFrameByLocator(namelocator, 5);
		String header = driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();
		System.out.println(header);
		
	}

}
