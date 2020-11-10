package com.lti.day11;

import java.io.FileReader;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class CSVExample {
	@Test
	public void f() throws Exception {
		CSVReader cr = new CSVReader(new FileReader("src/test/resources/data.csv"));

		List<String[]> allData = cr.readAll();
		for (int i = 0; i < allData.size(); i++) {  //  For Looping through rows

			for (int j = 0; j < allData.get(0).length; j++) { // For Looping through columns
				System.out.println(allData.get(i)[j]);
			}
		}
	}
}
