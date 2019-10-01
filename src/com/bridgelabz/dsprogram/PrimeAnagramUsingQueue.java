/**

 */
package com.bridgelabz.dsprogram;
import com.bridgelabz.dstype.QueueUsingLinkedList;

import com.bridgelabz.utility.DSutility;

public class PrimeAnagramUsingQueue 
{
	public static void main(String[] args) 
	{
		int start = 0;
		int end = 1000;
		QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<Integer>();
		 
		for (int i = start; i <= end; i++) 
		{
			if (DSutility.isPrime(i)) 
			{
				for (int j= i + 1; j < end; j++) 
				{
					if (DSutility.isPrime(j)) 
					{
						if (DSutility.isIntAnagram(i,j)) 
						{
							queue.enQueue(i);
							queue.enQueue(j);  

						}
					}
				}

			}

		}
		
		
		  int QSize = queue.size();		  
		  for (int i = 0; i < QSize; i++) 
		  { 
			  
			  System.out.print(queue.get(i) + " ");
		  
		  }
		
		   
	 
		
	}

	// queue.forEach(i->System.out.println(i));
}
