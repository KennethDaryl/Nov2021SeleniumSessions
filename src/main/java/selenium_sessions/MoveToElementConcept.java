package selenium_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html%22");
		System.out.println(driver.getTitle());
		WebElement contentParent = driver.findElement(By.className("menulink"));
		Actions act = new Actions(driver);
		act.moveToElement(contentParent).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("COURSES")).click();
	}

}
