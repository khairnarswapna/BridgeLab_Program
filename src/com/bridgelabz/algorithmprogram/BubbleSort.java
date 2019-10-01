/******************************************************************************
 *  Purpose: Implementation of bubble sort for sorting the Integer array element 
   @author swapna khairnar
      
 ******************************************************************************/
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.utility.AlgorithmUtility;

public class BubbleSort {

	public static void main(String[] args) 
	{
			
			int[] intArr = { 11, 15, 12, 16, 17, 19, 13 };
			System.out.println("Before sorting Array");
			AlgorithmUtility.printIntArray(intArr);
			int[] a= {4,2,1,9,10,7,3,1};
			AlgorithmUtility.intBubbleSort(intArr);
			AlgorithmUtility.intBubbleSort(a);
			System.out.println("=============================");
			System.out.println("After sorting Array");
			AlgorithmUtility.printIntArray(intArr);
			System.out.println("=============================");
			System.out.println("After sorting Array");
			AlgorithmUtility.printIntArray(a);
		
		}
}
