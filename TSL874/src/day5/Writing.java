package day5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing {

	public static void main(String[] args) throws Exception {
				// Reading File
				FileInputStream ip = new FileInputStream("C:\\Users\\Bhajan\\Desktop\\SelJars\\data.xlsx");
				// Reading File as Workbook
				XSSFWorkbook book = new XSSFWorkbook(ip);
				// Reading Sheet
				XSSFSheet sh = book.getSheet("Sheet1");	
				sh.getRow(1).getCell(1).setCellValue("LTI-TSL");
				sh.getRow(2).createCell(2).setCellValue("LTI-TSL");
				sh.createRow(5).createCell(2).setCellValue("LTI-TSL");

				book.write(new FileOutputStream("C:\\Users\\Bhajan\\Desktop\\SelJars\\data99.xlsx"));				
	}
}