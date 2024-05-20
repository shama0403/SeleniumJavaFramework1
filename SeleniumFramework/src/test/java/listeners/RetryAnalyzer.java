package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class RetryAnalyzer implements IRetryAnalyzer{
	//Here we are taking retrycount as 0 and maximum retry count as 3. At each retry i.e reexecution of test case the retry count is incremented and till count is 3
	private int retryCount=0;
	private static final int maxRetryCount=3;
	
	//@Override
	public boolean retry(ITestResult result) {
		if(retryCount < maxRetryCount) {
			retryCount++;
			return true;
			
		}
		return false;
	}
	
	
	

}
