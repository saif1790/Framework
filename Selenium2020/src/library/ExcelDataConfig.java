package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {

	XSSFWorkbook wb;
	String sheetName;
	XSSFSheet sheet;
	File exceldata;
	public ExcelDataConfig(String excelPath)
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
	
	public String getData(int sheetNumber,int rowNum,int colNum) throws Exception
	{   
		
		sheetName = wb.getSheetName(sheetNumber);
        System.out.println(sheetName);
        
		sheet = wb.getSheetAt(sheetNumber);
		String cellvalue1 = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		FileOutputStream fos = new FileOutputStream(exceldata);
        wb.write(fos);
		return cellvalue1;
	}

}
