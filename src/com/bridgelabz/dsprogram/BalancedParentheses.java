/******************************************************************************
 *  Purpose: Implementation for BalancedParentheses 
    
    @author swapna khairnar
 *
 ******************************************************************************/

package com.bridgelabz.dsprogram;

import com.bridgelabz.utility.DataStructurUtility;

public class BalancedParentheses 
{

	
	public static void main(String[] args) 
	{
	 		 
    	DataStructurUtility<String> list = new DataStructurUtility<String>();	
		System.out.println("Enter Arithmatic Expression : ");
		String Expression=list.scanString();
	     
		String[] Expressions=Expression.split("");
		
 		for(int i=0;i<Expressions.length;i++)  
 		{
 			System.out.print(Expressions[i]);
		}
		int size=0;
        for(int i=0;i<Expressions.length;i++) 
        {
        	if(size==-1) 
        	{
        		break;
        	}
		    if(Expressions[i].equals("(")) 
 		    {
     		     list.push(Expressions[i]); //push into stack
    		     size++;  
        	}
    	   else if(Expressions[i].equals(")"))
 		   {		    	
    		   if(size>=1) 
		    	{
		    		list.pop(); //pop the element expression from the Stack
		    	}
		    	size--;
		    	System.out.println();	
 	    }
       
        }
       if(size==0) 
       {
        	System.out.println("parentheses is balanced");
        
       }
       else 
       {
         	System.out.println("parentheses is not balanced");
       }
	}

}
