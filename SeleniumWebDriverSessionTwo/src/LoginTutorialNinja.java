import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginTutorialNinja {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\4.SeleniumPractice\\SeleniumWebDriverDemo\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		WebElement email = driver.findElement(By.name("email"));
		WebElement pwd = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
		Actions action = new Actions(driver);
		
		email.sendKeys("asdsad@gmail.com");
		pwd.sendKeys("asdasd");
		pwd.sendKeys(Keys.chord(Keys.CONTROL,"z"));
		Thread.sleep(3000);
		pwd.sendKeys("asdasd");
		action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();


	}

}
