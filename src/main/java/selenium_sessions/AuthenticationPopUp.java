package selenium_sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUp {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String username = "admin";
		String password = "admin";
		driver.get("https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");
		System.out.println(driver.getTitle());
	}
}
