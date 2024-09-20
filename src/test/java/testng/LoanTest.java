package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoanTest extends BaseClass {
	
	
	
	
	@Test(enabled=false)
	public void TC01_HomeLoanTest() {
		
		System.out.println("Inside HomeLoan");
	}
	
	@Test
	public void TC02_CarLoanTest() {
		
		System.out.println("Inside CarLoan");
	}
	
	@Test
	public void TC00_PersonalLoanTest() {
		
		System.out.println("Inside PersonalLoan");
		
	
		
		
			
	}
}