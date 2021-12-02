package expert;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ExpertTest {

    @Test
    void berechneQuersumme() {
        Expert expert = new Expert(new Scanner(System.in));
        assertEquals(1, expert.berechneQuersumme(10));
    }

    @Test
    void berechneQuersummeFailure() {
        Expert expert = new Expert(new Scanner(System.in));
        assertNotEquals(1, expert.berechneQuersumme(20));
    }

    @Test
    void integerToRomanNumeral() {
        Expert expert = new Expert(new Scanner(System.in));
        assertEquals("X", expert.integerToRomanNumeral(10));
    }

    @Test
    void integerToRomanNumeralFailure() {
        Expert expert = new Expert(new Scanner(System.in));
        assertNotEquals("XV", expert.integerToRomanNumeral(12));
    }
}