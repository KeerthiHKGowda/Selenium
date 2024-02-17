package tpack;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AsertionsDemo {

	@Test(priority=1)

	public void sampleMethodOneFalse(){	
		Assert.assertEquals("Hello", "Bye");
		Assert.fail("Intentially failed the test method sampleMethod using TestNG's fail method");

	}
	
	@Test(priority=2)

	public void sampleMethodTwoFalse(){
		Assert.fail("Intentially failed the test method sampleMethod using TestNG's fail method");

		Assert.assertTrue(3>5);
	}
	
	@Test(priority=5)
	public void sampleMethodOneTrue(){
		Assert.assertEquals("Hello", "Hello");
		Assert.assertNotEquals("Hello", "Bye");
		Assert.assertFalse(3>5);


	}
	
	@Test(priority=3)
	public void sampleMethodTwoTrue(){
		Assert.assertTrue(6>5);
	}
	
	@Test
	public void sampleMethodFalse(){
		System.out.println("Second");
		Assert.assertFalse(6>5);
		Assert.fail("Intentially failed the test method sampleMethod using TestNG's fail method");

	}
	
	@Test(priority=4)
	public void sampleMethodFail(){
		System.out.println("First");
		Assert.fail("Intentially failed the test method sampleMethod using TestNG's fail method");
		
	}
}
