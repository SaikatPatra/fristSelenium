package assertionVerify;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void test1()
	{
		System.out.println("step1");
		System.out.println("step2");
		Assert.assertEquals("a","b");
		System.out.println("step3");
		Assert.assertEquals("x","y");
		System.out.println("step4");
	}
	@Test
	public void test2()
	{
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		System.out.println("step4");	
	}

}
