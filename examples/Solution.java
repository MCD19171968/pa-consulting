package uk.ac.belfastmet.examples;

public class Solution {
	  static int number = 10;
	  
	  public int solution(int number) {
	   int sum = 0;
	    //looping through numbers 0 - 10
	    for (int index = 0; index < number; index++){
	      //checking multiples of 3 and 5
	      if ((index % 3 == 0) && (index % 5 == 0)){
	  
	      //sum of multiples
	       sum += index;  
	      }
	    }
	    //return sum
	      return sum;
	       
	      
	        
	    

	  }
	}