package bpack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.SkipException;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ListenersDemo {
	@Test
	public void classfour()  {
		int a=2;
		int b=5, c=3;
		System.out.println("Inside class four");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		if (a<b) {
			Assert.assertTrue(b<c);
		}else if(a==1) {
			Assert.assertTrue(b>c);
		}else if (a==3) {
			throw new SkipException("Test Skipped");
		}
		
	driver.close();
	
	}
}
