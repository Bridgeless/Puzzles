package com.griffith.allchallenges;

import java.util.Scanner;

public class Day06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numStrings = scan.nextInt();
		
		
		for(int i = 0; i < numStrings; i++)
		{
			String text = scan.next();
			StringBuilder evenStr = new StringBuilder();
			StringBuilder oddStr = new StringBuilder();
			for(int j = 0; j < text.length(); j++)
			{
				
				if(j % 2 == 0)
				{
					evenStr.append(text.charAt(j));
				}
				else
				{
					oddStr.append(text.charAt(j));
				}
				
			}
			System.out.println(evenStr + " " + oddStr);
		}
	}
}
