package com.bridgelabz.algorithmprogram;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

public class VendingMachine {
 
		 

		static int[] notes = {2000,1000,500,200 ,100, 50,20, 10, 5, 2, 1 };
		public static void main(String[] args) 
		{
			Scanner scanner = new Scanner(System.in);
			int money;
			System.out.println("Enter amount: ");
			money = scanner.nextInt();
			AlgorithmUtility.vendingMachine(money, notes);
			scanner.close();
		}

	 

}
