/******************************************************************************
 *  Purpose: Program is written Flip coin.

 *  @author  swapna khairnar
 *
 ******************************************************************************/
 
package com.bridgelabz.functional;

import java.util.Scanner;


import com.bridgelabz.utility.FunctionalUtility;

public class PowerOfN 
{

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		FunctionalUtility utility=new FunctionalUtility();
		System.out.println("Please enter range for finding power table");
		int range=scanner.nextInt();
		if(range<0||range>32) {
			System.out.println("Please enter number between 0 to 31");
		}else {
			utility.powerOfN(range);
		}
		
		scanner.close();

	}

}
