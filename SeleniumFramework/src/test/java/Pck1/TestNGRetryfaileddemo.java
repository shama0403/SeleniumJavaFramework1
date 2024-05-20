package Pck1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryfaileddemo {
	
	@Test
	public void test1() {
		System.out.println("I am inside test1");
	}
	@Test
	public void test2() {
		System.out.println("I am inside test2");
		//add to fail test case
		//int i=1/0;
	}

	//fail and use retry. Use retryAnalyzer
	//this retry class is created in listeners package so package.class
	//during execution of test refer to retryAnalyzer defined in RetryAnalyzer.class inside listeners package
	@Test(retryAnalyzer = listeners.RetryAnalyzer.class)
	public void test3() {
		System.out.println("I am inside test3");
		// add to fail test case
		Assert.assertTrue(0>1);
	}

}
