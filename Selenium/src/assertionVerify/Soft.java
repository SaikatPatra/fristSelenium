package assertionVerify;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft {
	@Test
	public void test1()
	{
		System.out.println("step1");
		System.out.println("step2");
	    SoftAssert s = new SoftAssert();
	    s.assertEquals("a","b");
		System.out.println("step3");
		  s.assertEquals("x","y");
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
