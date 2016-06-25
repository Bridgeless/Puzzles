package com.griffith.puzzles;

import java.io.*;
import java.util.*;

public class AVeryBigSum {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		long[] longArr = new long[size];
		long total = 0;

		for (int i = 0; i < size; i++) {
			longArr[i] = scan.nextLong();
		}

		for (int i = 0; i < size; i++) {
			total += longArr[i];
		}
		System.out.println(total);
	}
}
