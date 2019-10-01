/**
 * write a program for pallindrome checker
 * @author swapna k.
 */
package com.bridgelabz.dsprogram;
import com.bridgelabz.utility.DataStructurUtility;

public class PallindromeChecker 
{
	public static void main(String args[])
	{
	
	int count=0,size=0;
	DataStructurUtility<String> list = new DataStructurUtility<String>();
	System.out.println("Eneter string : ");
	String palindromString = list.scanString();
	
	System.out.println("String is : " + palindromString);
	String[] string = palindromString.split("");
	 
	 for(String str:string) // foreach
	 {
		 
		 list.addRear(str); 
	 }
	
    /*for(int i=0;i<string.length;i++) 
    { 
    	list.addRear(string[i]); 
    }*/
    
	int length = string.length/2;
	size=length;
	list.printDeque();
	System.out.println();
	for(int i=0;i<length;i++) 
	{
		if(size==-1) 
		{
			break;
		}
		if(list.peekFront().equals(list.peekRear()))  
		{
			count++;
		}
		size--;
		if(size>=1) 
		{
		list.removeFront();
		}
		if(size>=1) 
		{
		list.removeRear();
		}	
	}
	
	if(count==length)
	{
		System.out.println(palindromString+" : String is palindrom");
	}
	else 
	{
		System.out.println(palindromString+" : String is not palindrom");
	}

   }
}
