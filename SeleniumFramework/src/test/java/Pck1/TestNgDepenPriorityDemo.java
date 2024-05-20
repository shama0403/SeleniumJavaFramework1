package Pck1;

import org.testng.annotations.Test;

public class TestNgDepenPriorityDemo {
	// even when priority is set dependency will take preference. 
	//we can create depedencies on multiple tests
	
	//@Test(dependsOnMethods = {"test2","test3"})
	@Test(dependsOnGroups = {"reg1"})
	//we can use regex also like all start with reg should run
	//@Test(dependsOnGroups = {"reg.*"})
	public void test1() {
		System.out.println("I am inside test1");
				
	}
	@Test
	public void test2() {
		System.out.println("I am inside test2");
	}
	
	@Test(priority = 1)
	public void test3() {
		System.out.println("I am inside test3");
	}
	
	//dependency on group
	@Test(groups = {"reg1"})
	public void test4() {
		System.out.println("I am inside test4");
	}


}
