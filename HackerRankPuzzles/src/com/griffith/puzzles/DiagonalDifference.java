package com.griffith.puzzles;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
//		3
//		11 2 4
//		4 5 6
//		10 8 -12
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int inputArr[][] = new int[size][size];
		int primDiag = 0;
		int secDiag = 0;
		int secTrack = size;
		
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				inputArr[i][j] = scan.nextInt();
			}
		}
		scan.close();
		
		
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				if(i == j)
				{
					primDiag += inputArr[i][j];
				}
				if(j == secTrack - 1)
				{
					secDiag += inputArr[i][j];
					secTrack--;
				}
			}
		}
		System.out.println(Math.abs(primDiag - secDiag));

	}

}
