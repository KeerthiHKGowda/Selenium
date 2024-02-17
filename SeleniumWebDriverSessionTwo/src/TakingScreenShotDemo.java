import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShotDemo {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\4.SeleniumPractice\\SeleniumWebDriverDemo\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
		//Take a Screenshot here before login
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("Screenshots\\screenshotbeforeLogin.png"));
				
				
		driver.findElement(By.id("input-email")).sendKeys("arun.motoori@gmail.com");	
		driver.findElement(By.id("input-password")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	
		//Take a Screenshot here after login
				File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src2, new File("Screenshots\\screenshotAfterLogin.png"));
	
		driver.quit();
	
	
	}

}
