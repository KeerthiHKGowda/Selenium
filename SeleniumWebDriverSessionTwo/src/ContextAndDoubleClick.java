import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextAndDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\4.SeleniumPractice\\SeleniumWebDriverDemo\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");

		Actions actions = new Actions(driver);

		WebElement searchBoxField = driver.findElement(By.name("q"));		
		actions.contextClick(searchBoxField).perform();
		
		searchBoxField.sendKeys("Arun");
		
		
		actions.doubleClick(searchBoxField).perform();
		Thread.sleep(3000);
		
		
//		WebElement compendiumdevLink = driver.findElement(By.linkText("compendiumdev"));
//		actions.moveToElement(compendiumdevLink).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
//		Thread.sleep(3000);

		WebElement username = driver.findElement(By.name("userid"));
		WebElement password = driver.findElement(By.name("pswrd"));
		
		WebElement loginButton = driver.findElement(By.xpath("//input[[@value='Login']"));
				
		username.sendKeys("arun");
		actions.sendKeys(Keys.TAB).perform();
		password.sendKeys("motoori");
		actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		driver.close();	
	}

}
