package selenium_sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Element;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("google");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		List<WebElement> suggList = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.println(suggList.size());
		for (WebElement e : suggList) {
			System.out.println(e.getText());
			String text = e.getText();
			if (text.contains("google drive")) {
				e.click();
				break;
			}
		}

	}

}
