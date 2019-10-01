/******************************************************************************
 *  Purpose: This is utility file which contains logic for files.
     this file is having methods who can take input process it according to process it
     
     @author swapna khairnar.
    
 ******************************************************************************/
package com.bridgelabz.utility;
import java.util.*;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class DSutility 
{
	
	
	
	public static String StringInput() 
	{
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		return string;

	}

	public static int inputInt() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the interger:- ");
		int integer = scanner.nextInt();
		return integer;

	}


	/**
	 * Purpose: reading file and return in string
	 * 
	 * @param path path of file
	 * @return returns the string value which is read from file
	 * @throws IOException checking exception for file operation
	 */
	public String readFile(String path) throws IOException 
	{
		String str = "";
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		str = bufferedReader.readLine();
		bufferedReader.close();
		return str;
	}

	/**
	 * Purpose: writing string into file
	 * 
	 * @param path path of file
	 * @param str  input from user end
	 * @throws IOException checking exception for file operation
	 */
	public void writeFile(String path, String str) throws IOException 
	{
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
		bufferedWriter.write(str);
		bufferedWriter.close();
		System.out.println("\nFile written Sucessffully!!!!!!!!!!");
	}

	/**
	 * Purpose: method for checking year is leap or not
	 * 
	 * @param year input from user
	 * @return returns true if leap year else false
	 */
	public static boolean isLeapYear(int year) 
	{
		if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0)
			return true;
		else
			return false;
	}

	/**
	 * Purpose: calculate which day is this
	 * 
	 * @param day   input from user
	 * @param month input from user
	 * @param year  input from user
	 * @return returns day from 0 to 6 if 0 means sunday and so on
	 */
	public static int calculateDayOfWeek(int day, int month, int year) 
	{
		int y1, x, m, d1;
		y1 = year - (14 - month) / 12;
		x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		m = month + 12 * ((14 - month) / 12) - 2;
		d1 = (day + x + 31 * m / 12) % 7;
		return d1;
	}
	
	

	/**
	 * Purpose: method for finding two string are anagram or not
	 * 
	 * @param str1 input from user
	 * @param str2 input from user
	 * @return true or false depending upon anagram or not
	 */
	public static boolean isAnagram(String str1, String str2) 
	{
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		if (str1.length() != str2.length()) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	/**
	 * Purpose: method for finding two Integer number are anagram or not
	 * 
	 * @param num1 input from user
	 * @param num2 input from user
	 * @return true or false depending upon anagram number or not
	 */
	public static boolean isIntAnagram(int num1, int num2) 
	{
		String str1,str2;
		str1=String.valueOf(num1);
		str2=String.valueOf(num2);
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		if (str1.length() != str2.length()) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) 
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Purpose: method for finding prime number or not
	 * 
	 * @param num input from user
	 * @return returns true if prime else not prime
	 */
	public static boolean isPrime(int num) 
	{
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	/**
	 * Purpose: method is check for palindrome number
	 * 
	 * @param num input taken
	 * @return return true is num is palindrome else false
	 */
	public static boolean isPalindrome(int num) 
	{
		int rem, sum = 0;
		int temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (temp == sum) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

 
	 
}
