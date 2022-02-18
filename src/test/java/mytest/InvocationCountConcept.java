package mytest;

import org.testng.annotations.Test;

public class InvocationCountConcept {

	@Test(invocationCount = 5)
	public void getUserTest() {
		System.out.println("Get user test");
	}
}
