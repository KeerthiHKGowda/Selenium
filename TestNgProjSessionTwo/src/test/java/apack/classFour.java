package apack;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

public class classFour {

	@Parameters({"URL"})
	@Test
	public void classfour(String urlName) throws InterruptedException {
		System.out.println("Inside class four");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(urlName);
		Thread.sleep(3000);
		driver.close();
	}
	
	@Parameters({"URL"})
	@Test(groups={"smoke"})
	public void classfourOne(String urlName) throws InterruptedException {
		System.out.println("Inside class fourOne");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(urlName);
		Thread.sleep(3000);
		driver.close();
		}
//	
//	@Parameters({"URL"})
//	@Test
//	public void classfourTwo(String urlName) throws InterruptedException {
//		System.out.println("Inside class fourTwo");
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get(urlName);
//		Thread.sleep(3000);
//		driver.close();
//		}
//	
//	@Parameters({"URL"})
//	@Test
//	public void classfourThree(String urlName)throws InterruptedException {
//		System.out.println("Inside class fourThree");
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get(urlName);
//		Thread.sleep(3000);
//		driver.close();
//		}
	
	
	
	
}
