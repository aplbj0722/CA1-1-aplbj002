package ca1.task5;

public class Main {

    // Method to decipher a given string
    public static String decipher(String input) {

        //Step 1: Reverse the input string
        String a = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            a += input.charAt(i);
        }

        // Step 2: Replace vowels with numbers
        // 'a' with '1', 'e' with '2', 'i' with '3', 'o' with '4', 'u' with '5'
        String b = a
                .replaceAll("a",  "1")
                .replaceAll("e",  "2")
                .replaceAll("i",  "3")
                .replaceAll("o",  "4")
                .replaceAll("u",  "5");

        // Step 3: Shuffle the characters in the string
        char[] c = b.toCharArray();
        for (int i = 0 ; i < c.length; i++) {
            int randomIndex = (int) (Math.random() * c.length);
            char temp = c[i];
            c[i] = c[randomIndex];
            c[randomIndex] = temp;
        }

        // Step 4: Return the final deciphered string
        return new String(c);
    }

    // Main method to test the decipher method
    public static void main(String[] args) {
        // Input string to be deciphered
        String mysteryInput = "sleuth";
        // Decipher the input string
        String mysteriousOutput = decipher(mysteryInput);
        // Print the deciphered string
        System.out.println("The cryptic result: " + mysteriousOutput);
    }
}
