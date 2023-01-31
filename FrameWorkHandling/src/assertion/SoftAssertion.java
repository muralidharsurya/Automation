package assertion;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {  
	// soft assert strict level comparision
	@Test
	public void createUser() {
		String actual = "mahabharat";
		String expected= "bharat";
		SoftAssert sa =  new  SoftAssert();
		sa.assertEquals(actual,expected);
		System.out.println("passed");
		//sa.assertAll();
	}
	//soft assert contains level comparision
	
	@Test
	public void modifiedUser() {
		String actual = "mahabharat";
		String expected = "bharat";
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(actual.contains(expected));
		System.out.println(" modified successfull");
		sa.assertAll();
	}

	
}
