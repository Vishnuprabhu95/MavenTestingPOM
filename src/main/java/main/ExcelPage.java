package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPage {

	private String loc;
	
	public String ExcelData() {
	try {
		
		File source = new  File("C:\\Users\\VISHNU\\eclipse-workspace\\Bala\\src\\Util\\Book1.xlsx");
		FileInputStream Excel = new FileInputStream(source);
		XSSFWorkbook wb = new XSSFWorkbook(Excel);
		XSSFSheet sheetnumber = wb.getSheetAt(0);
		loc = sheetnumber.getRow(1).getCell(0).getStringCellValue();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return loc;
	}
}
