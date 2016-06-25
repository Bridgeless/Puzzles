package com.griffith.sampletest;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static void StairCase(int n) {
		int hash = 1;
		int space = n - 1;
		for (int x = 0; x < n; x++) {

			for (int i = 0; i < space; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < hash; i++) {
				System.out.print("#");
			}
			System.out.println();
			hash++;
			space--;
		}
	}
	
	
	static int sum(int[] numbers) {
		int size = numbers[0];
		int total = 0;
		for(int i = 1; i < size + 1; i++)
		{
			System.out.println(numbers[i]);
			total = total + numbers[i];
		}
		return total;

    }

}
