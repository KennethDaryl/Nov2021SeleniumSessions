package selenium_sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		System.out.println(driver.getTitle());
		WebElement contextMenuele = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(contextMenuele).perform();
		List<WebElement> optionsList = driver.findElements(By.xpath(
				"//ul[@class='context-menu-list context-menu-root']/li[(contains(@class,'context-menu-item context-menu-icon context-menu'))]"));
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("Cut")) {
				e.click();
				break;
			}
		}
	}
}
