package cs1.sorting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MergeSortTest {

	
	
	@Test
	void singleItem() {
		Integer array[] = {12}; 
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		MergeSort.<Integer>sort(list);    		
		assertAll(()-> assertEquals(12 ,list.get(0).intValue())  );   
	}
	
	@Test
	void twoItems() {
		Integer array[] = {25, 12}; 
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		MergeSort.<Integer>sort(list);    		
		
		assertAll(()-> assertEquals(12 ,list.get(0).intValue()),
				  ()-> assertEquals(25 ,list.get(1).intValue()));
	}

	@Test
	void tenItems() {
		// even number of items
		Integer array[] = {99, 25, 12 , 33, 13, 66, 19, 78, 85, 5}; 
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		MergeSort.<Integer>sort(list);    		
		
		assertAll(()-> assertEquals(5 ,list.get(0).intValue()),
				  ()-> assertEquals(12 ,list.get(1).intValue()),
				  ()-> assertEquals(13 ,list.get(2).intValue()),
				  ()-> assertEquals(19 ,list.get(3).intValue()),
				  ()-> assertEquals(25 ,list.get(4).intValue()),
				  ()-> assertEquals(33 ,list.get(5).intValue()),
				  ()-> assertEquals(66 ,list.get(6).intValue()),
				  ()-> assertEquals(78 ,list.get(7).intValue()),
				  ()-> assertEquals(85 ,list.get(8).intValue()),
				  ()-> assertEquals(99 ,list.get(9).intValue())	 );
	}
	
	
	@Test
	void elevenItems() {
		// odd number of items
		Integer array[] = {99, 25, 12 , 33, 13, 66, 19, 78, 85, 5, 105}; 
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		MergeSort.<Integer>sort(list);    		 
				
		assertAll(()-> assertEquals(5 ,list.get(0).intValue()),
				  ()-> assertEquals(12 ,list.get(1).intValue()),
				  ()-> assertEquals(13 ,list.get(2).intValue()),
				  ()-> assertEquals(19 ,list.get(3).intValue()),
				  ()-> assertEquals(25 ,list.get(4).intValue()),
				  ()-> assertEquals(33 ,list.get(5).intValue()),
				  ()-> assertEquals(66 ,list.get(6).intValue()),
				  ()-> assertEquals(78 ,list.get(7).intValue()),
				  ()-> assertEquals(85 ,list.get(8).intValue()),
				  ()-> assertEquals(99 ,list.get(9).intValue()),
				  ()-> assertEquals(105 ,list.get(10).intValue()));
	}
	
	
	@Test
	void reverseOrder() {
	
		Integer array[] = {105, 99, 85 , 78, 66, 33, 25, 19, 13, 12, 5}; 
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		MergeSort.<Integer>sort(list);    		
				
		assertAll(()-> assertEquals(5 ,list.get(0).intValue()),
				  ()-> assertEquals(12 ,list.get(1).intValue()),
				  ()-> assertEquals(13 ,list.get(2).intValue()),
				  ()-> assertEquals(19 ,list.get(3).intValue()),
				  ()-> assertEquals(25 ,list.get(4).intValue()),
				  ()-> assertEquals(33 ,list.get(5).intValue()),
				  ()-> assertEquals(66 ,list.get(6).intValue()),
				  ()-> assertEquals(78 ,list.get(7).intValue()),
				  ()-> assertEquals(85 ,list.get(8).intValue()),
				  ()-> assertEquals(99 ,list.get(9).intValue()),
				  ()-> assertEquals(105 ,list.get(10).intValue()));
	}
	
	@Test
	void inOrder() {
		
		Integer array[] = {5, 12, 13 , 19, 25, 33, 66, 78, 85, 99, 105}; 
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		MergeSort.<Integer>sort(list);    		
		assertAll(()-> assertEquals(5 ,list.get(0).intValue()),
				  ()-> assertEquals(12 ,list.get(1).intValue()),
				  ()-> assertEquals(13 ,list.get(2).intValue()),
				  ()-> assertEquals(19 ,list.get(3).intValue()),
				  ()-> assertEquals(25 ,list.get(4).intValue()),
				  ()-> assertEquals(33 ,list.get(5).intValue()),
				  ()-> assertEquals(66 ,list.get(6).intValue()),
				  ()-> assertEquals(78 ,list.get(7).intValue()),
				  ()-> assertEquals(85 ,list.get(8).intValue()),
				  ()-> assertEquals(99 ,list.get(9).intValue()),
				  ()-> assertEquals(105 ,list.get(10).intValue()));
	}
}
