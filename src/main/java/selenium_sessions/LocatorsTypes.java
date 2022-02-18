package selenium_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsTypes {
	static WebDriver driver;

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(driver.getTitle());
//		driver.findElement(By.name("email")).sendKeys("kennnn@gmail.com");
//		driver.findElement(By.className("form-control")).sendKeys("kkkkk@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("afadasdasd@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("ttttttttttttttttt");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
//		By email = By.xpath("//*[@id=\"input-email\"]");
//		By password = By.xpath("//*[@id=\"input-password\"]");
//		By login = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		doSendKeys(email, "kenkenken@gmail.com");
//		doSendKeys(password, "weewew@111111");
//		doClick(login);
		
//		By emailid = By.cssSelector("#input-email");
//		By pass = By.cssSelector("#input-password");
//		doSendKeys(emailid, "kkkkkkkkkkkkkk@gmail.com");
//		doSendKeys(pass, "ttt@123");
//		driver.findElement(By.linkText("Register")).click();
//		driver.findElement(By.partialLinkText("Forgotten")).click();
//		String header = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
		By header = By.tagName("h2");
		System.out.println("Header is: " + doGetText(header));
	}

}
