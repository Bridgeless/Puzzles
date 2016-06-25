package com.griffith.puzzles;

public class TheGridSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1234567890  
//		0987654321  
//		1111111111  
//		1111111111  
//		2222222222  
//		
//		876543  
//		111111  
//		111111
		int twoDArr[][] = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
					   	   {0, 9, 8, 7, 6, 5, 4, 3, 2, 1},
					       {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
					       {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
					       {2, 2, 2, 2, 2, 2, 2, 2, 2, 2}
					      };
		int innerArr[][] = {{8, 7, 6, 5, 4, 3},
							{1, 1, 1, 1, 1, 1},
							{1, 1, 1, 1, 1, 1}
						   };
		if (twoDArr.length == 0 || innerArr.length == 0) {
            System.out.println("NO");
        }

        /* If subarray is larger than large array then not found */
        if (innerArr.length > twoDArr.length) {
            System.out.println("NO");
        }
        
        for(int i = 0; i < twoDArr.length; i++)
        {
        	for(int j = 0; j )
        }
		
		System.out.println(innerArr[1][0]);
	}

}
