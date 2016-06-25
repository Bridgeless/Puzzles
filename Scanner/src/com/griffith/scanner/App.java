package com.griffith.scanner;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner fromKey = new Scanner(System.in);
		System.out.print("Input a list size: ");
		int size = fromKey.nextInt();
	    int[] numbers = new int[size];
	    System.out.println("Please enter a list of numbers: ");
	    int total = 0;

	    for (int i = 0; i < numbers.length; i++)
	    {
	        numbers[i] = fromKey.nextInt();
	    }
		fromKey.close();

	    for (int i = 0; i < numbers.length; i++)
	    {
	        total += numbers[i];
	    }
	    System.out.println(total);
	}

}
