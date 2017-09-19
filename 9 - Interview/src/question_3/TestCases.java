//TestCases.java file
package question_3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class TestCases {

	@Test
	public void correctListsAndBuckets() {
		Sep s = new Sep();
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3); arr.add(1); arr.add(9); arr.add(4);	
		arr.add(5); arr.add(6); arr.add(8);
		
		int k = 4;
		
		assertEquals(true,s.separate(arr, k));
	}
	
	@Test
	public void zeroBuckets() {
		Sep s = new Sep();
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3); arr.add(1); arr.add(9); arr.add(4);	
		arr.add(5); arr.add(6); arr.add(8);
		
		int k = 0;
		
		assertEquals(false,s.separate(arr, k));
	}
	
	@Test
	public void negativeNoOfBuckets() {
		Sep s = new Sep();
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3); arr.add(1); arr.add(9); arr.add(4);	
		arr.add(5); arr.add(6); arr.add(8);
		
		int k = -1;
		
		assertEquals(false,s.separate(arr, k));
	}
	
	@Test
	public void incorrectList() {
		Sep s = new Sep();
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3); arr.add(1); arr.add(9); arr.add(4);	
		arr.add(5); arr.add(6); arr.add(8); arr.add(2);
		
		int k = -1;
		
		assertEquals(false,s.separate(arr, k));
	}
	
	@Test
	public void incorrectNoOfBuckets() {
		Sep s = new Sep();
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3); arr.add(1); arr.add(9); arr.add(4);	
		arr.add(5); arr.add(6); arr.add(8);
		
		int k = 5;
		
		assertEquals(false,s.separate(arr, k));
	}
	
	@Test
	public void emptyList() {
		Sep s = new Sep();
		
		List<Integer> arr = new ArrayList<Integer>();
		
		int k = 5;
		
		assertEquals(false,s.separate(arr, k));
	}
	
	@Test
	public void emptyListZeroBuckets() {
		Sep s = new Sep();
		
		List<Integer> arr = new ArrayList<Integer>();
		
		int k = 0;
		
		assertEquals(false,s.separate(arr, k));
	}
	
	@Test
	public void sameNoOfBucketsWithSizeOfArray() {
		Sep s = new Sep();
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3); arr.add(3); arr.add(3); arr.add(3);	
		int k = 4;
		
		assertEquals(true,s.separate(arr, k));
	}
}