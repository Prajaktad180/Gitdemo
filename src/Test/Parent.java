package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parent {
	
	@Test
	public void testrun() {
		
		System.out.println("I am here");
		System.out.println("rahulshettyacademy");
		System.out.println("selenium");
		
	}
	@BeforeMethod
	public void beforerun() {
		
		System.out.println("run me first");
	}
}
