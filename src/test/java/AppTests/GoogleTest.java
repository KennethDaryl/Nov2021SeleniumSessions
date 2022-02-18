package AppTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	@Test
	public void googleTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Google");
	}

	@Test
	public void googleSearchTest() {
		driver.findElement(By.name("q")).sendKeys("Kenneth Cole");
		Assert.assertTrue(true);
	}

}
