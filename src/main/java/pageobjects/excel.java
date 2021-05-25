package pageobjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File file= new File("C:\\Users\\Developer\\Desktop\\Automation.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Cell data=wb.getSheet("Sheet1").getRow(0).getCell(1);
		System.out.println(data);
			}
		
		
		

}
	
