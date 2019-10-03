package uk.ac.belfastmet.examples;

public class Test12 {
	static String braces = "{[()]}";
	  //counts number of not opening and closing bracket 
	  public static Integer numberOfBracePairs( String braces ) {
	   
	    int braceNum = 0;
	    int openCurly = 0;
	    int closeCurley = 0;
	    int openBrace = 0;
	    int closeBrace = 0;
	    int openSquare = 0;
	    int closeSquare = 0;
	    
	    for(int index = 0; index < braces.length(); index++){
	      if(braces.charAt(index) == '{'){
	        openCurly++;
	     }
	      else if(braces.charAt(index) == '}'){
	       closeCurley++;
	      }
	      else if(braces.charAt(index) == '('){
	       openBrace++;
	      }
	    else if(braces.charAt(index) == ')'){
	       closeBrace++;
	      }
	  else if(braces.charAt(index) == '['){
	       openSquare++; 
	      }
	else if(braces.charAt(index) == '['){
	       closeSquare++;
	      }
	    }
	    if(openCurly == closeCurley && openBrace && openSquare == closeSquare){
	      braceNum = 1;
	    }
	return braceNum;
	  }
}
