import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\4.SeleniumPractice\\SeleniumWebDriverDemo\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Thread.sleep(10000);
		
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		
		System.out.println("Passss 24");

//		while(!driver.findElement(By.className("cur-month")).getText().contains("Apr")) {
//			Thread.sleep(2000);
//			driver.findElement(By.className("flatpickr-next-month")).click();
//		}
		Thread.sleep(2000);

		System.out.println("Passss 30");
//		List<WebElement> days = driver.findElements(By.xpath("//td[@class='active day' or @class='day']"));
		List<WebElement> days = driver.findElements(By.xpath("//span[@class = 'flatpickr-day 'or @class = 'flatpickr-day today']"));

		System.out.println("Passss 34");
		for(int i=0;i<days.size();i++) {
			Thread.sleep(500);
			if(days.get(i).getText().equals("25")) {
				
				days.get(i).click();
				break;
				
			}
			
		}
		
	}

}