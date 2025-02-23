package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day2 {

	@Test(dataProvider="getdata")
	public void mobilesignin(String username,String password) {
		
		System.out.println("mobilesignin");
		System.out.println(username);
		System.out.println(password);
	}
	//annotations
	@AfterClass
	public void Apisignin() {
		
		System.out.println("Apisignin");
	}
	
	@Test
	public void restApisignin() {
		
		System.out.println("restApisignin");
	}
	
	@Test(enabled = false)
	public void demosignin() {
		
		System.out.println("demosignin");
	}
	
	@BeforeClass
	public void websignin() {
		
		System.out.println("websignin");
	}
	@DataProvider
	public Object[][] getdata() {
		
		Object[][]data = new Object[3][2];
		
		data[0][0] = "firstuser";
		data[0][1] = "firstpassword";

		data[1][0] = "seconduser";
		data[1][1] = "secondpassword";
		
		data[2][0] = "thirduser";
		data[2][1] = "thirdpassword";

		return data;
		
		

		
		
		
		
		
	}
}
