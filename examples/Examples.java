package uk.ac.belfastmet.examples;

import java.util.ArrayList;

public class Examples {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Examples examples = new Examples();

		boolean outcome = examples.returnSomething();
		System.out.println("The outcome was " + outcome);

		int number = examples.returnNumber();
		System.out.println("The number is " + number);

		String output = examples.returnString();
		System.out.println(output);

		int a = examples.returnMultipleInt();
		System.out.println("2 x 4 = " + a);

		ArrayList <String> words = examples.returnArrayList();
		System.out.println(words);
	}

	/**
	 * 
	 * @return boolean
	 */
	public boolean returnSomething() {
		boolean result = false;
		return result;
	}
	/**
	 * 
	 * @return int
	 */
	public int returnNumber() {
		int number = 42;
		return number;
	}
	/**
	 * 
	 * @return string
	 */
	public String returnString(){
		String output  = "Hello world";
		return output;
	}
	/**
	 * 
	 * @return int
	 */
	public int returnMultipleInt() {
		int a = 2 * 4;
		return a;

	}
	/**
	 * 
	 * @return array list
	 */
	public ArrayList <String> returnArrayList() {
		ArrayList <String> words = new ArrayList <String>();
		words.add("Hello");
		words.add("World");
		return words;

	}




}
