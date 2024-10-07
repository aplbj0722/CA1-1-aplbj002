package ca1.task6;

public class debug {
	public static void accessElements() {
		int[] numbers = {1,2,3,4,5};
		int secondElement = numbers[2];
		int fifthElement = numbers[5];
		System.out.println("Second element: " + fifthElement);
		System.out.println("Fifth element: " + secondElement);
	}
	
	public static int increaseA(int a, int b) {
		while (b < 10) {
			a = a + 1;
			if(a % 2 == 0) {
                b++;
            }
		}
		return a;
	}
	
	public static int findIndex(int[] numbers, int target) {
		for (int i = 0; i < 13; i++) {
			if (numbers[i] == target) {
				return i;
			}
			i++;
		}
		return -1;
	}
}
