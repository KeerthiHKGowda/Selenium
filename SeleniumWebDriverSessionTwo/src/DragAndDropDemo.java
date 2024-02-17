import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\4.SeleniumPractice\\SeleniumWebDriverDemo\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/p/page3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Actions actions = new Actions(driver);

//		WebElement startButton = driver.findElement(By.cssSelector("a[class*='ui-btn-null']"));

		WebElement startButton = driver.findElement(By.xpath("//a[contains(@class, 'ui-btn-null')][1]"));
		actions.dragAndDropBy(startButton, -100, 0).perform();

		Thread.sleep(3000);
		driver.close();
	}

}