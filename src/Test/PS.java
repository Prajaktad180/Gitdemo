package Test;

import org.testng.annotations.Test;

public class PS extends PS1 {

	@Test
	public void testrun() {
		
		int a=3;
		System.out.println("Hello");
		
		PS1 ps1 = new PS1(3);
		System.out.println(ps1.increment());
		System.out.println(ps1.decrement());
		
		
		
	}
}
