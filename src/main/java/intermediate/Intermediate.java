package intermediate;

import novice.Novice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Intermediate {

    private Scanner scanner;

    private static final String nullbis10[] = {"null", "ein", "zwei", "drei", "vier", "fuenf", "sechs", "sieben","acht", "neun", "zehn"};

    public Intermediate(Scanner scanner) {
        this.scanner = scanner;
    }

    public List<String> numbersToText(int number) {
        NumberToText numberToText = new NumberToText();
        List<String> numbersToText = new ArrayList<>();
        for (int i = 0; i < number + 1; i++) {
            numbersToText.add(numberToText.intToText(i));
        }
        return numbersToText;
    }

    public String numberToText(int number) {
        NumberToText numberToText = new NumberToText();
        return numberToText.intToText(number);
    }

    public void numbersFromOneToHundred() {
        for (int i = 1; i < 101; i++) {
            StringBuilder prefix = new StringBuilder();
            if (i % 3 == 0) {
                prefix.append("#");
            }
            if (i % 5 == 0) {
                prefix.append("$");
            }
            System.out.println(String.format("%s%s", prefix,i));
        }
    }

    public void saveWords() {
        System.out.println("How many words you want to save?");
        String word = this.scanner.next();
        try {
            int wordCount = Integer.parseInt(word);
            saveWordInput(wordCount);
        } catch (NumberFormatException exception) {
            System.out.println(String.format("%s is not an Integer"));
        }
    }

    private void saveWordInput(int count){
        List<String> words = new ArrayList<>();
        boolean firstWord = true;
        for (int i = 0; i < count; i++) {
            if (firstWord) {
                firstWord = !firstWord;
            } else {
                System.out.println(words.toString());
            }
            System.out.println("Please type a word and press enter.");
            words.add(this.scanner.next());
        }
    }
}
