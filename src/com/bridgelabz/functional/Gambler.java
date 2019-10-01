/******************************************************************************
 *  Purpose: Program is gambling simulation.
   @author swapna khairnar
    
    
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class Gambler 
{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FunctionalUtility utility=new FunctionalUtility();
		int times, stake, goal;
		System.out.println("Enter stake");
		stake=scanner.nextInt();
		System.out.println("Enter goal");
		goal=scanner.nextInt();
		System.out.println("Enter number of times you want to play");
		times=scanner.nextInt();
		utility.gamlingSimulation(stake,goal,times);
		
		scanner.close();

	}

}
