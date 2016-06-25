package com.griffith.sumofprimes;

public class SumOfPrimes {

	public void SumThousandPrimes()
	{
		int totalNumOfSums = 0;
		int currNum = 0;
		int num = 0;
		int totalSum;
		
		while(totalNumOfSums < 1000)
		{
			for(int i = 2; i < currNum; i++)
			{
				if(currNum%i == 0)
				{
					totalNumOfSums++;
				}
			}
		}
		
		
		
		
	}
}
