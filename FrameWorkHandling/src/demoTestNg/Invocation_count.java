package demoTestNg;

import org.testng.annotations.Test;

public class Invocation_count {
	// to execution test case multiple times we need method called invocationCount
	
	@Test(priority = 1,invocationCount = 10)
	public void createUser() {
		System.out.println();
	}
	@Test(priority = 2)
	public void modifiedUser () {
		System.out.println("User modifier SuccessFully");
	}
	@Test(priority = 3)
	public void searchUser () {
		System.out.println("search for user");
		
	}
	@Test(priority = 4)
	public void deleteUser() {
		System.out.println("user delete successfully");
	}
	
}
