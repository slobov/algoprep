// See https://www.geeksforgeeks.org/to-find-smallest-and-second-smallest-element-in-an-array/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int[] arr = {1, 16, 3, 87, 12};
        nSmallestElems(arr);
	}
	

	private static void nSmallestElems(int n, int[] arr) {
	    if (arr.length < 2) {
	        return {};
	    }
	    
	    if (arr.length == n) {
	        return arr;
	    }
	    
	    
		// find smallest
		int smallest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			smallest = smallest < arr[i] ? smallest : arr[i];
			// TODO: check if all equal
		} // smallest = 1

		// find second smallest
		int secondSmallest = Integer.MAX_VALUE; 
		for (int i = 0; i < arr.length; i++) {
			secondSmallest = (arr[i] > smallest && arr[i] < secondSmallest) 
										? arr[i] : secondSmallest;  
		}

		System.out.printf("First: %s, second: %s", smallest, secondSmallest);
	}
}
