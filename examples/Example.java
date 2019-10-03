package uk.ac.belfastmet.examples;

public class Example {

	private int a = 3;
	private int b = 6;
	/**
	 * main method 
	 * @param args
	 */
	public static void main(String[] args) {
		Example example = new Example();
		example.printConditions();
		example.forConditions();
		example.whileConditions();
		example.doWhileConditions();
		example.switchConditions();
		example.stringConditions();

	}
	//THIS IS THE ONLY PAGE WITH MY COMMENTS so easy to delete -Leigh
	//---------------------------all your java docs need fixed they need at least a sentence to explain what they do martin says this is basically 0 marks
	//---------------------------positive though all your code is nice to read
	/** loop through and print if true, else print unknown
	 * @param print conditions
	 */
	public void printConditions() {
		//consider using and else if e.g
		//if(a < b) {
		//System.out.println( "A is less than B");
		//System.out.println( "B is greater than A");
		//}
		//way its done now might be way bigger than it needs to be
		if(a < b) {
			System.out.println( "A is less than B");
		}

		else if(b > a) {
			System.out.println("B is greater than A");
		}
		

		if(a <= b) {
			System.out.println("A is less than or equal to B");
		}

		else if(b >= a) {
			System.out.println("B is greater than or equal to A");
		}

		if(6 == b) {
			System.out.println(" 6 is equal to B");
		}

		if(a != b) {
			System.out.println("A is not equal to B");
		}

		if( 7 > b ||  2 <a) {
			System.out.println("True");
		}

		if( 7 > b &&  2 < a) {
			System.out.println("True");
		}
		else {
			System.out.println("Unknown");
		}


	}

	/** decrement from 10 - 0
	 * @param for loop
	 */
	public void forConditions() {


		for (int index = 10; index>=0; index--) {
			System.out.println("Index " + index);
		}
	}

	/** print 1 - 4
	 * @param while loop
	 */
	public void  whileConditions() {
		int i = 0;
		i++;
		while (i < 5) {
			System.out.println(i);
			i++;
		}

	}
	/** print index while index < 0
	 * @param do while 
	 */
	public void doWhileConditions() {
		int index = 0;
		do {
			System.out.println("index " + index);
			index++;
		}
		while (index < 0);
	}

	/**
	 * print case that == int, anything else == default
	 * @param switch
	 */
	public void switchConditions() {

		int day = 8;

		switch (day) {

		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Only 7 days in a week!");
		}
	}
	/**
	 * print case that == string, anything else == default
	 * @param switch string 
	 */
	public void stringConditions() {

		String day = "Monday";

		switch (day) {

		case "Monday":
			System.out.println("Day 1");
			break;
		case "Tuesday":
			System.out.println("Day 2");
			break;
		case "Wednesday":
			System.out.println("Day 3");
			break;
		case "Thursday":
			System.out.println("Day 4");
			break;
		case "Friday":
			System.out.println("Day 5");
			break;
		case "Saturday":
			System.out.println("Day 6");
			break;
		case "Sunday":
			System.out.println("Day 7");
			break;
		default:
			System.out.println("No Idea!");
		}
	}
}
