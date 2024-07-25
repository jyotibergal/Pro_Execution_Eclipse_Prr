package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1
{
@Test
public void OpenChromeBrowser() throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	
	Thread.sleep(2000);
	driver.close();
}
}
