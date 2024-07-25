package POM;

//pom class 2
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	public class SwagLabsHomePage
	{
	@FindBy(xpath = "//div[text()='Swag Labs']") private WebElement 
	logoText;
	@FindBy(xpath = "//div[@class='bm-burger-button']") private
	WebElement openMenuBtn;
	public SwagLabsHomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public void veryLogo() 
	{
	String actLogoText = logoText.getText();
	String expLogoText = "Swag Labs";
	if(actLogoText.equals(expLogoText))
	{
	System.out.println("TC Pass");
	}
	else
	{
	System.out.println("TC Fail");
	}
	}
	public void clickOnOpenBtn() 
	{
	openMenuBtn.click();
	}
	}

