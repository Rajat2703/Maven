package pageobjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class excel {
	public String username;
	public String connectionEmail;
	
	public excel Exceldata() throws EncryptedDocumentException, IOException
	{
		
		File file= new File("C:\\Users\\Developer\\Desktop\\Automation.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Cell data=wb.getSheet("Sheet1").getRow(1).getCell(0);
		org.apache.poi.ss.usermodel.Cell data1=wb.getSheet("Sheet1").getRow(1).getCell(2);
		//return data.toString();
		this.username = data.toString();
		this.connectionEmail = data1.toString();
		return this;
	}
 	
 
}
	
