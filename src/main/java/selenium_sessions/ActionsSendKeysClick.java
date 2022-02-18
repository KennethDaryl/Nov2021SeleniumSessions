package selenium_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSendKeysClick {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		System.out.println(driver.getTitle());
		WebElement fnele = driver.findElement(By.id("input-firstname"));
		WebElement lnele = driver.findElement(By.id("input-lastname"));
		WebElement emailele = driver.findElement(By.id("input-email"));
		WebElement teleele = driver.findElement(By.id("input-telephone"));
		WebElement passwordele = driver.findElement(By.id("input-password"));
		WebElement passwordconfirmele = driver.findElement(By.id("input-confirm"));
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		WebElement continueButtonele = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		Actions act = new Actions(driver);
		act.sendKeys(fnele, "kenkenkenken").perform();
		act.sendKeys(lnele, "Mendonsa").perform();
		act.sendKeys(emailele, "kkkkkkkk@gmail.com").perform();
		act.sendKeys(teleele, "1234567890").perform();
		act.sendKeys(passwordele, "test@123").perform();
		act.sendKeys(passwordconfirmele, "test@123").perform();
		act.click(checkbox).perform();
		act.click(continueButtonele).perform();
	}
}
