package com.griffith.wcs4;

import java.util.Scanner;

public class MinDistances {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        if(n <= 1)
        {
        	System.out.println("-1");
        }
        else
        {
	        int A[] = new int[n];
	        for(int A_i=0; A_i < n; A_i++)
	        {
	            A[A_i] = in.nextInt();
	        }               
        
	        int minimumDistance = -1;
	        for(int i = 0; i < n; i ++)
	        {        	
	        	for(int j = i+1; j < n; j++)
	        	{
	        		if(A[i] == A[j] && minimumDistance == -1)
	        		{
	        			minimumDistance = j - i;
	        		}
	        		else if(A[i] == A[j] && minimumDistance > j - i)
	        		{
	        			minimumDistance = j - i;
	        		}
	        	}
	        }
	        System.out.println(minimumDistance);	
        }
    }

}
