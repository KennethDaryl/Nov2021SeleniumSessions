package selenium_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandler {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		System.out.println(driver.getTitle());
		driver.switchTo().frame(driver.findElement(By.name("main")));
		String header = driver.findElement(By.xpath("//h2[contains(text(),'Title bar ')]")).getText();
		System.out.println(header);

	}
}
