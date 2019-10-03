package uk.ac.belfastmet.examples;

public class MiddleTwo {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		MiddleTwo middleTwo = new MiddleTwo();
		String outcome = middleTwo.middle("string");
		System.out.println(outcome);
		String outcome1 = middleTwo.middle("code");
		System.out.println(outcome1);
		String outcome2 = middleTwo.middle("practice");
		System.out.println(outcome2);

	}
/**
 * look for middle in a string
 * @param made
 * @return String 
 */
	public String middle(String made) {
		int position;
		int length;
		
		if (made.length() % 2 == 0)
		{
			position = made.length() / 2 - 1;
			length = 2;
		}
		else
		{
			position = made.length() / 2;
			length = 1;
		}

		return made.substring(position, position + length);

	}
}


