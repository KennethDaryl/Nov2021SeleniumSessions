package AppTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHrmTest extends BaseTest {

	@Test
	public void logoTest() {
		Assert.assertTrue(driver.findElement(By.className("nav-logo")).isDisplayed());
	}

	@Test
	public void contactSalesLinkTest() {
		Assert.assertTrue(driver.findElement(By.linkText("CONTACT SALES")).isDisplayed());
	}

	@Test(enabled = false)
	public void pageTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Sign Up for a Free HR Software Trial | OrangeHRM");
	}

	@Test(enabled = false)
	public void headerTest() {
		String header = driver.findElement(By.cssSelector("div.try-it-text h1")).getText();
		Assert.assertTrue(header.contains("free trial"));
	}

}
