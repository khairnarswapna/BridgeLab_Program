/******************************************************************************
 *  Purpose: Implementation of bubble sort for sorting the Integer array element 
   @author swapna khairnar
      
 ******************************************************************************/
package com.bridgelabz.algorithmprogram;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

public class MonthlyPayment 
{

	public static void main(String[] args) 
	{
		AlgorithmUtility utility = new AlgorithmUtility();

		Scanner scanner = new Scanner(System.in);
		int  year;
		double rOI, amountToPayForMonth;

		System.out.println("please Enter Principal Loan Amount");
		int pLoanAmount = scanner.nextInt();
		System.out.println("please Enter Year");
		year = scanner.nextInt();
		System.out.println("please Enter Rate Of Interest");
		rOI = scanner.nextDouble();
		amountToPayForMonth = utility.LoanCalculate(pLoanAmount, year, rOI);
		System.out.println("Amount to be Paid :" + amountToPayForMonth + " For Year :" + year);
		scanner.close();

	}

}
