package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteDataConfig {

	XSSFWorkbook wb;
	String sheetName;
	XSSFSheet sheet;
	File exceldata;
	public ExcelWriteDataConfig(String excelPath)
	{
		try {
			  exceldata = new File(excelPath);

			FileInputStream fis = new FileInputStream(exceldata);

			// it will load entire sheet
			 wb = new XSSFWorkbook(fis);
		    }
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public String setDataOnSheet(int sheetNumber,int rowNum,int colNum) throws Exception
	{   
		
		sheetName = wb.getSheetName(sheetNumber);
        System.out.println(sheetName);
        
		sheet = wb.getSheetAt(sheetNumber);
		sheet.getRow(rowNum).createCell(colNum).setCellValue("gfhfhm");
		FileOutputStream fos = new FileOutputStream(exceldata);
		wb.write(fos);
		wb.close();
		return "Data Updated in sheet";
	}

}
