package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnitTest {

	@Test
	public void testConcatenate() {
		StringConcatenate stringConatenate = new StringConcatenate();

		String result = stringConatenate.concatenate("one", "two");

		assertEquals("onetwo", result);

	}

	@Test
	public void testConcatenate2() {
		StringConcatenate stringConatenate = new StringConcatenate();

		String result = stringConatenate.concatenate("three", "four");

		assertEquals("threefour", result);

	}

	@Test
	public void testConcatenateSpace() {
		StringConcatenate stringConatenate = new StringConcatenate();

		String result = stringConatenate.concatenate("one", "two");

		assertNotEquals("one two", result);

	}
	

}