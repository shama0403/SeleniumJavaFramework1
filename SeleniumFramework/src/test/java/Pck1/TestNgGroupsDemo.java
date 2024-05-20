package Pck1;

import org.testng.annotations.Test;

// group at class level. Group defined at class > all the methods inside the class will be part of that group
//So say test1 class belongs to sanity + all class group. Test2 belongs to sanity, smoke and all class group
@Test(groups = {"AllClassGroup"})

public class TestNgGroupsDemo {
	//assign groups or test suite name to test. we can assign one test to multiple groups comma seperated
	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("This is test1");
	}

	@Test(groups = {"sanity","smoke"})
	public void test2() {
		System.out.println("This is test2");
	}

	@Test(groups = {"sanity","regression"})
	public void test3() {
		System.out.println("This is test3");
	}
	@Test
	public void test4() {
		System.out.println("This is test4");
	}


}
