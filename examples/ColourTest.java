package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColourTest {

	@Test
	public void test () {
		Colour colour = new Colour();
		String outcome = colour.seeColor("redxx");
		assertEquals("Red", outcome);
	}

	@Test
	public void test2 () {
		Colour colour = new Colour();
		String outcome = colour.seeColor("xxredxx");
		assertEquals(" ", outcome);
	}

	@Test
	public void test3 () {
		Colour colour = new Colour();
		String outcome = colour.seeColor("blueTimes");
		assertEquals("Blue", outcome);
	}
}
