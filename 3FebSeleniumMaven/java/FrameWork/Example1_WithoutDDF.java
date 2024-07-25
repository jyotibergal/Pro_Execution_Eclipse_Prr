package FrameWork;
	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver ;
    public class Example1_WithoutDDF 
    {
    	public static void main(String[] args) throws InterruptedException 
    	{
    		WebDriver driver=new ChromeDriver();
    		driver.get("https://www.saucedemo.com/");
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    		driver.manage().window().maximize();
    		//enter UN
    		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
    		Thread.sleep(2000);
    		//enter PWD
    		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
    		Thread.sleep(2000);
    		//click on login btn
    		driver.findElement(By.xpath("//input[@name='login-button']")).click();
    		Thread.sleep(3000);
    		String actLogoText = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
    		String expLogoText = "Swag Labs";
    		if(actLogoText.equals(expLogoText))
    		{
    		System.out.println("TC Pass");
    		}
    		else
    		{
    		System.out.println("TC Fail");
    		}
    		//click on menu btn
    		driver.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
    		Thread.sleep(2000);
    		//click on menu btn
    		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
    		Thread.sleep(2000);
    		driver.quit();
    		}
    		}

    	


