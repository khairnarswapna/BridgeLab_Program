package com.bridgelabz.dsprogram;

import java.io.IOException;


import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.dstype.HashMap;
import com.bridgelabz.utility.DSutility;

public class Hashchaining 
{
	static int[] arr;
	public static void main(String[] args) 
	{
		DSutility utility = new DSutility();
		HashMap<Integer, Integer> hashmap = new HashMap<Integer,Integer>();
		String readMessage = "";
		try 
		{
			readMessage = utility.readFile("/home/admin-1/eclipse-workspace/javaProgram/src/com/bridgelabz/files/hashtext.txt");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		String[] str = readMessage.split(",");
		arr = new int[str.length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Getting keys");
		for (int i = 0; i < arr.length; i++) 
		{
			hashmap.add(arr[i], arr[i]);
		}
		
		hashmap.display(); //printing the hashmap
		
		System.out.println("\nEnter key to search: ");
		Scanner scanner = new Scanner(System.in);
		
		int key = scanner.nextInt();
	
		if (hashmap.get(key) != null) 
		{
			hashmap.remove(key); 
		} 
		else 
		{
			hashmap.add(key, key);
		}
		scanner.close();
		hashmap.display();
		
		try 
		{
			utility.writeFile("/home/admin-1/eclipse-workspace/javaProgram/src/com/bridgelabz/files/hashoutput.txt",
					hashmap.returnListInString());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
