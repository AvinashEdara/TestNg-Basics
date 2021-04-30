package testNgBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basics1 {

	@BeforeMethod
	public void start() {
		System.out.println("Test has begin");
	}

	@Test
	public void f() {
		System.out.println("Test is being executed");
	}

	@AfterMethod
	public void a() {
		System.out.println("Testing is done !");
	}
}
