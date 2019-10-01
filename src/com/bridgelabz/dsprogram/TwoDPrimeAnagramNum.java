/**
 * purpose: implementation of 2D primeAnagram number
 */
package com.bridgelabz.dsprogram;
import com.bridgelabz.utility.DSutility;

public class TwoDPrimeAnagramNum 
{
static int[][] primeAnagram = new int[10][];
	
	static int beg=0,end=100;
	static int c1=0,c2=0;
	
	public static void main(String[] args) 
	{ 
		 // declaration of array 
		for (int i = 0; i < 10; i++) 
		{
			for (int j =beg; j <= end; j++) 
			{
				if (DSutility.isPrime(j)) 
				{
					for (int k = j + 1; k < end; k++) 
					{
						if (DSutility.isPrime(k)) 
						{
							if(DSutility.isIntAnagram(j,k)) 
							{
								c1+=2;
							}
						}
					}

				}
			}
			primeAnagram[i] = new int[c1];
			
		    beg = end + 1; 
			end += 100;
			c1= 0;

		}
		
		beg = 0;
		end = 100;
		 
		/*putting values in array*/
		for (int i = 0; i < 10; i++) 
		{
			for (int j =beg; j <= end; j++) 
			{
				if (DSutility.isPrime(j)) 
				{
					for (int k = j + 1; k < end; k++) 
					{
						if (DSutility.isPrime(k)) 
						{
							if (DSutility.isIntAnagram(j,k)) 
							{
								primeAnagram[i][c2]=j;
								primeAnagram[i][c2+1]=k;
								c2+=2;
							}
						}
					}

				}
			}
			beg = end + 1;
			end += 100;
			c2 = 0;
		}

		/*// printing array
		for (int i = 0; i < primeAnagramNum .length; i++) 
		{
			for (int j = 0; j < primeAnagramNum [i].length; j++)
				System.out.print(primeAnagramNum [i][j] + " ");
			System.out.println();
		}
		*/
		
		
		
		int r=0;
		int k=100;
		//System.out.println(" "+k);
		for (int i = 0; i < primeAnagram.length; i++) 
		{
			System.out.println("primeAnagramNum series "+ r+" - "+k);
		 
			for (int j = 0; j < primeAnagram[i].length; j++)
				
				System.out.print(primeAnagram[i][j] + " ");
			 
			
			System.out.println();
			System.out.println("-----------------------------------------------------------------------");
			 
			r=k+1;
			k+=100;
		}
	}

}
