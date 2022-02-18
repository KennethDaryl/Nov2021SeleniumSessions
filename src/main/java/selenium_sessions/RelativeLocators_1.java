package selenium_sessions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators_1 {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		System.out.println(driver.getTitle());
		WebElement ele = driver.findElement(By.xpath("//a[text()='Alberta']"));
//		List<WebElement> list = driver.findElements(with(By.tagName("td")).toRightOf(ele));
//		List<String> listdata = new ArrayList<String>();
//		for(WebElement e:list) {
//		String text = e.getText();
//		listdata.add(text);
//		}
//		System.out.println(listdata);
		String status = driver.findElement(with(By.tagName("td")).toRightOf(ele)).getText();
		System.out.println(status);
	}

}
