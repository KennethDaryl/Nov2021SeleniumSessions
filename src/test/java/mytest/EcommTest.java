package mytest;

import org.testng.annotations.Test;

public class EcommTest {
	@Test(priority = 5)
	public void loginTest() {
		System.out.println("login test");
	}
	
	@Test(priority = 4)
	public void homeTest() {
		System.out.println("home test");
	}
	
	@Test(priority = 3)
	public void cartTest() {
		System.out.println("cart test");
	}
	
	@Test(priority = -10)
	public void searchTest() {
		System.out.println("search test");
	}
	
	@Test(priority = 1)
	public void m1Test() {
		System.out.println("m1 test");
	}
	
	@Test
	public void m2Test() {
		System.out.println("m2 test");
	}
}
