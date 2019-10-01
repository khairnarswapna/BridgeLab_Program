/******************************************************************************
 *  Purpose:Implementation of cash counter program 
 *  @author swapna khairnar
 *
 ******************************************************************************/

package com.bridgelabz.dsprogram;
import com.bridgelabz.utility.DataStructurUtility;

public class CashCounter 
{

	public static void main(String[] args) 
	{
		
		DataStructurUtility<String> list = new DataStructurUtility<String>();
		
		System.out.println("Enter bank Amount : ");
        int BAmount=list.scanInt();
        System.out.println("Bank  Amountis : "+BAmount);
        int Userchoice;
       
        //boolean flag=true;
        System.out.println("how much people in cash counter queue: ");
        int people=list.scanInt();
        
        System.out.println("enter people in queue : ");
        for(int i=1;i<=people;i++) 
        	
        {
        	list.enqueue(list.scanString());
        }
        
        int size = list.getListSize();
        
        for(int i=1;i<=size;i++) 
        {
        	 System.out.println("peoples are in front of cash counter");
        	 list.printQueue();  //printing queue
        	  
        
        do
        { 
        	 
        	 int amount;
        	 System.out.println("bank amount is : "+BAmount);
        	 System.out.println("===================================================");
        	 System.out.println("\nHi "+list.peekQueue());
        	 System.out.println("Enter your choice \n1.cash deposit\n2.cash withdraw\n3.exit from queue");
        	 Userchoice=list.scanInt();
  
        	switch(Userchoice) 
        	{
        		case 1:
        		     System.out.println(list.peekQueue()+" Please Enter how much amount you want deposit : ");
        			 amount = list.scanInt();
        			 BAmount=BAmount+amount;
        		     break;
          	   case 2: 
        		      System.out.println(list.peekQueue()+" Please Enter how much amount you want withdraw : ");
        		      amount = list.scanInt();
        		      BAmount=BAmount-amount;
        		   break;
        	case 3:
        		  
        		   list.dequeue();
        		 
        		   break;
            default :
        	         System.exit(0);
        	        
        	       
        	}
        	
            System.out.println();
            
        }while(Userchoice!=4);
        	
        System.out.println("bank amount is : "+BAmount);
         list.printQueue();
        System.out.println();
        
      }
        
	}

}
