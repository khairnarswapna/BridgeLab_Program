 
package com.bridgelabz.dsprogram;
import java.io.IOException;
import com.bridgelabz.dstype.LinkedList;
import java.util.Scanner;

 
import com.bridgelabz.utility.DSutility;
 

public class OrderedList 
{

	public static void main(String[] args) {
		DSutility utility = new DSutility();
		LinkedList<Integer> list = new LinkedList<Integer>();
		String[] strArr = null;

		try {
			strArr = (utility.readFile("/home/admin-1/eclipse-workspace/javaProgram/src/com/bridgelabz/files/number.txt").split(","));

		} catch (IOException e) {
			e.printStackTrace();
		}
		int[] integerArr = new int[strArr.length];
	 	for (int i = 0; i < strArr.length; i++) {
		//	integerArr[i] = Integer.parseInt(strArr[i]);
			list.add(Integer.parseInt(strArr[i]));
		}
		int size = integerArr.length;
	//	list.display();
		
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
		String str = list.returnListInString();
		try {
			utility.writeFile("/home/admin-1/eclipse-workspace/javaProgram/src/com/bridgelabz/files/numoutput.txt",
					str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
