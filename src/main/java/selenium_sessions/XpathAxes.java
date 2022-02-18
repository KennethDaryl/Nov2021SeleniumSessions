package selenium_sessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {

	static WebDriver driver;

	public static String getWicketTakerName(String PlayerName) {
		return driver.findElement(By.xpath("//a[text()='" + PlayerName + "']/parent::td/following-sibling::td/span"))
				.getText();
	}

	public static List<String> getPlayerScoreCard(String PlayerName) {
		List<String> scoredetails = new ArrayList<String>();
		List<WebElement> scorecardlist = driver
				.findElements(By.xpath("//a[text()='" + PlayerName + "']/parent::td/following-sibling::td"));
		for (int i = 1; i < scorecardlist.size(); i++) {
			String text = scorecardlist.get(i).getText();
			scoredetails.add(text);
		}
		return scoredetails;
	}

	public static List<String> getBatsmanPlayerScoreCard(String PlayerName) {
		List<String> scoredetails = new ArrayList<String>();
		List<WebElement> scorecardlist = driver.findElements(
				By.xpath("(//table/thead[@class='thead-light bg-light'])[1]/following-sibling::tbody//td/a[text()='"
						+ PlayerName + "']/parent::td/following-sibling::td"));
		for (int i = 1; i < scorecardlist.size(); i++) {
			String text = scorecardlist.get(i).getText();
			scoredetails.add(text);
		}
		return scoredetails;
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/india-in-south-africa-2021-22-1277060/south-africa-vs-india-1st-odi-1277082/full-scorecard");
		System.out.println(driver.getTitle());
		// System.out.println(driver.findElement(By.xpath("//a[text()='Temba
		// Bavuma']/parent::td/following-sibling::td/span")).getText());
		// System.out.println(getWicketTakerName("Janneman Malan"));
		// System.out.println(getPlayerScoreCard("Aiden Markram"));
		System.out.println(getBatsmanPlayerScoreCard("Aiden Markram"));
	}

}
