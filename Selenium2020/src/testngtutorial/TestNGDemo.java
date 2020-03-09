package testngtutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@Test(priority=1,description="This will login app")
	public void loginApplication()
	{
		Assert.assertEquals(12, 13);
	}
	
	@Test(priority=2,description="This will selectItem")
	public void selectItem()
	{
		System.out.println("selectItem");
	}
	
	@Test(priority=3,description="checkbox")
	public void checkbox()
	{
		System.out.println("checkbox");
	}

}
