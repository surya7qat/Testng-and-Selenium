package Workout;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class dataDriven {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Surya\\Test case-4 (GUI_UI) (20.11.2023).xls");
		Workbook wk = Workbook.getWorkbook(file);
		Sheet sh =wk.getSheet(0);
		int column = sh.getColumns();
		int row = sh.getRows();
		System.out.println(column+" "+row);
		for(int i =0;i<=row-1;i++) {
			System.out.println(sh.getCell(11, i).getContents());
		}
	
		

	}

}
