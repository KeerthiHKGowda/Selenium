package vpack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class classThree {

	@BeforeSuite
	public void openApplicationBeforeSuite() {
	System.out.println(";;;;;;;;;;;;;;This executes before suite;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
	}
	
	@Test(groups={"smoke"})
	public void classthree() {
		System.out.println("Inside class three");
		}
	

	@AfterTest
	public void openApplicationAfterTest() {
	System.out.println(";;;;;;;;;;;;;;This executes after test;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
	}
	
	@AfterSuite
	public void openApplicationAfterSuite() {
	System.out.println(";;;;;;;;;;;;;;This executes after suite;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
	}
}
