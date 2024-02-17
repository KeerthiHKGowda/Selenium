package wpack;

import org.testng.annotations.Test;

public class classFour {


	@Test
	public void classfour() {
		System.out.println("Inside class four");
		}
	
	@Test(groups={"smoke"})
	public void classfourOne() {
		System.out.println("Inside class fourOne");
		}
	
	@Test
	public void classfourTwo() {
		System.out.println("Inside class fourTwo");
		}
	
	@Test
	public void classfourThree() {
		System.out.println("Inside class fourThree");
		}
	
}
