package selenium_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes1 {

	static WebDriver driver;

	public static String getCompanyName(String name) {
		return driver.findElement(By.xpath("//td[text()='" + name + "']/preceding-sibling::td")).getText();
	}

	public static String getCountryName(String name) {
		return driver.findElement(By.xpath("//td[text()='" + name + "']/following-sibling::td")).getText();
	}

	public static int getRowCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr")).size() - 1;
	}

	public static int getColumnCount() {
		return driver.findElements(By.xpath("(//table[@id='customers']//tr)[1]/th")).size();
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println(driver.getTitle());
//		System.out.println(getCompanyName("Francisco Chang"));
//		System.out.println(getCountryName("Yoshi Tannamuri"));

		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr[3]/td[1]
		String beforexpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterxpath = "]/td[";
		for (int col = 1; col <= getColumnCount(); col++) {
			for (int i = 2; i <= getRowCount() + 1; i++) {
				String xpath = beforexpath + i + afterxpath+col+"]";
				String text = driver.findElement(By.xpath(xpath)).getText();
				System.out.print(text+" ");
			}
		}

	}

}
