/**
 * purpose :implementation of 2D primeNumber
 */
package com.bridgelabz.dsprogram;
import com.bridgelabz.utility.DSutility;

public class TwoDPrimeNumber 
{
	public static void main(String[] args) 
	{
		int start = 0;
		int end = 100;

		int[][] primeNum = new int[10][];
        int c1 = 0, c2 = 0;  //for no of counting column 
		 
        for (int i = 0; i < 10; i++) 
		{
			for (int j = start; j <= end; j++) 
			{
				if (DSutility.isPrime(j)) 
				{
					c1++;
				}
			}
			primeNum[i] = new int[c1];
			start = end + 1;
			end += 100;
			c1 = 0;

		}
		start = 0;
		end = 100;
		// putting values in array
		for (int i = 0; i < 10; i++) 
		{
			for (int j = start; j <= end; j++) 
			{

				if (DSutility.isPrime(j)) 
				{
					primeNum[i][c2] = j;
					c2++;
				}

			}
			start = end + 1;
			end += 100;
			c2 = 0;
		}

		// printing prime series
		int r=0;
		int k=100;
		 
		for (int i = 0; i < primeNum.length; i++) 
		{
			System.out.println("prime series "+ r+" - "+k);
		 
			for (int j = 0; j < primeNum[i].length; j++)
				
				System.out.print(primeNum[i][j] + " ");
			 
			
			System.out.println();
			System.out.println("-----------------------------------------------------------------------");
			 
			r=k+1;
			k+=100;
		}

	}
}
