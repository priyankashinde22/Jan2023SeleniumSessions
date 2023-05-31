package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertationPractice {
	
	@Test
	public void sumTest() {
		int a=10;
		int b=20;
		int sum= a +b;
		Assert.assertEquals(sum, 30);
	}

	@Test
	public void subTest() {
		int a=20,b=30;
		int sub=a-b;
		Assert.assertEquals(sub, -10);
	}
	
	@Test
	public void multiTest() {
		double a= 1.0;
		int b=-20;
		double mult=a*b;
		Assert.assertEquals(mult, -20.0);
		
	}
	
	@Test
	public void divTest() {
		int a=10,b=5;
		int div=a/b;
		Assert.assertEquals(div, 2);
		
		
	}
	@Test
	public void charTest() {
		
		Assert.assertEquals('a', 'b');
	}

	
	
}
