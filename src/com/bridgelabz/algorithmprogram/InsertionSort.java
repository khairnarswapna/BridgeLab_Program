/******************************************************************************
 *  Purpose: Implementation of Insertion sort for sorting the Integer array element 
   @author swapna khairnar
      
 ******************************************************************************/
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.utility.AlgorithmUtility;

public class InsertionSort 
{

	public static void main(String[] args) {
		 
		int[] intArr = { 11, 15, 12, 16, 17, 19, 13 };
		System.out.println("Before sorting");
		AlgorithmUtility.printIntArray(intArr);
		AlgorithmUtility.intInsertionSort(intArr);
		System.out.println("-------------------------------");
		System.out.println("After sorting");
		AlgorithmUtility.printIntArray(intArr);
		

	}

}
