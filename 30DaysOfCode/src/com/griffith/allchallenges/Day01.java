package com.griffith.allchallenges;

import java.util.Scanner;

public class Day01 {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int inputInt = 0;
		double inputDoub = 0;
		String inputStr = "";
		/* Read and save an integer, double, and String to your variables. */
		inputInt = scan.nextInt();
		inputDoub = scan.nextDouble();
		scan.nextLine();
		inputStr = scan.nextLine();
		/* Print the sum of both integer variables on a new line. */
		System.out.println(i + inputInt);
		/* Print the sum of the double variables on a new line. */
		System.out.println(d + inputDoub);
		/*
		 * Concatenate and print the String variables on a new line; the 's'
		 * variable above should be printed first.
		 */
		System.out.print(s + inputStr);
		scan.close();
	}

}
