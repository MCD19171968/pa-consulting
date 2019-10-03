package uk.ac.belfastmet.examples;

public class Example3 {
	public static void main(String[] args) {
		Example3 example = new Example3();

		String outcome = example.everyNth("Miracle", 2);
		String outcome1 = example.everyNth("abcdefg", 2);
		String outcome2 = example.everyNth("abcdefg", 3);

		System.out.println(outcome);
		System.out.println(outcome1);
		System.out.println(outcome2);

		if(outcome.equalsIgnoreCase("mrce") && outcome1.equalsIgnoreCase("aceg") && outcome2.equalsIgnoreCase("adg")) {
			System.out.println("sucess");
		}else {
			System.out.println("Not sucess");
		}

	}

	public String everyNth(String made, int N ) {

		String newString = "";

		for (int index = 0; index < made.length(); index+=N) {
			newString+= made.charAt(index);			
		}

		return newString;

	}

}
