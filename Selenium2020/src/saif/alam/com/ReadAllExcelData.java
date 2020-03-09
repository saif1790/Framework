package saif.alam.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllExcelData {

	public static void main(String[] args) throws Exception {
		File exceldata = new File("D:\\Study\\Excel Data\\TestData.xlsx");

		FileInputStream fis = new FileInputStream(exceldata);

		// it will load entire sheet
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// 0-indicate the workbook sheet 1
		// 1-indicate the workbook sheet 2 and so on
		XSSFSheet sheet1 = wb.getSheetAt(0);
         
		int rowNumbers = sheet1.getLastRowNum();
		
		System.out.println("Row number"+rowNumbers);
		for(int i=0;i<rowNumbers;i++)
		{
			 
				String cellvalue1 = sheet1.getRow(i).getCell(0).getStringCellValue();
				String cellvalue2 = sheet1.getRow(i).getCell(1).getStringCellValue();
				System.out.println(cellvalue1);
				System.out.println(cellvalue2);
			
		}
		wb.close();
	}

}
