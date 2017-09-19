//test.java file
package question_3;

import java.util.ArrayList;
import java.util.List;

public class test {


	public static void main(String[] args){
		Sep s = new Sep();
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(1);
		arr.add(9);
		arr.add(4);	
		arr.add(5);	
		arr.add(6);
		arr.add(8);
		arr.add(2);
		int k = -1;
	
		if (s.separate(arr, k))
			System.out.println("TRUE.\n");
		else
			System.out.println("FALSE.\n");
	}

}
