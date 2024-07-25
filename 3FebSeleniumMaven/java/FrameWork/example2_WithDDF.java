package FrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class example2_WithDDF 
{
    public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
    {
FileInputStream file=new FileInputStream("D:\\3rdFeb\\Selenium Softwares\\3rdFebevening.xlsx");
Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
WebDriver driver=new ChromeDriver();
driver.get("https://www.saucedemo.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.manage().window().maximize();
//enter UN
String Username = sh.getRow(0).getCell(0).getStringCellValue();
driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(Username);
Thread.sleep(2000);
//enter PWD
String password = sh.getRow(0).getCell(1).getStringCellValue();
driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
Thread.sleep(2000);
//click on login btn
driver.findElement(By.xpath("//input[@name='login-button']")).click();
Thread.sleep(3000);
String actLogoText = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
String expLogoText = sh.getRow(0).getCell(2).getStringCellValue();
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
