package saif.alam.com;

import library.ExcelWriteDataConfig;



public class WriteDataOnExcel {

	public static void main(String[] args) throws Exception
	{
		//this is writing from config
		ExcelWriteDataConfig excelWrite = new ExcelWriteDataConfig("D:\\Study\\Excel Data\\TestData.xlsx");
		String msg=excelWrite.setDataOnSheet(0, 2, 3);
        System.out.println(msg);		
	}

}
