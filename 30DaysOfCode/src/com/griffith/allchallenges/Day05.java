package com.griffith.allchallenges;

import java.util.Scanner;

public class Day05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int inputInt = scan.nextInt();
		
		for(int i = 1; i <= 10; i++)
		{
			int result = inputInt*i;
			System.out.println(inputInt + " x " + i + " = " + result);
		}
		
//		System.out.println(inputInt);

	}

}
