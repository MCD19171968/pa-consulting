package uk.ac.belfastmet.examples;

public class Colour {
	/**
	 * String x
	 * @param args
	 */
	public static void main(String[] args) {
		
		Colour colour = new Colour();
		
		String outcome = colour.seeColor("redxx");
		System.out.println(outcome);
		String outcome2 = colour.seeColor("xxred");
		System.out.println(outcome2);
		String outcome3 = colour.seeColor("blueTimes");
		System.out.println(outcome3);
	}
/**
 * check if string start with blue or red and assign colour
 * @param x
 * @return String newColor
 */
public String seeColor(String x) {

	String newColor = "";

	if (x.startsWith("blue")) {
		newColor = "Blue";
	}
	else if(x.startsWith("red")) {
			newColor = "Red";
	}
	else {
		newColor = " ";
	}
	
	return newColor;
}
}
