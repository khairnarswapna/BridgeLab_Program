/******************************************************************************
 *  Purpose: Program is written finding Harmonic series n uptil range.

    
    @author swapna khairnar
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class HarmonicSeries 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		FunctionalUtility utility=new FunctionalUtility();
		System.out.println("Enter n for Harmonic Series");
		int range=scanner.nextInt();
		
		utility.harmonicSeries(range);
		
		scanner.close();

	}

}
