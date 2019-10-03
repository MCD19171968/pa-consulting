package uk.ac.belfastmet.examples;

import java.util.ArrayList;
/**
 * 
 * @author MCD19171968
 *
 */
public class ArrayExamples {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayExamples arrayExamples = new ArrayExamples();
		arrayExamples.addStringToArrayList();
		ArrayList <String> listOfStuff = arrayExamples.containsString();
		System.out.println("Size of Array" + listOfStuff.size());

		System.out.println(listOfStuff.contains("Good"));
		arrayExamples.removeString();	
		boolean listOfStuff1 = arrayExamples.listOfStuff();
		System.out.println(listOfStuff1);


	}

	// no return
	public void addStringToArrayList() {
		ArrayList<String> listOfStuff = new ArrayList <String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		System.out.println("Size of Array" + listOfStuff.size());

		for (int index = 0; index < listOfStuff.size(); index++) {
			String indexValue = listOfStuff.get(index);
			System.out.println("Value of String " + indexValue);
		}

	}
	/**
	 * 
	 * @return array list 
	 */
	public ArrayList <String> containsString() {
		ArrayList<String> listOfStuff = new ArrayList <String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");

		return listOfStuff;

	}

	//no return
	public void removeString() {
		ArrayList<String> listOfStuff = new ArrayList <String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");

		System.out.println("Size of Array" + listOfStuff.size());

		listOfStuff.remove("Good");
		System.out.println("Size of Array" + listOfStuff.size());


	}
	/**
	 * 
	 * @return array list
	 */
	public boolean listOfStuff() {
		ArrayList<String> listOfStuff = new ArrayList <String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		System.out.println("Size of Array" + listOfStuff.isEmpty());

		return listOfStuff.isEmpty();

	}

}
