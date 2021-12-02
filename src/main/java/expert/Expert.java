package expert;

import java.util.*;

public class Expert {

    private Scanner scanner;

    public Expert(Scanner scanner) {
        this.scanner = scanner;
    }

    public String revertInput() {
        System.out.println("Please input String");
        String input = this.scanner.next();
        StringBuilder reverse = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse.append(input.charAt(i));
        }
        return reverse.toString();
    }

    public void sortNumbers() {
        List<Integer> numbers = Arrays.asList(6, 2, 8, 3, 9, 6);
        Collections.sort(numbers);
        System.out.println(numbers);
    }

    public void splitString() {
        System.out.println("Type a String to split with \",\"");
        String input = scanner.next();
        System.out.println(Arrays.toString(input.split(",")));
    }

    public int berechneQuersumme(int zahl) {
        int summe = 0;
        while (0 != zahl) {
            summe = summe + (zahl % 10);
            zahl = zahl / 10;
        }
        return summe;
    }

    public String integerToRomanNumeral(int input) {
        if (input < 1 || input > 3999)
            return "Invalid Roman Number Value";
        String s = "";
        while (input >= 1000) {
            s += "M";
            input -= 1000;        }
        while (input >= 900) {
            s += "CM";
            input -= 900;
        }
        while (input >= 500) {
            s += "D";
            input -= 500;
        }
        while (input >= 400) {
            s += "CD";
            input -= 400;
        }
        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }
}
