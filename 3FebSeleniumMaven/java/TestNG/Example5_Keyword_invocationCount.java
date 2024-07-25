package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_Keyword_invocationCount 
{
	@Test(invocationCount = 10)
	public void TC1() 
	{
	Reporter.log("--running TC1--", true);
	}
}
