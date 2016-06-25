package com.griffith.puzzles;

import java.util.Scanner;

public class AngryProfessor {

//	2
//	4 3
//	-1 -3 4 2
//	4 2
//	0 -1 2 1
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int tests = scan.nextInt();
		
		int currTest = tests;
		
		while(currTest > 0)
		{
			int students = scan.nextInt();
			int thresh = scan.nextInt();
			int onTime = 0;
			
			for(int i = 0; i < students; i++)
			{
				if(scan.nextInt() <= 0)
				{
					onTime++;
				}
			}
			if(onTime >= thresh)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
			currTest--;
		}
		scan.close();
	}
}
