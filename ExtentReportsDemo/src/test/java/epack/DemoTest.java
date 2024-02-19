package epack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	
	WebDriver driver;
	ExtentReports extent ;
	
	@BeforeMethod
	public void configuration(){
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		reporter.config().setReportName("Omayo Test Results");
		reporter.config().setDocumentTitle("Test Results");
	   
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		extent.setSystemInfo("Operating System","Windows 10");
		extent.setSystemInfo("Tested By","Keerthi HK");
	}
	
	@Test
	public  void testOne() {
		
		ExtentTest eTest = extent.createTest("Test One started");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		eTest.info("Chrome browser launched");
		
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		eTest.info("Navigated to omayo Home Page");
		
		String actualText = driver.findElement(By.id("pah")).getText();
		
		System.out.println(actualText);
		
		eTest.fail("Test One failed");	

		Assert.assertEquals(actualText,"PracticeAutomationHereaaa");
	

	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		extent.flush();
	}
}
