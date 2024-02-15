import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrieveTableData {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\4.SeleniumPractice\\SeleniumWebDriverDemo\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com");  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		List<WebElement> names = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[1]"));
		int i;
		
		for( i=0;i<names.size();i++) {
			
			
			if(names.get(i).getText()=="Praveen") {
				
				break;
				
			}
			
		}
		
		String placeXPath = "//table[@id='table1']/tbody/tr["+i+"]/td[3]";
		
		String location = driver.findElement(By.xpath(placeXPath)).getText();
		
		System.out.println(location);
		
		driver.quit();
	}

}