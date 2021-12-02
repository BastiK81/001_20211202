package main;

import expert.Expert;
import intermediate.Intermediate;
import novice.Novice;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an Option 1 = Novice, 2 = Intermediate, 3 = Expert");
        switch (scanner.next()) {
            case "1":
                callNoviceExercise(scanner);
                break;
            case "2":
                callIntermediate(scanner);
                break;
            case "3":
                callExpert(scanner);
                break;
        }
        scanner.close();
    }

    private static void callExpert(Scanner scanner) {
        Expert expert = new Expert(scanner);
        System.out.println(expert.revertInput());
        expert.sortNumbers();
        expert.splitString();
        System.out.println(expert.berechneQuersumme(16498));
        System.out.println(expert.integerToRomanNumeral(10));
    }

    private static void callIntermediate(Scanner scanner) {
        int numberToText = 5;
        int numberToTextList = 20;
        Intermediate intermediate = new Intermediate(scanner);
        List<String> numbersToText = intermediate.numbersToText(numberToTextList);
        System.out.println(numbersToText.toString());
        System.out.println(intermediate.numberToText(numberToText));
        intermediate.numbersFromOneToHundred();
        intermediate.saveWords();
    }


    private static void callNoviceExercise(Scanner scanner) {
        int isBiggerNumber = 5;
        int squareNumber = 5;
        Novice novice = new Novice(scanner);
        novice.printMyName();
        novice.printMyNameXTimes(5);
        System.out.printf(String.format("Is %s bigger then zero", isBiggerNumber));
        System.out.println(novice.isNumberBiggerZero(isBiggerNumber));
        System.out.println(String.format("The Square of number %s is %s", squareNumber, novice.squareNumberOf(squareNumber)));
        novice.reprintText();
    }
}
