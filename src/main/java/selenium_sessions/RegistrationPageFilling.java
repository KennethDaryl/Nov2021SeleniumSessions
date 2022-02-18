package selenium_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPageFilling {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		ElementUtil ele = new ElementUtil(driver);
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(driver.getTitle());
		String reg = "Register";
		ele.doClick("linkText", reg);
		By regheader = By.xpath("//*[@id=\"content\"]/h1");
		String regheader1 = ele.doGetText(regheader);
		System.out.println(regheader1);
		if (regheader1.equals("Register Account")) {
			System.out.println("Register Account page is displayed");
		} else {
			System.out.println("Register Account page is not displayed");
		}
		String fn = "input-firstname";
		String ln = "input-lastname";
		String email = "//*[@id=\"input-email\"]";
		String tele = "input-telephone";
		String pass = "password";
		String passconfirm = "input-confirm";
		String subscription = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input";
		String checkbox = "//*[@id=\"content\"]/form/div/div/input[1]";
		String continueb = "//*[@id=\"content\"]/form/div/div/input[2]";
		ele.doSendKeys("id", fn, "kenneth");
		ele.doSendKeys("id", ln, "Mendonsa");
		ele.doSendKeys("xpath", email, "kennnne@gmail.com");
		ele.doSendKeys("id", tele, "9897687668");
		ele.doSendKeys("name", pass, "Test@123456789");
		ele.doSendKeys("id", passconfirm, "Test@123456789");
		ele.doClick("xpath", subscription);
		ele.doClick("xpath", checkbox);
		ele.doClick("xpath", continueb);
		By acccreation = By.xpath("//*[@id=\"content\"]/h1");
		String acccreation1 = ele.doGetText(acccreation);
		if (acccreation1.equals("Your Account Has Been Created!")) {
			System.out.println("Account creation page is displayed");
		} else {
			System.out.println("failed");
		}

	}

}
