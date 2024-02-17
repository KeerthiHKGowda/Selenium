import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLightBoxDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\4.SeleniumPractice\\SeleniumWebDriverDemo\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.in/p/lightbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.id("lightbox1")).click();

		Thread.sleep(3000);

		driver.findElement(By.cssSelector("span[class$='cursor']")).click();

	}
}
