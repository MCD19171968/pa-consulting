package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class BracketsMainTest {

	@Test
	public void test() {
		//Brackets brackets = new Brackets();
		
		char expr[] = "[(])".toCharArray(); 
		int n = expr.length; 
		equals("Not Balanced");
	
	}

}
