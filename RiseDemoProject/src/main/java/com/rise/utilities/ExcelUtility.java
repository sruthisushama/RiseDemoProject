package com.rise.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
		FileInputStream file;
		XSSFWorkbook workbook;
		XSSFSheet sheet;
		Row row;
		Cell cell;
		String data;
		

		public String readData(int rowNo,int cellNo) {

			try {
				file = new FileInputStream(
						new File(System.getProperty("user.dir") + "//src//main//resources//ExcelFile//login.xlsx"));

				// Create Workbook instance holding reference to .xlsx file
				workbook = new XSSFWorkbook(file);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// Get first/desired sheet from the workbook
			sheet = workbook.getSheetAt(0);

			row = sheet.getRow(rowNo);

			cell = row.getCell(cellNo);
			data = cell.getStringCellValue();

			return data;
		}
	}



