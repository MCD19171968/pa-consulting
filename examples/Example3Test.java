package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class Example3Test {

	@Test
	public void test() {
		Example3 example = new Example3();
		String outcome = example.everyNth("Miracle", 2);
		assertEquals("Mrce", outcome);
	}

	@Test
	public void test1() {
		Example3 example = new Example3();
		String outcome = example.everyNth("abcdefg", 2);
		assertEquals("aceg", outcome);
	}

	@Test
	public void test3() {
		Example3 example = new Example3();
		String outcome = example.everyNth("abcdefg",3);
		assertEquals("adg", outcome);
	}

}
