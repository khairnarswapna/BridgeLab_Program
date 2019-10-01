/******************************************************************************
 *  Purpose:  using Queue implementation of calendar 

 *  @author  swapna khairnar
 *    
 *******************************************************************************/
package com.bridgelabz.dsprogram;

import com.bridgelabz.utility.AlgorithmUtility;

import com.bridgelabz.utility.DataStructurUtility;
import com.bridgelabz.utility.Utility;

public class CalendarQueue 
{

	public static void main(String[] args) 
	{
		
		DataStructurUtility<Integer> list = new DataStructurUtility<Integer>();
		DataStructurUtility<Integer> list2 = new DataStructurUtility<Integer>();
		DataStructurUtility<Integer> list1 = new DataStructurUtility<Integer>();
		
		DataStructurUtility<String> months = new DataStructurUtility<String>();
		DataStructurUtility<String> months1 = new DataStructurUtility<String>();
		
		System.out.println("Enter month");
		int mon = list.scanInt();
		System.out.println("Enter year");
		int year = list.scanInt();
        
		
		 
        String[]month= {"Januvary","Februvary","March","April","May","June","Jully","Agust","September","Octomber","Novemsber","December"};
        
		for(int i=0;i<month.length;i++) 
		{
			months.enqueue(month[i]);  //all inserted into queue
		}
		for(int i=0;i<month.length;i++) 
		{
			months1.enqueue(months.peekQueue());
			months.dequeue();
		}
	 
	
		String monthFront ="";
		for(int i=1;i<=12;i++) 
		{
			if(mon==i) 
			{
				monthFront = months1.peekFront();
			}
			months1.dequeue();
		}
 
		int [] days1= {31,28,31,30,31,30,31,31,30,31,30,31};
		
	    System.out.println("--");
		for(int i=0;i<12;i++) 
		{
			list.enqueue(days1[i]);
		}
		
		for(int i=0;i<12;i++) 
		{
			list2.enqueue(list.peekQueue());
			list.dequeue();
		}
	
		int dayFront=0;
		for(int i=1;i<=12;i++) 
		{
			if(mon==i) 
			{
				dayFront = list2.peekFront();
			}
			list2.removeFront();
		}
	 
		
		
		
		if(mon==2 && Utility.leapYear(year)) 
		{
			dayFront=29;
		}
		 
		  for(int day1=1;day1<=dayFront;day1++) 
		  {
			 list1.enqueue(day1);
		  }
		  
		  int size=list1.getListSize(); //queue
		  size=size+1;
		 
		int day=Utility.dayOfWeek(1, mon, year);
		System.out.println("day of week is : "+day);  // i.e day of week is : 4
		
		System.out.println();
		System.out.println("   "+monthFront+" "+year); //August 2019
		System.out.println("s  m  tu  w  th f  s");
		
		for(int i=0;i<day;i++) 
		{
			System.out.print("   ");  //printing starting row spaces of calender
		}
		
		  for(int day1=1;day1<=dayFront;day1++) 
		  {
			  if(size==-1)
				  break;
			  
			  if(size>=1)
				  
	       	System.out.printf("%2d ",list1.peekFront());
			  
	       	if(((day1+day)%7==0) || day1==dayFront)
	       		
	       		System.out.println();
	       	
	       	if(size>=1)
	       		
	       	list1.dequeue();
	       	
	       	size--;
	        
		  }
		    
	}

}
