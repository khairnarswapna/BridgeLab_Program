/******************************************************************************
 *  Purpose: Program is written finding Harmonic series n uptil range.
    
    @author swapna khairnar
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;
import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Please enter year");
		Scanner scanner=new Scanner(System.in);
		FunctionalUtility utility=new FunctionalUtility();
		int year=scanner.nextInt();
		boolean valid=true;
		if(year>=1000 && year<10000)
		{
			valid=utility.isLeapYear(year);
			if(valid==true)
			{
				System.out.println("leap year");
			}
			else
			{
                 System.out.println("is not a leap year");			    
			}
		}
		else
		{
			System.out.println("Invalid Year.!!!!!");
		}
		/*if(year>1582&&year<9999) 
		{
			utility.isLeapYear(year);
		}
		else 
		{
			System.out.println("Please enter valid year");
		}*/
		scanner.close();
		

	}

}
