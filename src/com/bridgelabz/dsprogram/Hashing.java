package com.bridgelabz.dsprogram;

import com.bridgelabz.utility.DataStructurUtility;

public class Hashing {

	public static void main(String[] args) 
	{
		
		
		DataStructurUtility<Integer> list = new DataStructurUtility<Integer>();	
		System.out.println("Enter number: ");
		int number = list.scanInt();
		
		DataStructurUtility<Integer> [] listnum = new DataStructurUtility[number]; //creating linked list
	
		for (int i=0;i<number;i++)
			
		listnum[i] = new DataStructurUtility<Integer>();
		
		for(int i=0;i<number;i++) 
		{
			listnum[i].addRear(i);
		}
		
		for (int i = 0; i < listnum.length; i++) 
		{
			listnum[i].printHash();
		}
	
		System.out.println();

		    System.out.println("u enter in linked list : ");
	         int listNum=list.scanInt();
		
		 while(listNum>0) 
		 {
        	 System.out.println("\nEnter number : ");
        	 int numaddList = list.scanInt();
        	 int rem = numaddList%number;
        	 
        	 listnum[rem].addRear(numaddList);
        	 System.out.println();
        	 System.out.print("list of "+rem+" elements : ");
        	 listnum[rem].printHash();
        	 listNum--;
         }
		
		 System.out.println();
		for(int i=0;i<number;i++) 
		{
			System.out.print("list of "+i+" elements : ");
			listnum[i].printHash();
			System.out.println();
		}		
		
	}

}
