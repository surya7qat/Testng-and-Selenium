package testNG1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	String[][] data ={
		{"Ashwinth","Ayyampalayaam"},
		{"Ananth","Ayyampalayaam"},
		{"Dhileep","Sukkampalayam"},
		{"Nishanth","Semmipalaayam"}
	};
	 
	@DataProvider(name = "data")
	public String[][] data() {
		return data;
	}
	
	
	@Test(dataProvider = "data")
	public static void print(String name,String town) {
		System.out.println("name "+name+" "+"town "+town);
		
	}

}
