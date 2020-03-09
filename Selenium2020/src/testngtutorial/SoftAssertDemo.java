package testngtutorial;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo
{
	
	@Test
	public void testSoft()
	{
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(12, 14);
		System.out.println("This line will be execute becoz of it is soft assertion");
		assertion.assertAll();
	}
	
	
	@Test
	public void testHard()
	{
		Assert.assertEquals(12, 14);
		System.out.println("This line will be not executed becoz of it is hard assertion");
	}

}
