package uk.ac.belfastmet.examples;

public class BracketsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		char expr[] = "[(])".toCharArray(); 
		int n = expr.length; 

		if (Brackets.check(expr, n)) 
			System.out.println("Balanced"); 
		else
			System.out.println("Not Balanced"); 
		
		
		char expr1[] = "[()]".toCharArray(); 
		int n1 = expr.length; 

		if (Brackets.check(expr1, n1)) 
			System.out.println("Balanced"); 
		else
			System.out.println("Not Balanced");

	} 


}




