package uk.ac.belfastmet.examples;

public class Palindrome {
/**
 * String name created 
 * @param args
 */
	public static void main(String[] args) {
		
		Palindrome palindrome = new Palindrome();

		boolean outcome = palindrome.isPalindrome("hannah");
		System.out.println(outcome);
		
		boolean outcome2 = palindrome.isPalindrome("michael");
		System.out.println(outcome2);

	}
/**
 * check a string and check a string in reverse
 * @param name
 * @return boolean
 */
	public boolean isPalindrome(String name) {

		StringBuilder reverse = new StringBuilder(name).reverse();

		return (reverse.toString()).equals(name);
	}



}
