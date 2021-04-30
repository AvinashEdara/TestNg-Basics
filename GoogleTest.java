package testNgBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

	}

	@Test(groups = "Title")
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test(groups = "Logo")
	public void logoTest() {
		Boolean b = driver.findElement(By.xpath("//body/div[1]/div[2]")).isDisplayed();
		System.out.println(b);
	}

	@Test
	public void gmailTest() {
		Boolean c = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
		System.out.println(c);

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
