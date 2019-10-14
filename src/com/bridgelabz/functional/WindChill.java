/******************************************************************************
 *  Purpose: Program is for calculating wind chill
 *  
 *  @author  swapna khairnar
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.FunctionalUtility;

public class WindChill 
{

	public static void main(String[] args)
	{
		FunctionalUtility utility = new FunctionalUtility();

		double windspeed, temperatureInFahrenheit = 0, windChill;
		temperatureInFahrenheit = Double.parseDouble("40");

		windspeed = Double.parseDouble("60");

		windChill = utility.CalculateWindChill(temperatureInFahrenheit, windspeed);
		System.out.println("By Calculating wind chill is: " + windChill);
	}

}
