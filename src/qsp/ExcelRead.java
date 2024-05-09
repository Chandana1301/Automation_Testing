package qsp;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
FileInputStream fin=new FileInputStream(".//Data//Book1.xlsx");
Workbook wb = WorkbookFactory.create(fin);
String data = wb.getSheet("Sheet1").getRow(4).getCell(3).getStringCellValue();
System.out.println(data);


	}

}
