package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fin=new FileInputStream(".//Data//Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fin);
		int count = wb.getSheet("Sheet1").getLastRowNum();
		for (int i=1;i<=count;i++)
		{
			String un = wb.getSheet("Sheet1").getRow(i).getCell(3).getStringCellValue();
			
			String pw = wb.getSheet("Sheet1").getRow(0).getCell(i).getStringCellValue();
			System.out.println(un+ " " + pw);
		}
		
	}

}
