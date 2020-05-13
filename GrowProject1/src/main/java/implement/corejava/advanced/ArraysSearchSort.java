package implement.corejava.advanced;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysSearchSort {
	
	
	public void searchEvenNum(int []arr) {
		System.out.println("Even numbers in given arrays are => ");
		for(int i:arr) {
			if(i%2==0)
				System.out.println(i);
		}
		
	}
	
	public void sortArray(int []arr) {
		
			System.out.println("Sorting in Ascending order => ");
			Arrays.sort(arr);
			for (int i:arr)
				System.out.println(i);
			
			System.out.println("Sorting in Descending order => ");
			for (int i=arr.length; i>0;i-- )
				System.out.println(arr[i-1]);
				
		}
		
	}


