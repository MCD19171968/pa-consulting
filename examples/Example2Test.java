package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class Example2Test {

	@Test
	public void tempTest1() {
		Example2 example2 = new Example2();

		boolean result = example2.icyHot(120, -1);

		assertEquals(true, result);

	}
	
	@Test
	public void tempTest2() {
		Example2 example2 = new Example2();

		boolean result = example2.icyHot(-1, 120);

		assertEquals(true, result);

	}

	@Test
	public void tempTest3() {
		Example2 example2 = new Example2(); 

		boolean result = example2.icyHot(2, -120);

		assertEquals(false, result);

	}
}
