package selenium_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = br.launchBrowser("chrome");
		br.enterUrl("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(br.getPageTitle());
		By emailid = By.id("input-email");
		By password = By.id("input-password");
		ElementUtil eu = new ElementUtil(driver);
		eu.doSendKeys(emailid, "kenneth@gmail.com");
		eu.doSendKeys(password, "Test@1233334444");
	}

}
