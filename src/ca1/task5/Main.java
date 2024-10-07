package ca1.task5;

public class Main {
	public static String decipher(String input) {
		//Step 1:
		String a = "";
		for (int i = input.length() - 1; i > 0; i--) {
			a += input.charAt(i);
		}
		
		// Step 2:
		String b = a
				.replaceAll("a",  "1")
				.replaceAll("e",  "2")
				.replaceAll("i",  "3")
				.replaceAll("o",  "4")
				.replaceAll("u",  "5");
		
		// Step 3:
		char[] c = b.toCharArray();
		for (int i = 0 ; i < c.length; i++) {
            int randomIndex = (int) (Math.random() * c.length);
            char temp = c[i];
            c[i] = c[randomIndex];
            c[randomIndex] = temp;
        }
		
		// Step 4:
		return new String(c);
	}
	
	public static void main(String[] args) {
		String mysteryInput = "sleuth";
		String mysteriousOutput = decipher(mysteryInput);
		System.out.println("The cryptic result: " + mysteriousOutput);
	}
}
