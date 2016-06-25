package com.griffith.stringreverse;


public class Solution {
    public String reverseString(String s) {
        char[] charArray = s.toCharArray();
        String revString = "";
        for(int i = charArray.length -1; i >= 0; i--)
        {
        	revString = revString.concat(Character.toString(charArray[i]));
        }
        return revString;    
    }  
    
    public static String reverseIt(String source) {
        StringBuilder dest = new StringBuilder();

        for (int i = source.length() - 1; i >= 0; i--){
            dest.append(source.charAt(i));
        }

        return dest.toString();
    }

}