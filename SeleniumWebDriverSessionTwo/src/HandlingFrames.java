import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\4.SeleniumPractice\\SeleniumWebDriverDemo\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.omayo.blogspot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement frame2 = driver.findElement(By.id("iframe2"));
		
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.id("q")).sendKeys("Jai Hanuman");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("ta1")).sendKeys("Jai Hanuman");
		
		
	}

}
