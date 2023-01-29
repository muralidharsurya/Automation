package demoTestNg;

import org.testng.annotations.Test;

public class DemoTestNgFrameWork {
	@Test(priority = 1)
	public void createUserAcc() {
  System.out.println("user Acc Created successfully");
	}
	@Test(priority = 2)
	public void modifiedUser() {
		System.out.println("use  Modified is successfully");
		
	}
	@Test(priority = 3)
	public void deleteUser() {
		System.out.println("user deleled successfully");
	}
	

	@Test(priority = -1)
	public void createUserAcc1() {
  System.out.println("user Acc Created successfully");
	}
	@Test(priority = 0)
	public void modifiedUser2() {
		System.out.println("use  Modified is successfully");
		
	}
	@Test(priority = -3)
	public void deleteUser2() {
		System.out.println("user deleled successfully");
	}
	
}
