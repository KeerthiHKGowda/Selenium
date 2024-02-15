import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\4.SeleniumPractice\\SeleniumWebDriverDemo\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.omayo.blogspot.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Thread.sleep(5000);
		
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
	    
	    driver.close();	
	
	}

}
