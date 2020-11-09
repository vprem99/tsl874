package day10;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.Base;
import utils.ExcelReader;
import utils.KeyWords;

public class ExcelKeyRunner extends Base {
	@Test(dataProvider = "dp")
	public void f(String excelKey, String locator, String data) {
		KeyWords key = new KeyWords(driver);
		if (excelKey.equalsIgnoreCase("getUrl"))
			key.getURL(data);
		else if (excelKey.equalsIgnoreCase("click"))
			key.click(locator);
		else if (excelKey.equalsIgnoreCase("type"))
			key.type(locator, data);
		else if (excelKey.equalsIgnoreCase("getSnap"))
			key.getSnap(data);
		else if (excelKey.equalsIgnoreCase("selectFromDropDown"))
			key.selectFromDropDown(locator, data);
		else
			System.out.println("Invalid Key");
	}

	@DataProvider
	public Object[][] dp() {
		ExcelReader ex = new ExcelReader("C:\\Users\\Bhajan\\Desktop\\SelJars\\Book1.xls");
		int rows = ex.getRowNum(prop.getProperty("sheetName")) - 1; // -1 is for ignoring header row
		// row col
		Object data[][] = new Object[rows][3];

		for (int i = 1; i <= data.length; i++) {
			data[i - 1][0] = ex.getCellData(prop.getProperty("sheetName"), i, 0);
			data[i - 1][1] = ex.getCellData(prop.getProperty("sheetName"), i, 1);
			data[i - 1][2] = ex.getCellData(prop.getProperty("sheetName"), i, 2);
		}
		return data;
	}
}