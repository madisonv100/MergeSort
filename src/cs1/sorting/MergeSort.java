package cs1.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeSort {
	
	
	 
	/* Merges two lists of items in order.
	 * First list is items from start to middle
     * Second list is list from middle+1 to end
	 * The order is of the merged list is based on the comparator 
	 * items list that contain the sub lists to merge
	 * @param start - beginning of the first sublist
	 * @param middle - end of the first sublist inclusive
	 * @param end - beginning of the second sublist inclusive
	 */
	
    public static <Item> void merge(ArrayList<Item> items, int start, int middle, int end ,  Comparator<Item> comparator) 
    { 
    	ArrayList<Item> temp = new ArrayList<>();
    	
    	int leftOne = start;
        int rightOne = middle;
        int leftTwo = middle+1;
        int rightTwo = end;
        
        for (int i = leftOne; i < rightOne; i ++)
        {
        	
        }
    	
    	for (int k = leftTwo; k < rightTwo; k++)
    	{
    		
    	}
    	
    	

    } 

    /* Sorts a sublist based on the comparator using a recursive merge sort.
     * First list is items from start to middle
     * Second list is list from middle+1 to end
	 * The order is of the merged list is based on the comparator 
	 * items list that contain the sub lists to merge
	 * @param items list that is to be sorted
	 * @param left - beginning of the first sublist inclusive
	 * @param right - end of the sublist inclusive
	 * @param comparator - method that determines order
	 */
    public static <Item> void sort(ArrayList<Item> items, int left, int right ,  Comparator<Item> comparator) 
    { 
      	// STEP 2 of Coding
        // add the code to recursively sort the method
     
    	
    	if (left != right )
    	{
    		sort(items , left, right/2, comparator);
    		sort(items, (right/2)+1, right, comparator);
    		merge(items, left, (right/2)+1, right, comparator);
    		
    		
    	}  	
    	    	
    } 
    
    
    
    // Initial call to sort list 
    // uses natural ordering (built in compareTo)
    public static <Item extends Comparable<Item>> void sort(ArrayList<Item> items) 
    { 
    	//Free method completed for you!
    	// Think about what this does!
    	MergeSort.<Item>sort(items  ,  (Item item1 , Item item2 )-> {return  item1.compareTo(item2);} );
    	
    } 
    
        
    // Initial call that starts the recursive sort method 
    public static <Item> void sort(ArrayList<Item> items,  Comparator<Item> comparator) 
    { 
        // STEP 1 of Coding
        //  Create the correct method call to start sort
     
    	
    } 
}
