package mytest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
	/**
	 * Global Pre conditions 
	 * Pre conditions
	 * (Test Steps + assertions(validations)) (Act Vs Exp results) 
	 * Post steps(Eg: closing the browser, logout, delete cookies etc)
	 */
	
	@BeforeSuite
	public void createUser() {
		System.out.println("BS---Create user");
	}

	@BeforeTest
	public void connectWithDB() {
		System.out.println("BT---Connect With DB");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC---launch Browser");
	}

	@BeforeMethod
	public void login() {
		System.out.println("BM---login");
	}

	@Test
	public void homePageTest() {
		System.out.println("Home page test");
	}

	@Test
	public void searchTest() {
		System.out.println("Search test");
	}

	@Test
	public void priceTest() {
		System.out.println("Price test");
	}

	@AfterMethod
	public void logout() {
		System.out.println("AM---logout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC---close Browser");
	}

	@AfterTest
	public void disconnectWithDB() {
		System.out.println("AT---Disonnect With DB");
	}

	@AfterSuite
	public void deleteUser() {
		System.out.println("AS---Delete user");
	}
}
