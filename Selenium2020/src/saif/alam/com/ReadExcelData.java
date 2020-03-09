package saif.alam.com;

import library.ExcelDataConfig;


public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		 
        ExcelDataConfig edc = new ExcelDataConfig("D:\\Study\\Excel Data\\TestData.xlsx");
        
        String value =edc.getData(0, 0, 0);
        String value1 =edc.getData(0, 0, 1);
        
		System.out.println("first cell value" + " :  " + value);
		System.out.println("second cell value" + " :  " + value1);
		
	}

}
