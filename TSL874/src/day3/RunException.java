package day3;

import java.io.FileInputStream;

public class RunException {

	public static void main(String[] args) throws Exception{

		ArithmaticOperation ap = new ArithmaticOperation();
		ap.add(5, 6);

		//ap.division(5, 6);
		
		try {
			ap.division(6, 0);
		} catch (Exception e) {
			System.out.println("Problem during Division " + e.getMessage());
		}

		ap.multiplication(9, 5);
		ap.subtract(10, 1);
		
		FileInputStream ip=new FileInputStream("");

	}
}