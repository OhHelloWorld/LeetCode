package com.leetcode.low_case;

import java.util.Arrays;

public class MyLowerCase {
	
	static String input = "AbCdeF";
	
	public static void main(String[] args) {
	tolowerCase(input);
	}

	private static void tolowerCase(String input2) {
		char[] charArray = input2.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]<='Z'&&charArray[i]>='A')
				charArray[i]= (char) (charArray[i]+32);
		}
		
		

		System.out.println(String.valueOf(charArray, 0, charArray.length));
	}

}
