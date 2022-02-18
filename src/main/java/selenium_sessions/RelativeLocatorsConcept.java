package selenium_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		System.out.println(driver.getTitle());
		WebElement ele = driver.findElement(By.xpath("//a[text()='Duncan, Canada']"));
		String index = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(index);
		String rank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(rank);
		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);
		String name = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(name);
	}

}
