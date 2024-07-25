package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7__AssertClass4_assertFalse 
{
	@Test
	public void TC4() 
	{
	boolean actResult=true; 
	Assert.assertFalse(actResult, "Failed: act result if true - ");
	}
}
