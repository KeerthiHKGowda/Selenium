import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestionDrpodownDemo {

		public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"F:\\4.SeleniumPractice\\SeleniumWebDriverDemo\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
			Actions a = new Actions(driver);
			
			a.moveToElement(driver.findElement(By.xpath("//img[@alt='Make My Trip']"))).click().build().perform();;
			
			WebElement fromCity = driver.findElement(By.id("fromCity"));
			
			fromCity.click();
			
			WebElement fromTextField = driver.findElement(By.xpath("//input[@placeholder='From']"));
			
			fromTextField.click();
			
			fromTextField.sendKeys("del");
			
			for(int i=0;i<3;i++) {
				Thread.sleep(2000);
				fromTextField.sendKeys(Keys.DOWN);
				}
			
			Thread.sleep(2000);
			
			fromTextField.sendKeys(Keys.ENTER);
		}
	}
