package com.griffith.wcs4;

import java.util.HashSet;
import java.util.Scanner;

public class EqualStacks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		
		if(n1 <= 0 || n2 <= 0 || n3 <=0)
		{
			System.out.println(0);
		}
		else
		{
			int h1[] = new int[n1];
			for (int h1_i = 0; h1_i < n1; h1_i++) {
				h1[h1_i] = in.nextInt();
			}
			int h2[] = new int[n2];
			for (int h2_i = 0; h2_i < n2; h2_i++) {
				h2[h2_i] = in.nextInt();
			}
			int h3[] = new int[n3];
			for (int h3_i = 0; h3_i < n3; h3_i++) {
				h3[h3_i] = in.nextInt();
			}
			
	
			
			int[][] allHeights = new int[][]{h1, h2, h3};
			//Overwrite the arrays with all of their possible heights
			for(int i = 0; i < allHeights.length; i ++)
			{
				for (int j = allHeights[i].length - 1; j >= 0; j--) 
				{
					if (j == allHeights[i].length - 1) 
					{
						allHeights[i][j] = allHeights[i][j];
					} 
					else 
					{
						allHeights[i][j] = allHeights[i][j] + allHeights[i][j + 1];
					}
				}
			}
			//Compare the possible heights
			HashSet<Integer> set = new HashSet<Integer>();
			int tallest = 0;
			for (int i=0; i < allHeights.length; i++) 
			{	       
		        for (int j=0; j < allHeights[i].length; j++)
		        {
		            if (set.contains(allHeights[i][j]) && allHeights[i][j] > tallest)
		            {
		            	tallest = allHeights[i][j];
		            }
		            set.add(allHeights[i][j]);
		        }	        
		    }
			System.out.println(tallest);
		}
	}
}
