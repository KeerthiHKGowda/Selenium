package tpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OneTest {
	
	WebDriver driver;
	@Test
	public void testOne() {
		System.out.println("mOne executed");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		String actualText = driver.findElement(By.id("pah")).getText();
		Assert.assertEquals(actualText,"PracticeAutomationHere");
	}
	
	@AfterMethod	
	public void closure() {
		driver.close();
	}

}

<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-surefire-plugin</artifactId>
<version>3.0.0-MS</version>


<dependency>
<groupId>org.testng</groupId>
<artifactId>testng</artifactId>
<version>7.9.0</version>
<scope>test</scope>
</dependency>




