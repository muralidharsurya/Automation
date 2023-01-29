package assertion;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {  
	
	@Test
	public void createUser() {
		String actual = "mahabharat";
		String expected= "bharat";
		SoftAssert sa =  new  SoftAssert();
		sa.assertEquals(actual,expected);
		System.out.println("passed");
		sa.assertAll();
	}

	
}
