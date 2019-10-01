/******************************************************************************
 *  Purpose: Program is gambling simulation.
   @author swapna khairnar
      
 ******************************************************************************/
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.utility.AlgorithmUtility;

public class PrimeNumber 
{
	public static void main(String[] args) {
		 
		AlgorithmUtility utility = new AlgorithmUtility();
		for (int i = 0; i <= 1000; i++) {
			if (utility.isPrime(i)) {
				System.out.print(i + " ");
			}
			
		}

	}
}
