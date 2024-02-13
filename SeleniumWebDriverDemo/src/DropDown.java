import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;


public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\4.SeleniumPractice\\SeleniumWebDriverDemo\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		driver.get("http://www.omayo.blogspot.com");
		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		WebElement dropdownField = driver.findElement(By.id("drop1"));
//		Select select = new Select(dropdownField);
//		select.selectByVisibleText("doc 3");
		
		
		 Actions actions = new Actions(driver);
	        
	     WebElement homeAndFurniture = driver.findElement(By.xpath("//span[contains(text(), 'Home & Furniture')]"));
//	     WebElement homeAndFurniture = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));


	     actions.moveToElement(homeAndFurniture).perform();
	        
	     WebElement bedLinens = driver.findElement(By.xpath("//a[contains(text(), 'Bed Linens')]"));
	        bedLinens.click();
//		driver.close();
	}

}
