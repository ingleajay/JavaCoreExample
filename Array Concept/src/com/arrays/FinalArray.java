package com.arrays;

public class FinalArray {

	public static void main(String[] args) {
		
		// final is keyword and its value can�t be modified and it is a constant.
		
		 final int arr1[] = {1, 2, 3, 4, 5};
		 
         int arr2[] = {10, 20, 30, 40, 50};
         
         arr2 = arr1;      
      // arr1 = arr2;   // this line has error

	     for (int i = 0; i < arr2.length; i++)
	    	 	System.out.println(arr2[i]); 

	}
}
