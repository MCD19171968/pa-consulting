package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class MiddleTwoTest {
	
	@Test
	/**
	 * "ri" expected result should match outcome 
	 */
	public void testMiddle() {
		MiddleTwo middleTwo = new MiddleTwo();
		String outcome = middleTwo.middle("string");
		assertEquals("ri", outcome);
	}
	
	@Test
	/**
	 * "od" expected result should match outcome
	 */
	public void testMiddle1() {
		MiddleTwo middleTwo = new MiddleTwo();
		String outcome = middleTwo.middle("code");
		assertEquals("od", outcome);
	}
	
	@Test
	/**
	 *  "ct" expected result should match outcome
	 */
	public void testMiddle2() {
		MiddleTwo middleTwo = new MiddleTwo();
		String outcome = middleTwo.middle("practice");
		assertEquals("ct", outcome);
	}

}
