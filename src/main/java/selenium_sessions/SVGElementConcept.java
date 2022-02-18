package selenium_sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElementConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		System.out.println(driver.getTitle());
		String svgxpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']/*[name()='g']/*[name()='path']";
		List<WebElement> graphList = driver.findElements(By.xpath(svgxpath));
		System.out.println(graphList.size());
		Actions act = new Actions(driver);
		int count = 1;
		for (WebElement e : graphList) {
			act.moveToElement(e).perform();
			Thread.sleep(1000);
			String attrName = e.getAttribute("name");
			System.out.println(count + " : " + attrName);
			count++;
			if (attrName.equals("New Mexico")) {
				act.click(e).perform();
				String newmexicoxpath = "//*[name()='g' and @id='new-mexico']//*[name()='g']/*[name()='path']";
				List<WebElement> mexicoplaceList = driver.findElements(By.xpath(newmexicoxpath));
				System.out.println(mexicoplaceList.size());
				break;
			}

		}
	}

}
