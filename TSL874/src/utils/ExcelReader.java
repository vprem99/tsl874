package utils;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	Workbook book;

	public ExcelReader(String locationWithFileName) {
		try {
			FileInputStream ip = new FileInputStream(locationWithFileName);
			// Reading File as Workbook
			if (locationWithFileName.endsWith(".xlsx")) {
				book = new XSSFWorkbook(ip);
			} else if (locationWithFileName.endsWith(".xls")) {
				book = new HSSFWorkbook(ip);
			} else
				System.out.println("Invalid File Format");
			
		} catch (Exception E) {
			System.out.println("Error with File Reading " + E.getMessage());
		}
	}

	public String getCellData(String sheetName, int row, int col) {
		String data = book.getSheet(sheetName).getRow(row).getCell(col).toString();
		return data;
	}

	public int getRowNum(String sheetName) {
		int row=book.getSheet(sheetName).getLastRowNum();
		return row+1;
	}
}