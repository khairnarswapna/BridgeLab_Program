/**
 * 
 */
package com.bridgelabz.utility;

import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FunctionalUtility 
{
	static Scanner scanner=new Scanner(System.in);
	public void flipCoin(int numberOfTimesFlipCount) 
	{

		int percentageOfHeads, percentageOfTails;
		int headsCounts = 0, tailsCounts = 0;
		for (int i = 0; i < numberOfTimesFlipCount; i++) 
		{
			if (Math.random() > 0.5) {
				headsCounts++;
			} else {
				tailsCounts++;
			}
		}
		System.out.println("heads : " + headsCounts);
		System.out.println("tails : " + tailsCounts);
		// calculation of percentage
		percentageOfHeads = headsCounts * 100 / numberOfTimesFlipCount;
		percentageOfTails = tailsCounts * 100 / numberOfTimesFlipCount;

		System.out.println("Percentage for heads : " + percentageOfHeads);
		System.out.println("Percentage for tails : " + percentageOfTails);
	}

	/**
	 * Purpose: method for finding year is leap or not
	 * @param year input taken from user
	 */

	/*
	 * public boolean isLeapYear(int year) { if (year % 400 == 0 && year % 100 !=
	 * 0||year % 4 == 0 ) { return true; } else { return false; }
	 * 
	 * }
	 * 
	 */
	
	public boolean isLeapYear(int year) 
	{
		if (year % 400 == 0 || year % 100 != 0 &&year % 4 == 0 ) 
		{
			 //System.out.println("year is leap year");
			return true;
		} 
		else 
		{
			// System.out.println("year is not leap year");
			return false;
		}

	}
	
	/**
	 * purpose : this function used elapsetime calculation
	 * @return : epapsetime of system
	 */
	public static double stopWatch() 
	{
		double elapsetime = 0;
		System.out.println("Enter 0 to start stopwatch");
		int start=scanner.nextInt();
		long startTime=0;
		long stopTime=0;
		
		if(start==0)
		{
			startTime=System.currentTimeMillis();
			System.out.print("Start timing is : ");
			System.out.println(startTime);
		}
		System.out.println("Enter 1 to stop stopwatch");
		int stop=scanner.nextInt();
		
		if(stop==1)
		{
			stopTime=System.currentTimeMillis();
			System.out.print("stop timing is : ");
			System.out.println(stopTime);
            elapsetime=(stopTime-startTime);
            System.out.println("Elapsetime : "+elapsetime);
		}

		return elapsetime;
	}

	
	/**
	 * Purpose: method for finding power of N
	 * @param range input taken from user
	 */
	public void powerOfN(int range) {
		for (int i = 0; i < range; i++) {
			System.out.println((int) Math.pow(i, 2));
		}

	}

	/**
	 * Purpose: method for finding Harmonic series 
	 * @param range input taken from user
	 */
	public void harmonicSeries(int range) 
	{

		double sum = 0;
		for (int i = 1; i <= range; i++) 
		{
			if (i != range) 
			{
				System.out.print((double) 1 / i);
				System.out.print(" + ");
				sum += (double) 1 / i;
			} 
			else 
			{
				System.out.print((double) 1 / i);
				sum += (double) 1 / i;
			}
		}
		System.out.println();
		System.out.print("H(" + range + ")" + " = " + sum);

	}

	/**
	 * Purpose: method for finding Prime Factor of number
	 * @param n range until finding prime factors
	 */
	public void primeFactor(int n) 
	{
		if (n == 0 || n == 1) 
		{
			System.out.println(n + " is Not Prime");
		}
		for (int i = 2; i * i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println(n + " is Not Prime");
			}
		}
		System.out.println(n + " is Prime Factor");

	}

	/**
	 * Purpose: method for gambling simulation 
	 * @param stake input from user
	 * @param goal  input from user
	 * @param times input from user
	 */
	public void gamlingSimulation(int stake, int goal, int times) {
		int tempStake = stake;
		int tempTime = times;
		int bets = 0;
		int win = 0, lose = 0;

		while (tempStake != 0 && tempStake != goal) {
			if (tempTime > -1) {
				if (tempStake != 0) {
					if (win != goal) {
						if (Math.random() > 0.5) {
							tempStake++;
							win++;
							System.out.println("Won" + tempStake);
						} else {
							tempStake--;
							lose++;
							System.out.println("Loss" + tempStake);
						}
					} else {
						System.out.println("Gamler reached to goal now withdraw money");
						break;
					}

				} else {
					System.out.println("Stake amount is 0 not able to play now");

				}

			} else {
				System.out.println("Played n times");
				break;
			}
			tempTime--;
			bets++;

		}
		int perOfWin = win * 100 / bets;
		int perOfLose = lose * 100 / bets;

		System.out.println("Percentage of win : " + perOfWin);
		System.out.println("Percentage of loose : " + perOfLose);

	}

	/**
	 * Purpose: method for generating random number between range
	 * 
	 * @param range taken from user
	 * @return return the random number
	 */
	public int randomNumber(int range) {

		return (int) (Math.random() * range);
	}

	/**
	 * Purpose: for finding distinct coupon
	 * 
	 * Identifier: P8DistinctCoupon
	 * 
	 * @param range for number of coupon generated
	 * @return return the count of times run loop to generate each distinct coupon
	 */
	public int distinctCoupon(int range) {
		boolean[] arr = new boolean[range];
		int count = 0;
		int distinct = 0;
		while (distinct < range) {
			int value = randomNumber(range);
			System.out.print(value + " ");
			if (!arr[value]) {
				distinct++;
				arr[value] = true;
				System.out.print(arr[value] + " ");
			}

			count++;
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print("index " + i + " values " + arr[i] + "\n");
		}
		return count;

	}

	/**
	 * Purpose: method for taking input for integer matrix
	 * @param m row
	 * @param n column
	 * @return return the input array
	 */
	public int[][] matrixInputInt(int m, int n) 
	{
		int[][] arr = new int[m][n];

		for (int i = 0; i < m; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				arr[i][j] = scanner.nextInt();
			}
		}
		return arr;
	}

	/**
	 * Purpose: method for printing integer matrix
	 * @param result array for printing
	 */

	public void print2dArrayInt(int[][] result) 
	{
		System.out.println("matrix result");
		 
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				 
				System.out.print(result[i][j] + " ");
			}  
			System.out.println();
		}

	}

	/**
	 * Purpose: method for taking input for double matrix
	
	 * @param m row
	 * @param n column
	 * @return return the input array
	 */
	public double[][] matrixInputDouble(int m, int n) {
		double[][] arr = new double[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scanner.nextDouble();
			}
		}
		return arr;
	}

	/**
	 * Purpose: method for printing double matrix
	 
	 * @param result array for printing
	 */
	public void print2dArrayDouble(double[][] resultDouble) {
		System.out.println("Printing result matrix");
		for (int i = 0; i < resultDouble.length; i++) {
			for (int j = 0; j < resultDouble[i].length; j++) {
				System.out.print(resultDouble[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Purpose: method for taking input for boolean matrix
	 * 
	 * @param m row
	 * @param n col
	 * @return return the input array
	 */
	public boolean[][] matrixInputBoolean(int m, int n) {
		boolean[][] arr = new boolean[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scanner.nextBoolean();
			}
		}
		return arr;
	}

	/**
	 * Purpose: method for printing boolean matrix
	
	 * @param result array for printing
	 */
	public void print2dArrayBoolean(boolean[][] resultBoolean) 
	{
		System.out.println("Printing result matrix");
		for (int i = 0; i < resultBoolean.length; i++) {
			for (int j = 0; j < resultBoolean[i].length; j++) {
				System.out.print(resultBoolean[i][j] + " ");
			}
			System.out.println();
		}

	}

	/**
	 * Purpose: method for finding triplet zero
	 * @param arr input from user
	 */
	public void sumOfThreeIsZero(int[] arr) {
		System.out.println("Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + " is distinct triplets");
					}
				}
			}
		}

	}

	/**
	 * Purpose: method for finding euclideanDistance
	 * @param x1 0
	 * @param y1 0
	 * @param x2 input from user
	 * @param y2 input from user
	 * @return returns the distance from the calculation
	 */
	public double EuclideanDistance(int x1, int y1, int x2, int y2) 
	{
		double distance, powerofx, powerofy, sumOfPowerXY;
		int x, y;
		x = x2 - x1;
		y = y2 - y1;
		powerofx = Math.pow(x, 2);
		powerofy = Math.pow(y, 2);

		sumOfPowerXY = powerofx + powerofy;

		distance = Math.sqrt(sumOfPowerXY);
		return distance;
	}

	/**
	 * Purpose: find permutation using iteration
	 * @param str input from user end
	 */
	static List<String> listPermutationIterative = new ArrayList<String>();

	public static void permutationIterative(String str) {

		// convert string to a character array (Since String is immutable)
		char[] chars = str.toCharArray();

		// Weight index control array
		int[] p = new int[str.length()];

		// i, j represents upper and lower bound index resp. for swapping
		int i = 1, j = 0;

		// Print given string, as only its permutations will be printed later
		System.out.print(str);
		listPermutationIterative.add(str);
		while (i < str.length()) {
			if (p[i] < i) {
				// if i is odd then j = p[i], otherwise j = 0
				j = (i % 2) * p[i];

				// swap(a[j], a[i])
				swap(chars, i, j);

				// Print current permutation
				System.out.print(" " + String.valueOf(chars));
				listPermutationIterative.add(String.valueOf(chars));
				p[i]++; // increase index "weight" for i by one
				i = 1; // reset index i to 1
			}
			// otherwise p[i] == i
			else {
				// reset p[i] to zero
				p[i] = 0;

				// set new index value for i (increase by one)
				i++;
			}
		}
	}

	/**
	 * Purpose: method for swapping characters of iterative permute
	 * 
	 * @param arr character array of string
	 * @param i   index which passed from iterative method
	 * @param j   index which passed from iterative method
	 */
	private static void swap(char[] arr, int i, int j) 
	{
		char c = arr[i];
		arr[i] = arr[j];
		arr[j] = c;

	}

	/**
	 * Purpose: find permutation using recursive
	 * 
	 * Identifier: StringPermutation
	 * 
	 * @param str input from user end
	 * @param l   lower index of string
	 * @param r   higher index of string
	 */
	static List<String> listPermutationRecursion = new ArrayList<String>();

	public static void permutationRecursion(String str, int l, int r) {
		if (l == r) {
			System.out.print(str + " ");
			listPermutationRecursion.add(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permutationRecursion(str, l + 1, r);
				str = swap(str, l, i);
			}
		}

	}

	/**
	 * Purpose: method for swapping the element of recursive permute
	 * 
	 * @param str string given by method
	 * @param l   lower index
	 * @param i   operation on which swapping is doing
	 * @return returns the value of indexed swapped
	 */
	private static String swap(String str, int l, int i) {
		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[l];
		charArray[l] = charArray[i];
		charArray[i] = temp;
		return String.valueOf(charArray);
	}

	/**
	 * Purpose: compare two type of permutation iterative and recursive
	 * 
	 * Identifier: P12StringPermutation
	 * 
	 */
	public static void compareTwoPermutation() {
		Collections.sort(listPermutationIterative);
		// System.out.println(listPermutationIterative);
		Collections.sort(listPermutationRecursion);
		// System.out.println(listPermutationRecursion);
		if (listPermutationIterative.equals(listPermutationRecursion))
			System.out.println("\n--->Two permutation is equal<---");
		else
			System.out.println("\n--->Two permutation is not equal<---");
	}

	/**
	 * Purpose: Method is written for finding delta for Quadratic Equation
	 * 
	 * Identifier: P15Quadratic
	 * 
	 * @param a input a
	 * @param b input b
	 * @param c input c
	 * @return delta finding delta using formula
	 */

	public double FindDelta(int a, int b, int c) {
		int delta = (b * b) - (4 * a * c);
		return delta;
	}

	/**
	 * Purpose: Method is written for finding first Quadratic Equation
	 * 
	 * Identifier: P15Quadratic
	 * 
	 * @param a     input
	 * @param b     input
	 * @param delta delta of a b and c
	 * @return returns of quadratic equation answer
	 */
	public double QuadraticEquation1(int a, int b, double delta) {
		double absDelta = Math.abs(delta);
		double sqrtDelta = Math.sqrt(absDelta);
		double equation1 = (-b + sqrtDelta) / (2 * a);
		return equation1;
	}

	/**
	 * Purpose: Method is written for finding second Quadratic Equation
	 * @param a     input
	 * @param b     input
	 * @param delta delta of a b and c
	 * @return returns of quadratic equation answer
	 */
	public double QuadraticEquation2(int a, int b, double delta) 
	{
		double absDelta = Math.abs(delta);
		double sqrtDelta = Math.sqrt(absDelta);
		double equation2 = (-b - sqrtDelta) / (2 * a);
		return equation2;
	}

	/**
	 * Purpose: method for calculating wind chill
	 * @param temperature temperature in celcius
	 * @param windspeed   speed in velocity
	 * @return return the calculated windchill
	 */
	public double CalculateWindChill(double temperature, double windspeed) 
	{
		double a, windChill, b, c;
		a = 0.6215 * temperature;
		b = 0.4275 * temperature;
		c = b - 35.75;
		windChill = 35.74 + a + c * (Math.pow(windspeed, 0.16));
		// windchill cannot be negative
		windChill = Math.abs(windChill);
		return windChill;
	}

}
