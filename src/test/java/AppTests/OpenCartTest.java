package AppTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest {

	@Test
	public void openCartTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Account Login");
	}

	@Test
	public void openCartHeaderTest() {
		Assert.assertTrue(driver.findElement(By.cssSelector("div#logo h1")).isDisplayed());
	}

}
