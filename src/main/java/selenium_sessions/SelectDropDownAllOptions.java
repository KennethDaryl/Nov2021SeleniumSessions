package selenium_sessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownAllOptions {
	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<String> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> OptionsList = select.getOptions();
		List<String> OptionsTextList = new ArrayList<String>();
		System.out.println(OptionsList.size());
		for(WebElement e:OptionsList) {
			String text = e.getText();
			OptionsTextList.add(text);
		}
		return OptionsTextList;
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println(driver.getTitle());
		By country = By.id("Form_submitForm_Country");
		By state = By.id("Form_submitForm_State");
//		Select select1 = new Select(driver.findElement(country));
//		select1.selectByVisibleText("India");
//		Select select = new Select(driver.findElement(state));
//		List<WebElement> optionsList = select.getOptions();
//		System.out.println(optionsList.size());
//		int count = 0;
//		for (WebElement e : optionsList) {
//			System.out.println(count + " : " + e.getText());
//			count++;
//		}
		if(getDropDownOptionsList(country).contains("India")) {
			System.out.println("India is present");
		}
	}

}
