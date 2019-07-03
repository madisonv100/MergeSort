package cs1.sorting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

class MergeSortMergeTest {

	
	Comparator<Integer> cmp = Comparator.comparing(Integer::intValue);
	
	
	@Test
	void twoItemsInOrder() {
		Integer array[] = {12, 25}; 
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		MergeSort.<Integer>merge(list,0, 0, 1,cmp);    		
		
		assertAll(()-> assertEquals(12 ,list.get(0).intValue()),
				  ()-> assertEquals(25 ,list.get(1).intValue()));
	}

	@Test
	void twoItemsReversed() {
		Integer array[] = {25, 12}; 
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		MergeSort.<Integer>merge(list,0, 0, 1,cmp);    		
		
		assertAll(()-> assertEquals(12 ,list.get(0).intValue()),
				  ()-> assertEquals(25 ,list.get(1).intValue()));
	}
	
	@Test
	void twoItemsReversedMiddleofList() {
		Integer array[] = {1,1,1,1,25,12,1,1,1,1}; 
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		MergeSort.<Integer>merge(list,4, 4, 5,cmp);    		
		
		assertAll(()-> assertEquals(12 ,list.get(4).intValue()),
				  ()-> assertEquals(25 ,list.get(5).intValue()));
	}
	
	@Test
	void twoItemsinOrderMiddleofList() {
		Integer array[] = {1,1,1,1,12,25,1,1,1,1}; 
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		MergeSort.<Integer>merge(list,4, 4, 5,cmp);    		
		
		assertAll(()-> assertEquals(12 ,list.get(4).intValue()),
				  ()-> assertEquals(25 ,list.get(5).intValue()));
	}
	
	@Test
	void tenItemsMix() {
		
		Integer array[] = {5, 10, 15 , 20 , 25, 4, 11, 16, 19, 26}; 
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		MergeSort.<Integer>merge(list,0, 4, 9,cmp);   		
		
		assertAll(()-> assertEquals(4 ,list.get(0).intValue()),
				  ()-> assertEquals(5 ,list.get(1).intValue()),
				  ()-> assertEquals(10 ,list.get(2).intValue()),
				  ()-> assertEquals(11 ,list.get(3).intValue()),
				  ()-> assertEquals(15 ,list.get(4).intValue()),
				  ()-> assertEquals(16 ,list.get(5).intValue()),
				  ()-> assertEquals(19 ,list.get(6).intValue()),
				  ()-> assertEquals(20 ,list.get(7).intValue()),
				  ()-> assertEquals(25 ,list.get(8).intValue()),
				  ()-> assertEquals(26 ,list.get(9).intValue())	 );
	}
	
	
	@Test
	void elevenItemsMix() {
		
		Integer array[] = {5, 10, 15 , 20 , 25, 27, 11, 16, 19, 26 , 30 }; 
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		MergeSort.<Integer>merge(list,0, 5, 10,cmp);   		
		
		assertAll(()-> assertEquals(5 ,list.get(0).intValue()),
				  ()-> assertEquals(10 ,list.get(1).intValue()),
				  ()-> assertEquals(11 ,list.get(2).intValue()),
				  ()-> assertEquals(15 ,list.get(3).intValue()),
				  ()-> assertEquals(16 ,list.get(4).intValue()),
				  ()-> assertEquals(19 ,list.get(5).intValue()),
				  ()-> assertEquals(20 ,list.get(6).intValue()),
				  ()-> assertEquals(25 ,list.get(7).intValue()),
				  ()-> assertEquals(26 ,list.get(8).intValue()),
				  ()-> assertEquals(27 ,list.get(9).intValue())	,
				  ()-> assertEquals(30 ,list.get(10).intValue()));
	}
	
