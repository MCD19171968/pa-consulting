package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void test() {
		Palindrome palindrome = new Palindrome();
		boolean outcome = palindrome.isPalindrome("hannah");
		assertEquals(true, outcome);

	}

	@Test
	public void test2() {
		Palindrome palindrome = new Palindrome();
		boolean outcome = palindrome.isPalindrome("michael");
		assertEquals(false, outcome);
	}

}
