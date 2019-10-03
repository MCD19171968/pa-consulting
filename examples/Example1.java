package uk.ac.belfastmet.examples;

public class Example1 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Example1 example1 = new Example1();
		example1.sleepIn(false, false);
		example1.nextExample("Kitten" , 3);
		example1.stringExample("Hi I am a string");
		example1.hasTeen();

	}
	/**
	 * 
	 * @param weekday
	 * @param vacation
	 */
	public void sleepIn( boolean weekday, boolean vacation) {

		if(weekday == false) {
			System.out.println("Have a lie in");
		}
		else {
			System.out.println("Wake up");
		}

		if(vacation == true) {
			System.out.println("Have a lie in");
		}
		else {
			System.out.println("Wake up");
		}
	}
	/**
	 * 
	 * @param kitten
	 * @param index
	 */

	public void nextExample (String kitten, int index) {

		String subCharacter = kitten.substring(0, index);
		index++;
		String subCharacter2 = kitten.substring(index, kitten.length());
		System.out.println(subCharacter + subCharacter2);
	}
	/**
	 * 
	 * @param sentence
	 */

	public void stringExample (String sentence) {

		boolean startWith = sentence.startsWith("Hi");
		if(startWith) {
			System.out.println("It starts with hi");
		}
		else {
			System.out.println("It does not start with hi");
		}
	}

	public void hasTeen () {

	}

}
