package testNgBasics;

import org.testng.annotations.Test;

public class DepandsOnMethod {

	@Test
	public void loginTest() {
		System.out.println("LoginTest");
	}

	@Test(dependsOnMethods = "loginTest")
	public void HomePageTest() {
		System.out.println("HomePageTest");
	}

}
