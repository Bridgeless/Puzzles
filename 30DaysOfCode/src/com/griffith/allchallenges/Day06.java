package com.griffith.allchallenges;

import java.util.Scanner;

public class Day06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numStrings = scan.nextInt();
		String[] stringArr = new String[numStrings];
		
//		System.out.println(scan.next().length());
		String text = scan.next();
		for(int i = 0; i < numStrings; i++)
		{
//			stringArr[i] = scan.next();
			for(int j = 0; j < text.length(); j++)
			{
				System.out.println(text.charAt(j));
			}
		}
//		
//		for(int i = 0; i < numStrings; i ++)
//		{
//			for(int j = 0; j < stringArr[i].length(); j++)
//			{
//				
//			}
//		}
		
		
//		System.out.println(numStrings + " " + stringArr[0] + " " + stringArr[1] );
	}

}
