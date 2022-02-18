package mytest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest {

	@DataProvider
	public Object[][] loginTestData() {
		return new Object[][] { { "admin@gmail.com", "admin111" }, { "cust@gmail.com", "cust111" },
				{ "vendor@gmail.com", "vendor111" }, { "", "@#@#@" } };
	}

	@Test(dataProvider = "loginTestData")
	public void loginTest(String userName, String password) {
		Assert.assertTrue(doLogin(userName, password));
	}

//	@Test
//	public void loginTest1() {
//		Assert.assertTrue(doLogin("Keith@gmail.com", "Test@222"));
//	}

	public boolean doLogin(String userName, String password) {
		System.out.println("Username : " + userName);
		System.out.println("Password : " + password);
		System.out.println("Login successful");
		return true;
	}
}
