package cs1.sorting;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
 
    @SuppressWarnings("unused")
	public static void main(String args[]) 
    { 
        //Before you start develop a plan to work on merger sort incrementally
    	// What will you do first
    	// How will you check it?
    	
    	Integer numbers[] = {12, 11, 13, 5, 6, 7, 37, 2, 86, 34, 15, 24, 28}; 
  
    	ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(numbers));
         
        
        System.out.println("Given ArrayList"); 
        list.forEach(num -> System.out.print(num + " "));
        System.out.println(); 
       
        MergeSort.<Integer>sort(list); 
  
        System.out.println("Sorted"); 
        list.forEach(num -> System.out.print(num + " "));
        System.out.println(); 
              
      
        
        // another way to create a Comparator 
        Comparator<Integer> cmp = Comparator.comparing(Integer::intValue).reversed();
        MergeSort.<Integer>sort(list, cmp); 
        
        System.out.println("Sorted Reverse"); 
        list.forEach(num -> System.out.print(num + " "));
        System.out.println(); 
        
        //Part 1 
        // Complete and test your mergesort
        // Unit Tests have been provided...
        
        
        
     //Part 2 use you merge sort to do the following
     //
     //
        
     // 1 Read in the List of Players
        ArrayList<Player> players = loadFile("BaseBallStats.txt");
        // look at the load file method it has a library call to read all line of a file! 
     // 2 Sort List using MergeSort Class (By Team use Lambda)
     // 3 Print using lambda
     // 4 Save the sorted List back to a file
    	
    	
        // 1 Read in the List of Players
        ArrayList<Player> players2 = loadFile("BaseBallStats.txt");
        // 2 Sort List using MergeSort Class (By batting Average use Lambda)
        // 3 Print using lambda
        // 4 Save the sorted List back to a file
        
    } 
   
    public static ArrayList<Player> loadFile(String fileName)
   	{
    	List<String> lines = null;
    	try {
			
			lines = Files.readAllLines(Paths.get(fileName),Charset.defaultCharset());
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Error reading file '"  + fileName + "'");
			return new ArrayList<Player>();
		}  
    	ArrayList<Player> players = new ArrayList<Player>();
    	for (String line : lines)
    	{
                   String fields[] = line.split(",");
                   if(fields.length == 6)
                   {                   	  
                	   players.add(new Player(fields[0],fields[1],fields[2], Integer.parseInt(fields[3]),Integer.parseInt(fields[4]),Integer.parseInt(fields[5])));
                   }
                   else
                   {                    
                	   players.add(new Player(fields[0],fields[1],fields[2], Integer.parseInt(fields[3]),Integer.parseInt(fields[4]),Integer.parseInt(fields[5]), fields[6]));
                   }                   
    	}   
    	return players;
   	}
  
}
