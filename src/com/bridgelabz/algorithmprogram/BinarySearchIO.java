/******************************************************************************
 *  Purpose:implementation of Searching key from the stored file using binary search
   @author swapna khairnar
   
 ******************************************************************************/
package com.bridgelabz.algorithmprogram;
import com.bridgelabz.files.*; 
import com.bridgelabz.utility.AlgorithmUtility;

import java.util.*;

public class BinarySearchIO 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
	    String str = AlgorithmUtility.getFileContent("/home/admin-1/eclipse-workspace/Programs/src/com/bridgelabz/files/wordlist.txt");
	    String[] strArray = str.split(" ");
	    
		
		AlgorithmUtility.stringInsertionSort(strArray);
		AlgorithmUtility.printStringArray(strArray);
		System.out.println("Enter key to search");
		String key = sc.next(); 
		
		int index= AlgorithmUtility.stringBinarySearch(strArray, key);
		if (index >= 0)
		{
			System.out.println("Key found at index : " + index + " which is : " + strArray[index]);
		}
		else if(index==-1) 
		{
			System.out.println("Key not found");
		}
		 
		sc.close();
	}
}
