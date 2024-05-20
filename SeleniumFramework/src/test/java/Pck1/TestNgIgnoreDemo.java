package Pck1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//to ignore at class level we can do it by adding before class

//@Ignore
//we can perform same using testng xml
public class TestNgIgnoreDemo {
	
	//ignore annotation. This test case will be ignore
	//
	@Ignore
	@Test
	public void test1() {
		System.out.println("I am inside test1");
	}
	@Test
	public void test2() {
		System.out.println("I am inside test2");
	}
}
