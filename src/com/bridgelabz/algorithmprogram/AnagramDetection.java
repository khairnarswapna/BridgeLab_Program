package com.bridgelabz.algorithmprogram;
import java.util.*;
import com.bridgelabz.utility.AlgorithmUtility;

public class AnagramDetection 
{
	public static void main(String[] args) 
	{
		AlgorithmUtility utility = new AlgorithmUtility();
		String str1, str2;
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter the string 1");
		str1=sc.nextLine();
		System.out.println("Enter the string 2");
		str2=sc.nextLine();
		boolean IsAnagram=utility.isAnagram(str1,str2);
		if(IsAnagram) 
		{
			System.out.println("Two String are Anagram");
		}
		else 
		{
			System.out.println("Two String are not Anagram");
		}
		sc.close();
	}
}
