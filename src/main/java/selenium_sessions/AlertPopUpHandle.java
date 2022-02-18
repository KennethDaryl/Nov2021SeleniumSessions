package selenium_sessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		// alert.sendKeys("testing");
		alert.accept();
	}
}
