package selenium_sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println(linksList.size());
		int count = 0;
		for (WebElement e : linksList) {
			String text = e.getText();
			if (!text.isEmpty()) {
				System.out.println(count + ":" + text);
				String hrefVal = e.getAttribute("href");
				System.out.println(hrefVal);
			}

			count++;
		}

//		for (int i = 0; i < linksList.size(); i++) {
//			String text = linksList.get(i).getText();
//			if (!text.isEmpty()) {
//				System.out.println(i + ":" + text);
//			}
//		}

	}
}
