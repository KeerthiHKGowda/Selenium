package wpack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class classSix {

	@BeforeTest
	public void openApplicationBeforeTest() {
	System.out.println("This executes before test");
	}
	
	@Test
	public void classsix() {
		System.out.println("Inside class six");
		}
	
	
}
