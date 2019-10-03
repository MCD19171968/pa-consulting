package uk.ac.belfastmet.examples;

public class StringCat {

	private String word;
	private String word1;
	
	public static String concatenate(String word, String word1) {
	return word + word1;
	}
	
	public StringCat(String word, String word1) {
	super();
		this.word = word;
		this.word1 = word1;
		
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getWord1() {
		return word1;
	}

	public void setWord1(String word1) {
		this.word1 = word1;
	}
	
	public static String getConcatenate;
	
	
}
