package prepairedataDrivenFramWork;


import org.testng.annotations.Test;

public class Depens_ON { 
	@Test(enabled =true)
	public void moneyDeposite() {
		System.out.println("money deposite successfully");
	}
	
	@Test(dependsOnMethods= "moneyDepodite")
	public void chechkBalance() {
		System.out.println(" balence check successfully");
		
	}
	@Test
	public void withDraw() {
		System.out.println(" with draw successfully");
		
	}

}
