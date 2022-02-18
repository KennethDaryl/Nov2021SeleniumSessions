package selenium_sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		//co.setHeadless(true);
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println("The current url is : " + driver.getCurrentUrl());
		driver.close();
	}

}
