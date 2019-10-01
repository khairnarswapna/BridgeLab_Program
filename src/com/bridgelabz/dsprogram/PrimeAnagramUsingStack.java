/*

 * 
 */
package com.bridgelabz.dsprogram;

import com.bridgelabz.dstype.StackUsingLinkedList;
import com.bridgelabz.utility.DSutility;

public class PrimeAnagramUsingStack 
{
	public static void main(String[] args) 
	{
		int start = 0;
		int end = 1000;

		StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<Integer>();

		// putting values in array

		for (int j = start; j <= end; j++) 
		{
			if (DSutility.isPrime(j)) 
			{
				for (int k = j + 1; k < end; k++) 
				
				{
					if (DSutility.isPrime(k)) 
					{
						if (DSutility.isIntAnagram(j,k)) 
						{
							stack.push(j);
							stack.push(k);

						}
					}
				}
				
			}

		}
		 
		
		 
		 
		int tempSize = stack.size();
		for (int i = 0; i < tempSize; i++) 
		{
			System.out.print(stack.peek() + " ");
			if (!stack.isEmpty()) 
			{
				stack.pop();
			}
		}

	}
}
