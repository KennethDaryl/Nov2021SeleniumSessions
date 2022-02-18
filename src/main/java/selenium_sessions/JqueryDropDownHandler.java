package selenium_sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandler {
	static WebDriver driver;

	static boolean flag = false;

	public static void selectChoice(By locator, String... value) {
		List<WebElement> choicesList = driver.findElements(locator);
		if (!value[0].equalsIgnoreCase("all")) {

			for (WebElement e : choicesList) {
				String text = e.getText();
				// System.out.println(text);

				for (int i = 0; i < value.length; i++) {
					if (text.equals(value[i])) {
						e.click();
						flag = true;
						break;
					}
				}
			}
		}
	else

	{
		try {
			for (WebElement e : choicesList) {
				e.click();
				flag = true;
			}

		} catch (ElementNotInteractableException e) {
			System.out.println("All choices are clicked");
		}

	}if(flag==false)
	{
		System.out.println("Choice is not available");
	}
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("justAnInputBox")).click();
		By choices = By.xpath("//span[@class='comboTreeItemTitle']");
//		List<WebElement> choicesList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//		for (WebElement e : choicesList) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("choice 2")) {
//				e.click();
//				break;
//			}
		// selectChoice(choices, "choice 5");
		// selectChoice(choices, "choice 1","choice 2", "choice 4");
		// selectChoice(choices, "ALL");
		// selectChoice(choices, "choice 8");
		selectChoice(choices, "choice 1", "choice 2", "choice 3");
	}

}
