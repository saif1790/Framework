package saif.alam.com;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import library.ExcelWriteDataConfig;

public class WriteDataOnExcel {

	public static void main(String[] args) throws Exception
	{
		Logger  logger = Logger.getLogger("WriteDataOnExcel");
		PropertyConfigurator.configure("./PropertiesFile/log4j.properties");
		//this is writing from config  
		ExcelWriteDataConfig excelWrite = new ExcelWriteDataConfig("D:\\Study\\Excel Data\\TestData.xlsx");
		logger.info("Load the excel file");
		String msg=excelWrite.setDataOnSheet(0, 2, 3);
		logger.info("sheet will be update with given above info");
		logger.info("Sheet data"+msg);		
	}

}
