/**
 * 
 */
package com.bridgelabz.algorithmprogram;
import com.bridgelabz.utility.AlgorithmUtility;
import java.util.*;

public class StaticSorting 
{
	public static void main(String[] args) 
	{

		int[] intArray = { 11, 15, 12, 16, 17, 19, 13 };
		int[] intArray2 = { 1, 5, 2, 6, 7, 9, 3 };
		String[] stringArray = { "pinu", "mona", "Jaya", "Mani",  };
		String[] stringArray2 = { "pinu", "mona", "Jaya", "Mani",};
		

		AlgorithmUtility utility = new AlgorithmUtility();
		
		AlgorithmUtility.intInsertionSort(intArray);
		AlgorithmUtility.printIntArray(intArray);
		long timer3 = utility.elapsedTime();
		
		System.out.println("elapsed time for insertion sort of integer is : " + (timer3 - utility.start) / 1000.0);
		
		//bubble sort for Integer
		AlgorithmUtility.intBubbleSort(intArray2);
		AlgorithmUtility.printIntArray(intArray2);
		long time4 = utility.elapsedTime();
		System.out.println("elapsed time for bubble sort of integer is : " + (time4 - utility.start) / 1000.0);
		
		//bubble sort for String
		AlgorithmUtility.stringBubbleSort(stringArray2);
		AlgorithmUtility.printStringArray(stringArray2);
		long time6 = utility.elapsedTime();
		System.out.println("elapsed time for bubble sort of string is : " + (time6 - utility.start) / 1000.0);
	
		//insertion sort for string
		AlgorithmUtility.stringInsertionSort(stringArray);
		AlgorithmUtility.printStringArray(stringArray);
		long time5 = utility.elapsedTime();
		System.out.println("elapsed time for insertion sort of String is : " + (time5 - utility.start) / 1000.0);
		
	
				System.out.println("index : " + AlgorithmUtility.intBinarySearch(intArray, 6));
				long time1 = utility.elapsedTime();
				System.out.println("elapsed time for binary search of integer is : " + (time1 - utility.start) / 1000.0);
				Arrays.sort(stringArray);
				System.out.println("index : " + AlgorithmUtility.stringBinarySearch(stringArray, "Jaya"));
				long time2 = utility.elapsedTime();
				System.out.println("elapsed time for binary search of integer is : " + (time2 - utility.start) / 1000.0);
		
		 
		 
	}

}
