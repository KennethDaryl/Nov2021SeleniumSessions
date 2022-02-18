package selenium_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
//	System.out.println(driver.getTitle());
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	String title = js.executeScript("return document.title;").toString();
//	System.out.println(title);
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		String title = jsUtil.getTitleByJS();
		System.out.println(title);
//	String pageText = jsUtil.getPageInnerText();
//	if(pageText.contains("Blog")) {
//		System.out.println("PASS");
//	}
		// jsUtil.generateAlert("Kenneth Daryl Mendonsa");
		// jsUtil.refreshBrowserByJS();
//		WebElement ele = driver.findElement(By.xpath("//h2[text()='Returning Customer']"));
//		jsUtil.drawBorder(ele);
//		WebElement elee = driver.findElement(By.id("input-email"));
//		jsUtil.flash(elee);
//		elee.sendKeys("kkkkkkkk@gmail.com");
//		jsUtil.scrollPageDown();
//		Thread.sleep(5000);
//		jsUtil.scrollPageUp();
//		Thread.sleep(5000);
//		jsUtil.scrollPageDown("300");
//		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Beauty')]"));
//		jsUtil.scrollIntoView(ele);
//		jsUtil.flash(ele);
//		jsUtil.drawBorder(ele);
//		WebElement ele = driver.findElement(By.xpath("//a[text()='Careers']"));
//		jsUtil.clickElementByJS(ele);
		jsUtil.sendKeysUsingWithId("input-password", "11");
	}

}
