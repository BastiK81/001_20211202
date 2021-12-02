package novice;

import java.util.Scanner;

public class Novice {

    private Scanner scanner;

    private static final String myName = "Sebastian";

    public void printMyName() {
        System.out.println(myName);
    }

    public Novice(Scanner scanner) {
        this.scanner = scanner;
    }

    public void printMyNameXTimes(int count) {
        for (int i = 0; i < count; i++) {
            printMyName();
        }
    }

    public boolean isNumberBiggerZero(int number) {
        return number > 0;
    }

    public int squareNumberOf(int number) {
        return number * number;
    }

    public void reprintText() {
        System.out.println("Print your Name and press enter, please.");
        System.out.println(String.format("Your Name is: %s", this.scanner.next()));
    }
}
