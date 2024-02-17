package tpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	@Test
	public void sampleAutomation() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		driver.findElement(By.id("alert1")).click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		driver.close();
	}

	@Test
	public void testMethodA() {
		int a = 10 / 0;
	}

	@Test
	public void skipExceptionDemo() {
		int a = 5, b = 6;
		if (a < b) {
			throw new SkipException("Skipping test in TestNG");
		}
	}

	@Test
	public void throwingExceptionDemo() throws Exception {
		int a = 5, b = 6;
		if (a < b) {
			throw new Exception();
		}
	}

}
