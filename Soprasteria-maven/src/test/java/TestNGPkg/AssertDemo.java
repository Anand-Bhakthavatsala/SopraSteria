package TestNGPkg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	
	@Test
	public void compare()
	{
		/*
		 * String name="Soprasteria"; Assert.assertEquals(name, "Soprasteria");
		 * System.out.println("Comparison is done"); Assert.assertFalse(true);//output->
		 * true Assert.assertTrue(4>3);//true
		 */		
		 SoftAssert softAssertion = new SoftAssert();
		 softAssertion.assertEquals("Test", "test");
		 softAssertion.assertAll();
		 System.out.println("Testing soft assert");
	}

}
