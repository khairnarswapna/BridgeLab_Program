package com.bridgelabz.algorithmprogram;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

public class Sqrt 
{

	public static void main(String[] args) {
		 
		AlgorithmUtility utility=new AlgorithmUtility();
		Scanner scanner = new Scanner(System.in);
		int c;
		double result;
		System.out.println("Enter Nonnegative integer ...");
		c = scanner.nextInt();
		if (c > 0) 
		{
			result = utility.SqureRootUsingNewtonsMethod(c);
			System.out.println("Square Root of " + c + " using Newtons Law is " + result);
		}
		else 
		{
			System.out.println("Please enter positive integer....");
		}
		
		scanner.close();
	}

	 

}
