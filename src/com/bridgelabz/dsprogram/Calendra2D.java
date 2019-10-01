package com.bridgelabz.dsprogram;
import java.util.*;
public class Calendra2D 
{
	 
	static	int arr[][]=new int[6][7];   

 
		public static int day(int month, int year) 
		{
			int day = 1;
			int y = year - (14 - month) / 12;
			int x = y + y / 4 - y / 100 + y / 400;
			int m = month + 12 * ((14 - month) / 12) - 2;
			int d = ((day + x + (31 * m) / 12) % 7);
			return d;
		}
	  
	   public static boolean isLeapyear(int year)
	   {
	    	 if ((year % 4 == 0) && (year % 100 != 0)) return true;
	         if  (year % 400 == 0)  return true;
	         return true;
	   }


	public static void main(String[] arcgs) {

         Scanner sc=new Scanner(System.in);
	     int dayofmonth = 0;
	     System.out.println("Enter month");
	     int month = sc.nextInt();
	     System.out.println("Enter  year");
		 int year = sc.nextInt();
	   
	    int days=day(month,year);
	    
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			  dayofmonth = 31;

		}else if(month==4||month==6||month==9||month==12)
		{
		      dayofmonth = 30;
		}
		else if(month==2)
		{
			if (isLeapyear(year) == true) 
			{
				dayofmonth = 28;
			} 
			else 
			{
				dayofmonth = 29;
			}
		}
	    int count=1;
		for (int i =0; i < 6; i++) 
		{
			for (int j = days; j < 7; j++) 
			{
				if (count <= dayofmonth) 
				{ 
					arr[i][j]=count;
//					 
				
					count++;
					
				} 
				else 
				{
					break;
				}
				
  		 
			}days=0;	
			
			
	}
		
	
		System.out.println("sun\tMon\tTue\twed\tThu\tFri\tSat");
		for (int i = 0; i < 6; i++) 
		{
			for (int j = 0; j < 7; j++) 
			{
				if (arr[i][j] == 0) 
				{
					System.out.print("\t");
				} 
				else if (arr[i][j] > 9) 
				{
			
					System.out.print(arr[i][j]+ "\t");
				} 
				else 
				{
					
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
	} 
	 

}
