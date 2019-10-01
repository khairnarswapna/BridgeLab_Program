package com.bridgelabz.algorithmprogram;
import java.util.*;

public class FindYourNumber 
{
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enetr number : ");
		int number=scanner.nextInt();
		int sum=1;

		for(int i=0;i<number;i++)
		{
		     sum=sum*2;	
		}
		 
		int number1=sum-1;
		System.out.println("sum of the number : "+number1);
		System.out.println("Enter your key");
		int key= scanner.nextInt();

		   binay(key, 0, number1, number);
			}

			public static void binay(int key,int start,int last,int number) {
				
				int mid=(start+last)/2;
				int count=1;
				int flag=1;

				while(flag==1 && start<=last && count<=number) {
					
					System.out.println("It is your number : "+mid);
					System.out.println("Enetr ypour choice : \n1 No than enter n:     \n2: yes than enter y");
					
					String s=scanner.next();
					char p=s.charAt(0);
					
					switch(p) {
					case 'n' :
					
					if(mid==key)
					{
						System.out.println("number is found : "+mid);
						
					}
					else if(mid<key)
					{
						start=mid+1;
					}
					else
					{
						last=mid-1;
					}
					mid=(start+last)/2;
					count++;
				
				break;
					case 'y' :
						System.out.println("number is found : "+mid);
						flag=0;
					
					break;
			}
					
				}
				if(start>last)
				{
					System.out.println("number is not found : ");
					
				}
			}		

}
