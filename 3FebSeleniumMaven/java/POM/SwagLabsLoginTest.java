package POM;

	import java.time.Duration;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	//Test class or main class
	public class SwagLabsLoginTest 
	{
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	SwagLabsLoginPage login =new SwagLabsLoginPage(driver);
	login.enterUN();
	login.enterPWD();
	Thread.sleep(2000);
	login.clickOnLoginBtn();
	Thread.sleep(2000);
	SwagLabsHomePage home=new SwagLabsHomePage(driver);
	home.veryLogo();
	home.clickOnOpenBtn();
	Thread.sleep(2000);
	SwagLabsOpenMenuPage openMenu=new SwagLabsOpenMenuPage(driver);
	openMenu.clickOnLogoutBtn();
	Thread.sleep(2000);
	driver.quit();
	}

}
