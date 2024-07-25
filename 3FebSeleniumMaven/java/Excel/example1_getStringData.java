package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1_getStringData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		//navigate to excel path
		FileInputStream file=new FileInputStream("C:\\Users\\Shankar Padalkar\\Desktop\\3rdFebSelenium\\SeleniumSoftware\\3rdfebEvening.xlsx"); 
		
			 
		String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
	}
		
}
