package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

	@Parameters({"URL1","URL2"})
	@Test
	public void mobilesignin(String urlname,String gmail) {
		
		System.out.println("mobilesignin");
		System.out.println(urlname);
		System.out.println(gmail);
	}
	
	@AfterMethod
	public void Apisignin() {
		
		System.out.println("Apisignin");
	}
	
	@Test
	public void restApisignin() {
		
		System.out.println("restApisignin");
	}
	
	@Test(timeOut=4000)
	public void demosignin() {
		
		System.out.println("demosignin");
	}
	
	@BeforeMethod
	public void websignin() {
		
		System.out.println("websignin");
	}


}
