package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parent {
	
	@Test
	public void testrun() {
		
		System.out.println("I am here");
		System.out.println("rahulshettyacademy");
		System.out.println("selenium");
		
		System.out.println("selenium");
		System.out.println("Rest API testing");
		System.out.println("Appium testing");
		
		System.out.println("Web testing");
		System.out.println("Mobile auto");
		System.out.println("Rest assured");
		
		
	}
	@BeforeMethod
	public void beforerun() {
		
		System.out.println("run me first");
	}
	@Test
	public void testrun2() {
		
		System.out.println("I am prajakta");
		System.out.println("rahulshettyacademy");
		System.out.println("selenium");
		
		
	}
	@Test
	public void testrun3() {
		
		System.out.println("I am doing course");
		System.out.println("rahulshettyacademy");
		System.out.println("selenium");
		
		
	}
}
