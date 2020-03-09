package com.wordpress.testcases;

import java.io.File;
import java.io.FileInputStream;
import library.DriverConnection;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPageFactory;

public class LoginWordPressFactoryTest {

	@Test
	public void validLogin() throws Exception {

		WebDriver driver = DriverConnection.driverConnection(
				"http://demosite.center/wordpress/wp-login.php", "firefox");

		LoginPageFactory login = PageFactory.initElements(driver,
				LoginPageFactory.class);
		File exceldata = new File("D:\\Study\\Excel Data\\TestData.xlsx");

		FileInputStream fis = new FileInputStream(exceldata);

		// it will load entire sheet
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// 0-indicate the workbook sheet 1
		// 1-indicate the workbook sheet 2 and so on
		XSSFSheet sheet1 = wb.getSheetAt(0);

		// getRow(0)and getCell(0)-it will selecting first and first column of
		// sheet
		String cellvalue1 = sheet1.getRow(0).getCell(0).getStringCellValue();
		String cellvalue2 = sheet1.getRow(0).getCell(1).getStringCellValue();
		login.username(cellvalue1);
		login.password(cellvalue2);

		System.out.println("Username" + "--" + cellvalue1 + "-" + "Password"
				+ "--" + cellvalue2);

		driver.quit();
	}

}
