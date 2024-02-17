package tpack;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class AnnotationsDemo {

		@BeforeClass
		public void openApplicationBeforeClass() {
		System.out.println("Opening Application under test - Inside @BeforeClass");
		}

		@BeforeMethod
		public void openApplication() {
		System.out.println("Inside @BeforeMethod annotated method - openApplication");
		}

		@Test (priority=2)
		public void testLogin(){
			
			System.out.println("Testing Login functionality");
			
		}		
		
		@Test (priority=3)
		public void testHomePage(){
			
			System.out.println("Testing Home Page functionality");
			
		}
		
		@Test(priority=1)
		public void testRegistration(){
			
			System.out.println("Testing Registration functionality");
			
		}	
		
		@AfterMethod
		public void closeBrowser(){
			
			System.out.println("Inside @AfterMethod annotated method - closeBrowser");
			
		}
		
		@AfterClass
		public void closeBrowserAfterClass(){
			
			System.out.println("Closing Brower - Inside @AfterClass");
			
		}


	}