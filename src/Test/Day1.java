package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

	@Test(dependsOnMethods= {"Apilogin"})
	public void mobile2login() {
		
		System.out.println("MobileSignIn");
		
	}
	@AfterTest
	public void mobilelogin() {
		
		System.out.println("MobileLogin");
	}
	@Test
	public void Apilogin() {
		
		System.out.println("Apilogin");
	}
	
	@BeforeTest
	public void restApilogin() {
		
		System.out.println("restApilogin");
	}
	
	@Test(groups= {"smoke"})
	public void demo() {
		
		System.out.println("smokedemo");
	}
	
	@BeforeSuite
	public void CarLoan() {
		
		System.out.println("restApilogin");
	}
	
	@AfterSuite
	public void Homeloan() {
		
		System.out.println("demo");
	}
	
}
