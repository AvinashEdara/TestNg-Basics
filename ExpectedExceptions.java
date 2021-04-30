package testNgBasics;

import org.testng.annotations.Test;

public class ExpectedExceptions {

	@Test(expectedExceptions = NumberFormatException.class)
	public void Test() {
		String x = "100A";
		int a = Integer.parseInt(x);
		System.out.println(a);
	}
}
