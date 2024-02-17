import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverDropdownDemo {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"F:\\4.SeleniumPractice\\SeleniumWebDriverDemo\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("http://www.omayo.blogspot.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			WebElement blogsMenu = driver.findElement(By.id("blogsmenu"));
			
			Actions a = new Actions(driver);
			a.moveToElement(blogsMenu).perform();
			
//			WebElement blogsMenuDropDown = driver.findElement(By.xpath("//span[@text= 'SeleniumOneByArun']"));
			WebElement blogsMenuDropDown = driver.findElement(By.xpath("//span[contains(text(), 'SeleniumOneByArun')]"));
			a.moveToElement(blogsMenuDropDown).click(blogsMenuDropDown).build().perform();

		}
	}
