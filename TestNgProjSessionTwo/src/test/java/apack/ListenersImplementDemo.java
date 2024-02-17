package apack;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImplementDemo implements ITestListener{
	
	
public void onTestStart(ITestResult result) {
		
		System.out.println("Listened to code and found that the Test started "+result.getName());
		
	}
	
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Listened to code and found that it is successfully executed "+result.getName());
		
	}
	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Listened to code and found that the Test is failed "+result.getName());
		
	}
	
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Listened to code and found that the Test is skipped "+result.getName());
		
	}
	

}