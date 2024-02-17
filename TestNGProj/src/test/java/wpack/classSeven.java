package wpack;
import org.testng.annotations.Test;

public class classSeven {
	@Test
	public void flipkart() {
		System.out.println("Flipkart");
		
	}
	
	@Test(dependsOnMethods= {"flipkart","walmart"})
	public void amazon() {
		System.out.println("Amazon");
		
		
	}
	
	@Test(enabled=true)
	public void macys() {
		
		System.out.println("Macys");
		
	}
	
	@Test(timeOut=5000)
	public void walmart() throws InterruptedException {
		
		Thread.sleep(4000);
		System.out.println("Walmart");
		
		
	}


}