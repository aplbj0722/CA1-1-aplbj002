package ca2;

public class Loops {

    public void printWords(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("words");
        }
    }

    public static void main(String[] args) {
        Loops loops = new Loops();
        loops.printWords(6);
    }
}