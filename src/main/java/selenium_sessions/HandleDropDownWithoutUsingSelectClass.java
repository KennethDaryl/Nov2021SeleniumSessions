package selenium_sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownWithoutUsingSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println(driver.getTitle());
		By country = By.xpath("//div[@id='Form_submitForm_Country_Holder']//option");
		List<WebElement> optionsList = driver.findElements(country);
		System.out.println(optionsList.size());
		//int i = 0;
		for (WebElement e : optionsList) {
			String text = e.getText();
			//System.out.println(i + " : " + text);
			if(text.contains("India"))
				e.click();
			//i++;
		}

	}

}
