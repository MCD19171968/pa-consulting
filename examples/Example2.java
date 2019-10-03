package uk.ac.belfastmet.examples;

public class Example2 {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		Example2 example2 = new Example2();
		boolean result = example2.icyHot(120, -1);
		boolean result1 = example2.icyHot(-1, 120);
		boolean result2 = example2.icyHot(2, -120);
		if (result == true && result1 == true && result2 == false) {
			System.out.println("worked");
		}


	}
/**
 * 
 * @param temp1
 * @param temp2
 * @return boolean
 */
	public boolean icyHot(int temp1, int temp2) {
		boolean result = false;
		if((temp1 <0 && temp2 > 100) || (temp1 >100 && temp2 <0)) { 
			result = true;
		} else {
			result = false;
		}


		return result;



	}
}



