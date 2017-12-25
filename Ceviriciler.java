package degiskenler;

import java.text.DecimalFormat;

public class Ceviriciler {
	
	public double fahrenheittoCelcius(double input)
	{
		return (input-32)*5/9 ;		
	}
	
	public double celciustofahrenheit(double input)
	{
		return (input*5/9)+32;
	}
	
	
	public double lbstoKilogram(double input)
	{
	return input/2.2046226218488;
	}
	
	
	public double kilogramtoLbs(double input)
	{
	 input = input*2.2046226218488;
	 return input;
	}
	
	public double inchstoCM(double input)
	{
	input=((input%100)*2.54)+((input/100)*30.48);
	
	return input;
	}
}
