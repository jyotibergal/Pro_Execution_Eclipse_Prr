package Excel;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Example10_getNumericData
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
	

	//navigate to excel path 
	  FileInputStream file=new FileInputStream("C:\\Users\\Shankar Padalkar\\Desktop\\3rdFebSelenium\\SeleniumSoftware\\3rdfebEvening.xlsx"); 
	   
	  double value =WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue(); 
	  System.out.println(value);
}
}
