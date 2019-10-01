/******************************************************************************
 *  Purpose: Program is written Replacing the username using regex.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   09-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class HelloUser 
{

	
	public static  String TEMPLATE="Hello UserName, How are you?";
	
	public static void main(String[] args) 
	{
		String username;
		Scanner  scanner= new Scanner(System.in);
		
	 
		System.out.println("Enter User name : ");
		username = scanner.nextLine();
		
		if(username.length()<3) 
		{  
			System.out.println("UserName lenght should be grater than 3");
			//return;
		}
		else 
		{
			//stringReplacer(username);
			System.out.println(TEMPLATE.replaceAll("UserName",username));
		}
		scanner.close();
	}
	
	 

	

}
