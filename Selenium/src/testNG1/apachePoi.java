package testNG1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class apachePoi {
	static List<String> name = new ArrayList<String>();
	static List<String> town = new ArrayList<String>();

	public static void getData() throws IOException {
		FileInputStream input = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\jxl.xlt");
		Workbook book = new HSSFWorkbook(input);
		Sheet sheet = book.getSheetAt(0);
		Iterator<Row> rowit = sheet.iterator();
		while(rowit.hasNext()) {
			Row row = rowit.next();
			Iterator<Cell> cellit =row.iterator();
			int i=2;
			while(cellit.hasNext()) {
				if(i%2==0) {
					name.add(cellit.next().getStringCellValue());}
				else {
					town.add(cellit.next().getStringCellValue());}
				i++;
			}
		}
	}
 public static void print() {
	 int size =name.size();
	 for(int i=0;i<size;i++) {
		 System.out.println("Name = "+name.get(i)+" town = "+town.get(i));
	 }
 }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		getData();
		print();
	}

}
