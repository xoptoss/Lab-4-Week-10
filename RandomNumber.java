package mainPackage;

import java.util.Random;

public class RandomNumber {

	int answer,high,low,newHigh,newLow;
	Random random = new Random();
	
	public RandomNumber(int newHigh)
	{
		high=newHigh;
	}
	public RandomNumber(int newHigh,int newLow)
	{
		high=newHigh;
		low=newLow;
	}
	public int GetANumber()
	{
		answer = random.nextInt(high-low)+low;
		return answer;	
	}
	public int setHighNumber(int newHigh)
	{
		high = newHigh;
		return high;
	}
	public int GetHighNumber()
	{
		return high;
	}
	public int GetLowNumber()
	{
		return low;
	}
}

