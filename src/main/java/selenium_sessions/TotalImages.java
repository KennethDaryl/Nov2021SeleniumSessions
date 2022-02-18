package selenium_sessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {
	static WebDriver driver;

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static void printElementsText(By locator) {
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);
		}
	}

	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String text = e.getText();
			if (!text.isEmpty()) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}

	public static List<String> getElementsAttributeList(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleAttrList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String attrVal = e.getAttribute(attrName);
			eleAttrList.add(attrVal);
		}
		return eleAttrList;
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
//		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
//		System.out.println(imagesList.size());
//		int count = 0;
//		for (WebElement e : imagesList) {
//			String altVal = e.getAttribute("alt");
//			String srcVal = e.getAttribute("src");
//			System.out.println(count + ":" + altVal + " " + srcVal);
//			count++;
//		}

		By links = By.tagName("a");
		By images = By.tagName("img");
		System.out.println(getElementsCount(links));
		System.out.println(getElementsCount(images));
		if (getElementsTextList(links).contains("Registry")) {
			System.out.println("Registry link is present");
		}

		System.out.println(getElementsAttributeList(images, "alt"));

	}

}
