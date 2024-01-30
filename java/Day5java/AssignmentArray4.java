package Day5java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AssignmentArray4 {

	public static void main(String[] args) {
	 String arr[]= {"coco","sunflower oil ","Apple" ,"samsung", "jio"};
	 Arrays.sort(arr);
 System.out.println("Elements of array sorted in ascending order: ");  
	 for(int i=0;i<arr.length;i++)
		{	
			System.out.println(" After Sorting : "+arr[i]);	
		}

		ArrayList<String> list = new ArrayList<String>();  
		list.add("Honda");  
		list.add("Apple");  
		list.add("Bajaj");  
		list.add("coco");  
		list.add("Audi");  
		list.add("jockey");  
		list.add("tech");  
 
		System.out.println("ArrayList Before Sorting:");  
		for(String products: list)  
		{  
		System.out.println(products);  
		}  
	 
		Collections.sort(list);  
		System.out.println("ArrayList After Sorting:");  
		for(String products: list)  
		{  
		System.out.println(products);  
		}  
		}  
		

	}


