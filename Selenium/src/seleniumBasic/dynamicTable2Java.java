package seleniumBasic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class dynamicTable2Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// check the percentage whic is bigger
		ArrayList<String> listString = new ArrayList<String>();
		listString.add("100%");
		listString.add("50%");
		listString.add("40%");
		ArrayList<Integer> listInt = new ArrayList<Integer>();
		for(String listIt : listString) {
			String ab = listIt.replace("%", "");
			listInt.add(Integer.parseInt(ab));
		}
		for(int listIt2 : listInt) {
			System.out.println(listIt2);
		}
		int min = Collections.min(listInt);
		System.out.println(min);
		

	}

}
