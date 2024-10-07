package ca1.task6;

public class debug {
	public static void accessElements() {
		int[] numbers = {1,2,3,4,5};
		int secondElement = numbers[1]; // index 2 is the third element, we want the second so we change the index to 1
		int fifthElement = numbers[4]; // index 5 is out of bounds, we want the fifth element so we change the index to 4
		System.out.println("Second element: " + fifthElement); // we want the second element so we print secondElement instead of fifthElement
		System.out.println("Fifth element: " + secondElement); // we want the fifth element so we print fifthElement instead of secondElement
	}
	
	public static int increaseA(int a) { // we do not need to pass a second parameter b as it is not used
		int b = 0; 
		while (b < 10) {
			a = a + 2; // we need to increment a by 2 instead not 1
			b++; // removed if statement as we do not need to check if a is even or odd to increment b
            }
		return a;
		}
		
	
	public static int findIndex(int[] numbers, int target) {
	    // changed 13 to numbers.length to avoid ArrayIndexOutOfBoundsException
	    for (int i = 0; i < numbers.length; i++) {
	        if (numbers[i] == target) {
	            return i;
	        }
	        // removed the extra increment of i. The for loop already increments i.
	    }
	    return -1; // return -1 if target is not found in the array
	}
}
