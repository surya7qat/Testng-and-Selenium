package testNG1;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Jxl {
	String[][] data = null;
		 
		@DataProvider(name = "data")
		public String[][] data() throws BiffException, IOException {
			data = jxl();
			return data;
		}
		public String[][] jxl() throws BiffException, IOException {
			FileInputStream input = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\jxl.xlt");
			Workbook book = Workbook.getWorkbook(input);
			Sheet sheet = book.getSheet(0);
			int row =sheet.getRows();
			int column = sheet.getColumns();
			String[][] data1= new String[row-1][column];
			for(int i =1;i<row;i++) {
				for(int j =0;j<column;j++) {
					data1[i-1][j] =sheet.getCell(j, i).getContents();
				}
			}
			return data1;
		}
		
		
		@Test(dataProvider = "data")
		public static void print(String name,String town) {
			System.out.println("name "+name+" "+"town "+town);
		}
}
