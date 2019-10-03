package uk.ac.belfastmet.examples;

import java.util.ArrayList;

public class ArrayOf {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayOf arrayOf = new ArrayOf();
		ArrayList <String> animals = arrayOf.animalsArray();
		System.out.println(animals);

		ArrayList <String> newAnimals = arrayOf.addStringToArrayList();
		System.out.println(newAnimals);

		ArrayList <String> newAnimals2 = arrayOf.removeString();
		System.out.println(newAnimals2);
	}
	/**
	 * 
	 * @return animals array
	 */
	public ArrayList <String> animalsArray(){
		ArrayList<String> animals = new ArrayList <String>();
		animals.add("Elephant");
		animals.add("rhino");
		animals.add("Lion");

		return animals;
	}

	/**
	 * 
	 * @param animals
	 * @return array
	 */
	public ArrayList <String> addStringToArrayList(){
		ArrayList <String> animals = animalsArray();
		animals.add("Dog");
		animals.add("Cat");

		return animals;
	}
	/**
	 * 
	 * @return array
	 */
	public ArrayList <String> removeString(){
		ArrayList <String> animals = animalsArray();

		animals.remove("Elephant");


		return animals;




	}
}



