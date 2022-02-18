package mytest;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	@Test(expectedExceptions = { NullPointerException.class, ArithmeticException.class })
	public void searchTest() {
		System.out.println("Search test");
		int i = 4 / 0;
	}
}
