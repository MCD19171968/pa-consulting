package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class BadXTest {

	@Test
	public void testMain() {
		BadX badX = new BadX();
		boolean outcome = badX.hasBad("badxx");
		assertEquals(true, outcome);
	}

	@Test
	public void testMain2() {
		BadX badX = new BadX();
		boolean outcome = badX.hasBad("xbadxx");
		assertEquals(true, outcome);
	}

	@Test
	public void testMain3() {
		BadX badX = new BadX();
		boolean outcome = badX.hasBad("xxbadxx");
		assertEquals(false, outcome);
	}



}
