package apack;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classSeven {
	@Test
	public void flipkart() {
		System.out.println("Flipkart");
		
	}
	
	@Test(dependsOnMethods= {"flipkart","walmart"})
	public void amazon() {
		System.out.println("Amazon");
		
		
	}
	
	@Test(enabled=true)
	public void macys() {
		
		System.out.println("Macys");
		
	}
	
	@Test(timeOut=5000)
	public void walmart() throws InterruptedException {
		
		Thread.sleep(4000);
		System.out.println("Walmart");
		
		
	}

	@Parameters({"URL"})
	@Test
	public void classSevenOne(String urlName)throws InterruptedException {
		System.out.println("Inside class fourThree");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(urlName);
		Thread.sleep(3000);
		driver.close();
		}
	
	@Parameters({"URL"})
	@Test
	public void classSevenTwo(String urlName)throws InterruptedException {
		System.out.println("Inside class fourThree");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(urlName);
		Thread.sleep(3000);
		driver.close();
	}
	
	
}