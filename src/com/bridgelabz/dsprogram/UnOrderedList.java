/**

 * 
 */
package com.bridgelabz.dsprogram;

import java.io.IOException;

import java.util.Scanner;

import com.bridgelabz.utility.DSutility;
import com.bridgelabz.dstype.LinkedList;
import com.bridgelabz.files.*;
public class UnOrderedList 
{
	public static void main(String[] args) 
	{
		DSutility utility = new DSutility();
		LinkedList<String> list = new LinkedList<String>();
		String[] strArray = null;
		try 
		{
			strArray = utility.readFile("/home/admin-1/eclipse-workspace/javaProgram/src/com/bridgelabz/files/Namelist.txt").split(" ");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		int size = strArray.length;
		for (int i = 0; i < strArray.length; i++) 
		{
			list.add(strArray[i]);
		}
		list.display();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter key to search");
		String key = scanner.next();
		    
		
		size = list.searchNode(key, size);
		list.display();
		
		//list.sort(size);

		try {
			utility.writeFile("/home/admin-1/eclipse-workspace/javaProgram/src/com/bridgelabz/files/Namelistoutput.txt",list.returnListInString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();
	}

}
