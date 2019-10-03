package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCatTest {

	@Test
	public void test() {
		String result =	StringCat.concatenate("word", "Word1");
		assertEquals("wordWord1", result);

	}

}
