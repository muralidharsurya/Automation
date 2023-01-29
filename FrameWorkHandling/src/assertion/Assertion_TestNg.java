package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Assertion_TestNg {
// hard assert strict level comparison
	@Test
	public void createUser() {
		 String actual= "maharaja";
		 String expected= "raja";
		 Assert.assertEquals(actual, expected);
		 System.out.println("passed");
	
	}
	@Test
	public void modifyUser() {
		String actual = "maharaja";
		String expected="raja";
		Assert.assertTrue(actual.contains(expected));
		System.out.println("pass modifier");
		
		
	}
	
}
