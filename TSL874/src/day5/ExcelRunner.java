package day5;

import utils.ExcelReader;

public class ExcelRunner {

	public static void main(String[] args) {
		ExcelReader ex=new ExcelReader("C:\\Users\\Bhajan\\Desktop\\SelJars\\data.xls");	
		System.out.println(ex.getCellData("Sheet1", 1, 1));
	}
}