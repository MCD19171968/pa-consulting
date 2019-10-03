package uk.ac.belfastmet.examples;

import java.util.Arrays;

public class Brackets {
	
	private String Balance;

	public static char findClosing(char c) 
	{ 
		if (c == '(') 
			return ')'; 
		if (c == '{') 
			return '}'; 
		if (c == '[') 
			return ']'; 
		return Character.MIN_VALUE; 
	} 

	public static boolean check(char expr[], int n) 
	{ 
		if (n == 0) 

			return true; 
		if (n == 1) 

			return false; 
		if (expr[0] == ')' || expr[0] == '}' || expr[0] == ']') 

			return false; 

		//closing
		char closing = findClosing(expr[0]); 
		
		//count to match the closing
		int index, count = 0; 

		for (index = 1; index < n; index++) { 
			if (expr[index] == expr[0]) 
				count++; 
			if (expr[index] == closing) { 
				if (count == 0) 
					break; 
				count--; 
			} 
		} 
		
		//if no closing found
		if (index == n) 
			return false; 
		
		// if closing next to open
		if (index == 1) 
			return check(Arrays.copyOfRange(expr, index + 1, n), n - 2); 
		
		//if close in middle
		return check(Arrays.copyOfRange(expr, 1, n), index - 1) && check(Arrays.copyOfRange(expr, (index + 1), n), n - index - 1); 
	} 



}







