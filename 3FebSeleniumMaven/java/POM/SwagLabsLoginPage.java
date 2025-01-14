package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage
{
	//step1: declaration of variable
	@FindBy(xpath="//input[@id='user-name']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	@FindBy(xpath="//input[@name='login-button']") private WebElement loginBtn;
	//step2: initialization
	public SwagLabsLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this); 
	//className.methodname(webdriverObject,thisKeyword);
	}
	//step3: usage
	public void enterUN() 
	{
	UN.sendKeys("standard_user");
	}
	public void enterPWD() 
	{
	PWD.sendKeys("secret_sauce");
	}
	public void clickOnLoginBtn() 
	{
	loginBtn.click();
	}

}
