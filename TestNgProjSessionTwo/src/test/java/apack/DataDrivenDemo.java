package apack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenDemo {

	@Test(dataProvider="getData")
	public void flipkart(String username,String password) {
		
		System.out.println("Flipkart - "+username+" and "+password);
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "arunmotoori";
		data[0][1] = "12345";
		
		data[1][0] = "varun";
		data[1][1] = "6789";
		
		data[2][0] = "tharun";
		data[2][1] = "1111";
		
		return data;
		
	}
}
