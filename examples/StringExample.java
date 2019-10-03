package uk.ac.belfastmet.examples;

public class StringExample {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		StringExample stringExample = new StringExample();
		stringExample.firstCharacter();
		stringExample.startCharacter();
		stringExample.endCharacter();
		stringExample.subCharacter();
		stringExample.containsString();
		stringExample.indexString();
		stringExample.splitString();
		stringExample.upperString();
		stringExample.lowerString();

	}

	// no return
	public void firstCharacter() {
		String name = "Michael";
		char letter = name.charAt(2);
		System.out.println(letter);
	}
	// no return
	public void startCharacter() {
		String name = "Michael";
		boolean startWith = name.startsWith("Mic");
		if(startWith) {
			System.out.println("It starts with the character");
		}
		else {
			System.out.println("False");
		}
	}
	// no return
	public void endCharacter() {
		String name = "Michael";
		boolean endsWith = name.endsWith("Mic");
		if(endsWith) {
			System.out.println("It ends with the character");
		}
		else {
			System.out.println("False");
		}
	}
	// no return
	public void subCharacter() {
		String name = "Michael";
		String subCharacter = name.substring(2, 4);
		System.out.println(subCharacter);
	}
	// no return
	public void containsString() {
		String name = "Michael";
		boolean contains = name.contains("ae");
		if(contains) {
			System.out.println("It contains ... ");
		}
	}
	// no return
	public void indexString() {
		String name = "Michael";
		int index = name.indexOf("Mi");
		System.out.println("Index of " + index);
	}
	// no return
	public void splitString() {
		String sentence = "I am a String";
		String[] strings = sentence.split(" ");
		System.out.println("Length is: " + strings.length);
		for(int index = 0; index < strings.length; index++) {
			System.out.println(strings[index]);
		}
	}
	// no return
	public void upperString() {
		String sentence = "I am a string";
		sentence = sentence.toUpperCase();
		System.out.println("upper case sentence: " + sentence);
	}
	// no return
	public void lowerString() {
		String sentence = "I am a string";
		sentence = sentence.toLowerCase();
		System.out.println("lower case sentence: " + sentence);
	}

}
