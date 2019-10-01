/******************************************************************************
 *  Purpose: This is utility file which contains logic for files.
     this file is having methods who can take input process it according to process it
     
     @author swapna khairnar.
    
 ******************************************************************************/

package com.bridgelabz.utility;

import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class Utility {

    static Scanner scanner=new Scanner(System.in);
	
    /**
     * purpose : create function to Accept the integer values from user
     * 
     * @return : value return integer value
     */
    
    public static int scanInt() {
      int value = scanner.nextInt();
	return value;
	}

    /**
     * purpose : create function to Accept the String values from user 
     * @return : value return String value
     */
    
    public static String scanString() 
    {
    	String value = scanner.next();
    	return value;
    }
    public static double scanDouble() {
    	double value=scanner.nextDouble();
    	return value;
    }
 

	

	/**
	 * purpose : This function used to find the leap year 
	 * @param year any one year
	 * @return :return true or false
	 */
	
	public static boolean leapYear(int year) 
	{
 
       
		if((year%400)==0) 
         {
     
        	return true;
         }
		else if ((year%4)==0) 
		{

			return true;
		}
		else 
		{
			 return false;
		}
        
       
		
	}

	/**
	 * purpose : this fuction used to calculate power of two
	 * @param number range of power
	 */
	public static void powerOfTwo(int number) {
		
		 int[] powerOfTwo=new int[number];
	     int sum=1;
	     for(int i=1;i<powerOfTwo.length;i++)
			{
				sum=sum*2;
				powerOfTwo[i]=sum;
			}
	     
		for(int i=1;i<powerOfTwo.length;i++)
		{
			//if((i%2)==0)
			System.out.println("2^"+i+"="+powerOfTwo[i]);
		}
	}

	/**
	 * purpose : this function used to calculate harmonic number
	 * 
	 * @param number : range of harmonic number
	 * @return : return harmonic value
	 */
	public static double harmonicNumber(double number) {
		
		double harmonicNumber=0;
		
		for(double i=1;i<=number;i++)
		{
			harmonicNumber=harmonicNumber+(1/i);
			//System.out.println(harmonicNumber);
		}
		return harmonicNumber;
	}

	/**
	 * purpose : This function is used to calculate head verses tail percentage  
	 * 
	 * @param number : How much time coin flip
	 */
	public static void flipCoin(int number) {
		double head=0,tail=0;
		float x;
		for(int i=0;i<number;i++)
		{
			x=(float)(Math.random());
			if(x>0.5)
			{
				head++;
			}else {
				tail++;
			}
		}
		
		System.out.println("head verses tail percentage");
		System.out.println("head percentage : "+((head/number)*100));
		System.out.println("tail percentage : "+((tail/number)*100));
		
	}
	

	/**
	 * @param stake : invested amount
	 * @param goal :  goal of amount
	 * @param trails: how much time you play
	 */
	public static void gamlingSimulation(int stake, int goal, int trails) {
		
		double winPercentage;
		 int win=0;
		
		 for(int i=0;i<trails;i++)
		 {
			 int cash=stake;
			 while(cash>0 && cash<goal) {
				
			 if(Math.random()<0.5)
			 {
				 cash++;
			 }else
			 {
				 cash--;
			 }
			 }
			 if(cash==goal) {
				 win++;
			 }
		 }
		 winPercentage=100.0*win/trails;
		 System.out.println("How much time win : "+win+" number of trails : "+trails);
		 System.out.println("win percentage : "+winPercentage);
		
		
	}

	/**
	 * purpose : this methode used to replace string
	 * 
	 * @param changeUser : array of string 
	 * @param name : user name
	 * @return : return user replace String
	 */
	public static String replaceString(String[] changeUser, String name) {
		String add="";
		for(int index=0;index<changeUser.length;index++) {
			if(changeUser[index].equals("UserName")) {
				changeUser[index]=name;
			}
		}
		for(int index=0;index<changeUser.length;index++) {
			add=add+changeUser[index]+" ";
		}

		//System.out.println(add);
		return add;
	}

	/**
	 * purpose : this fuction calculate coupon number
	 * @param number : number of cards
	 * @return : generated random number count
	 */
	public static int collect(int number) {
		 boolean[] isCollected = new boolean[number];  
	        int count = 0;                         
	        int distinct  = 0;                       
              Random random = new Random();
            number=number-1;
	        
	        while (distinct < number) {
	           
	           int value = 0+random.nextInt(number);
	        	count++;                             
	            if (!isCollected[value]) {          
	                distinct++;
	                isCollected[value] = true;
	            }
	        }
	        return count;
		
	}
	
	/**
	 *  purpose : This function calculate EuclideanDistance
	 * 
	 * @param firstValue  power of first value
	 * @param secondValue power of second value
	 * @return result
	 */
	public static int EuclideanDistance(int firstValue, int secondValue) {
		int result;
		result = (int) Math.sqrt(Math.pow(firstValue, 2)+Math.pow(secondValue, 2));
		return result;
	}

	
	/**
	 * purpose : This function is used quadratic equation
	 * 
	 * @param fistQuadraticValue    fistQuadraticValue for quadratic equation
	 * @param secondQuadraticValue  secondQuadraticValue for quadratic equation
	 * @param thirdQuadraticValue   thirdQuadraticValue for quadratic equation
	 */
	public static void quadratic(double fistQuadraticValue, double secondQuadraticValue, double thirdQuadraticValue) {
		double delta=Math.pow(secondQuadraticValue,2) - 4*fistQuadraticValue*thirdQuadraticValue;
		
		 if(delta > 0){
	            System.out.println("Roots are " + (-secondQuadraticValue+Math.sqrt(delta))/(2*fistQuadraticValue) + " and " + (-secondQuadraticValue-Math.sqrt(delta))/(2*fistQuadraticValue));
	        }else if (delta== 0){
	            System.out.println("Roots are " + -secondQuadraticValue/(2*fistQuadraticValue));
	        }
	        else{
	            System.out.println("Roots are " + -secondQuadraticValue/(2*fistQuadraticValue) + "+i" +Math.sqrt(-delta)/(2*fistQuadraticValue) + " and "+ -secondQuadraticValue/(2*fistQuadraticValue) + "-i" + Math.sqrt(-delta)/(2*fistQuadraticValue));
	        }
		
	}

	/**
	 * purpose : This function calculate National Weather Service
	 * 
	 * @param temperature 
	 * @param speed  
	 * @return result the result of weather
	 */
	public static double windChill(double temperature, double speed) {
		 double result=0;
		 if(temperature<50 && (speed<120 && speed>3)) {
			 result = 35.34+0.6215*temperature+(0.4275-35.75)*Math.pow(speed,0.16);
			return result;
		 }
	     else {
	    	 return result;
	    //	 System.out.println("the formula is not valid if temperatur is larger than 50 and if speed is larger than 120 or less than 3");
	    	 
	   }
  }
	
	/**
	 * Purpose : This function used to find the prime fator of number
	 * 
	 * @param number : prime factorization number
	 */
	public static void primeFactor(int number) {
		for(int primeFactor=2;primeFactor<number;primeFactor++) {
			while(number%primeFactor==0) {
				System.out.print(primeFactor+" ");
				number=number/primeFactor;
			}
		}
		if(number>2) {
			System.out.print(number);
		}
		
	}

	/**
	 * purpose : this fuction used for three number addition is zero or not 
	 *
	 * @param array : integer array value 
	 */
	public static void sumOfResultZero(int[] array) {
        int sum=0; 
		for(int i=0;i<array.length;i++) {
			
			for(int j=0;j<array.length;j++) {
				
				for(int k=0;k<array.length;k++) {
					sum=0;
					if(i!=j && i!=k && j!=k) {
						sum=array[i]+array[j]+array[k];
						
						if(sum==0)
						{
							System.out.println(array[i]+" "+array[j]+" "+ array[k]);
						}
					}
					
				}
				
			}
		}
		
	}

	/**
	 * purpose : this function used elapsetime calculation
	 * 
	 * @return : epapsetime of system
	 */
	public static double stopWatch() {
		double elapsetime = 0;
		System.out.println("Enter 0 to start stopwatch");
		int start=Utility.scanInt();
		long startTime=0;
		long stopTime=0;
		
		if(start==0)
		{
			startTime=System.currentTimeMillis();
			System.out.print("Start timing is : ");
			System.out.println(startTime);
		}
		System.out.println("Enter 1 to stop stopwatch");
		int stop=Utility.scanInt();
		
		if(stop==1)
		{
			stopTime=System.currentTimeMillis();
			System.out.print("stop timing is : ");
			System.out.println(stopTime);
            elapsetime=(stopTime-startTime);
            System.out.println("Elapsetime : "+elapsetime);
		}

		return elapsetime;
	}

	/**
	 * purpose : This function find out day of week
	 * 
	 * @param  day    day of month
	 * @param  month  month of year
	 * @param  year   which one year
	 * @return day1  day of week 
	 */
	public static int dayOfWeek(int day, int month, int year) {
		
		  int day1,month1,year1;
		  int year3;//find leap year or not
		  year1=year-(14-month)/12;
		  year3=year1+year1/4-year1/100+year1/400;
		  month1=month+12*((14-month)/12)-2;
		  day1=(day+year3+(31*month1)/12)%7;
		
		  return day1;
	}



	
		
}
