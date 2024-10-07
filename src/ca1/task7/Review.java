package ca1.task7;

public class Review {
	    public static void main(String[] args) {
	    	int[] data = {1, 2, 3, 4, 5};
	    	
			for (int i = 0; i < 3; i++) {
				data[i] = data[i] * data[i];
				
			}
			data[0] = 5;
			data[0] = data[0] + 5;
	    }
}
