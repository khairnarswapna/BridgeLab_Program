package com.bridgelabz.dsprogram;
import java.io.IOException;
 

import com.bridgelabz.utility.DSutility;
import java.io.IOException;
import java.util.Scanner;
import com.bridgelabz.dstype.LinkedList;
import com.bridgelabz.files.*;
public class OrderedList 
{

	public static void main(String[] args) 
	{
		DSutility utility = new DSutility();
		LinkedList<Integer> list = new LinkedList<Integer>();
		String[] strArr = null;

		try {
			strArr = utility.readFile(
					"/home/admin-1/eclipse-workspace/javaProgram/src/com/bridgelabz/files/number.txt")
					.split(",");

		} catch (IOException e) {
			e.printStackTrace();
		}
		int[] intArr = new int[strArr.length];
		
		for (int i = 0; i < strArr.length; i++) 
		{
			intArr[i] = Integer.parseInt(strArr[i]);
			list.add(intArr[i]);
		}
		int size = intArr.length;
		
		list.display();
		System.out.println("\nSorting");
		list.sort(size);
		list.display();
		System.out.println("\nEnter key to search in list:");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		
		size = list.searchNode(key, size);
		scanner.close();
		System.out.println("\nSorting");
		list.sort(size);
		list.display();
		
		 
		try {
			utility.writeFile("/home/admin-1/eclipse-workspace/javaProgram/src/com/bridgelabz/files/numoutput.txt",list.returnListInString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
