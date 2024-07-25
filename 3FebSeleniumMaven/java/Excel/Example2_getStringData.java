package Excel;

import org.apache.poi.EncryptedDocumentException;
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
 
import org.apache.poi.EncryptedDocumentException; 
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.Workbook; 
import org.apache.poi.ss.usermodel.WorkbookFactory; 
public class Example2_getStringData 
{
	public static void main(String[] args) throws EncryptedDocumentException,
	IOException  
	 { 
	  //navigate to excel path 
	  FileInputStream file=new FileInputStream("C:\\Users\\Shankar Padalkar\\Desktop\\3rdFebSelenium\\SeleniumSoftware\\3rdfebEvening.xlsx"); 
	   
	  String data = 
	WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue(); 
	  System.out.println(data); 
}
}