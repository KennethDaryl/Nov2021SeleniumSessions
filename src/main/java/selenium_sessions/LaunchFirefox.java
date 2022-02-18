package selenium_sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		if (title.contains("Amazon")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}
		driver.quit();
	}

}