	@Test
	void allLeftLess() {
		
		Integer array[] = {5, 10, 15 , 20 , 25, 27, 30, 35, 40, 45 , 50 }; 
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		MergeSort.<Integer>merge(list,0, 5, 10,cmp);   		
		
		assertAll(()-> assertEquals(5 ,list.get(0).intValue()),
				  ()-> assertEquals(10 ,list.get(1).intValue()),
				  ()-> assertEquals(15 ,list.get(2).intValue()),
				  ()-> assertEquals(20 ,list.get(3).intValue()),
				  ()-> assertEquals(25 ,list.get(4).intValue()),
				  ()-> assertEquals(27 ,list.get(5).intValue()),
				  ()-> assertEquals(30 ,list.get(6).intValue()),
				  ()-> assertEquals(35 ,list.get(7).intValue()),
				  ()-> assertEquals(40 ,list.get(8).intValue()),
				  ()-> assertEquals(45 ,list.get(9).intValue())	,
				  ()-> assertEquals(50 ,list.get(10).intValue()));
	}
	
	@Test
	void allLeftGreater() {
		
		Integer array[] = {105, 110, 115 , 120 , 125, 127, 30, 35, 40, 45 , 50 }; 
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		MergeSort.<Integer>merge(list,0, 5, 10,cmp);   		
		
		assertAll(
				  ()-> assertEquals(30 ,list.get(0).intValue()),
				  ()-> assertEquals(35 ,list.get(1).intValue()),
				  ()-> assertEquals(40 ,list.get(2).intValue()),
				  ()-> assertEquals(45 ,list.get(3).intValue()),
				  ()-> assertEquals(50 ,list.get(4).intValue()),
				  ()-> assertEquals(105 ,list.get(5).intValue()),
				  ()-> assertEquals(110 ,list.get(6).intValue()),
				  ()-> assertEquals(115 ,list.get(7).intValue()),
				  ()-> assertEquals(120 ,list.get(8).intValue()),
				  ()-> assertEquals(125 ,list.get(9).intValue()),
				  ()-> assertEquals(127 ,list.get(10).intValue())
				
				
				);
	}
	
	@Test
	void lastRightGreater() {
		
		Integer array[] = {105, 110, 115 , 120 , 125, 127, 30, 35, 40, 45 , 250 }; 
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		MergeSort.<Integer>merge(list,0, 5, 10,cmp);   		
		
		assertAll(
				  ()-> assertEquals(30 ,list.get(0).intValue()),
				  ()-> assertEquals(35 ,list.get(1).intValue()),
				  ()-> assertEquals(40 ,list.get(2).intValue()),
				  ()-> assertEquals(45 ,list.get(3).intValue()),
				  ()-> assertEquals(105 ,list.get(4).intValue()),
				  ()-> assertEquals(110 ,list.get(5).intValue()),
				  ()-> assertEquals(115 ,list.get(6).intValue()),
				  ()-> assertEquals(120 ,list.get(7).intValue()),
				  ()-> assertEquals(125 ,list.get(8).intValue()),
				  ()-> assertEquals(127 ,list.get(9).intValue()),
				  ()-> assertEquals(250 ,list.get(10).intValue())
				
				
				);
	}
	
	@Test
	void lastLeftGreater() {
		
		Integer array[] = {105, 110, 115 , 120 , 125, 200, 130, 135, 140, 145 , 150 }; 
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		MergeSort.<Integer>merge(list,0, 5, 10,cmp);   		
		
		assertAll(
				 
				  ()-> assertEquals(105 ,list.get(0).intValue()),
				  ()-> assertEquals(110 ,list.get(1).intValue()),
				  ()-> assertEquals(115 ,list.get(2).intValue()),
				  ()-> assertEquals(120 ,list.get(3).intValue()),
				  ()-> assertEquals(125 ,list.get(4).intValue()),
				  ()-> assertEquals(130 ,list.get(5).intValue()),
				  ()-> assertEquals(135 ,list.get(6).intValue()),
				  ()-> assertEquals(140 ,list.get(7).intValue()),
				  ()-> assertEquals(145 ,list.get(8).intValue()),
				  ()-> assertEquals(150 ,list.get(9).intValue()),				  
				  ()-> assertEquals(200 ,list.get(10).intValue())
				
				
				);
	}
	
	
	
}
