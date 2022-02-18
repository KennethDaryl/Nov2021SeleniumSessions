package selenium_sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchSugg {
	static WebDriver driver;

	public static void selectSuggestion(String suggestion) {
		WebElement ele = driver
				.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(),'" + suggestion + "')]"));
		ele.click();
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(3000);
//		WebElement ele = driver
//				.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(),'Blouses > Blouse')]"));
//		ele.click();
		// selectSuggestion("Casual Dresses");
		List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='ac_results']//li"));
		System.out.println(suggList.size());
		for (WebElement e : suggList) {
			System.out.println(e.getText());
			if (e.getText().contains("T-shirts")) {
				e.click();
			}
		}
	}
}
