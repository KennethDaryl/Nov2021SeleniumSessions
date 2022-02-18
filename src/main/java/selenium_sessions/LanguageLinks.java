package selenium_sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanguageLinks {
	static WebDriver driver;

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void clickOnLink(By locator, String linkText) {
		List<WebElement> langList = getElements(locator);
		for (WebElement e : langList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(linkText)) {
				e.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
//		ElementUtil euu = new ElementUtil(driver);
//		By lang = By.xpath("//div[@id='SIvCob']/a");
//		System.out.println(euu.getElementsCount(lang));
//		euu.printElementsText(lang);
//		List<WebElement> langList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//		for (WebElement e : langList) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.contains("മലയാളം")) {
//				e.click();
//				break;
//			}
//		}
//		By lang = By.xpath("//div[@id='SIvCob']/a");
//		clickOnLink(lang, "मराठी");
		By lang = By.xpath("//div[@class='KxwPGc SSwjIe']//a");
		// clickOnLink(lang, "Security");
		List<WebElement> footerList = driver.findElements(lang);
		System.out.println(footerList.size());
		for (WebElement e : footerList) {
			String text = e.getText();
			System.out.println(text);
		}
	}

}
