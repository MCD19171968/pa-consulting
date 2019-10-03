package uk.ac.belfastmet.examples;

public class BadX {
	/**
	 * String made
	 * @param args
	 */
	public static void main(String[] args) {

		BadX badX = new BadX();
		
		boolean outcome = badX.hasBad("badxx");
		System.out.println(outcome);
		boolean outcome1 = badX.hasBad("xbadxx");
		System.out.println(outcome1);
		boolean outcome2 = badX.hasBad("xxbadxx");
		System.out.println(outcome2);
	}
/**
 * check if 'b' at index of 1 or 0
 * @param made
 * @return boolean
 */
	public boolean hasBad(String made) {
		
		boolean result = false;
		int index = made.indexOf('b');

		if(index == 0){
			result = true;
		}
		else if(index == 1) {
			result = true;
		}
		else{
			result = false;
		}

		return result;


	}
}
