package novice;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class NoviceTest {

    @Test
    void testIsNumberBiggerZero() {
        Novice novice = new Novice(new Scanner(System.in));
        assertTrue(novice.isNumberBiggerZero(1));
    }

    @Test
    void testIsNumberNotBiggerZero() {
        Novice novice = new Novice(new Scanner(System.in));
        assertFalse(novice.isNumberBiggerZero(0));
    }

    @Test
    void squareNumberOfTrue() {
        Novice novice = new Novice(new Scanner(System.in));
        assertEquals(4, novice.squareNumberOf(2));
    }

    @Test
    void squareNumberOfFalse() {
        Novice novice = new Novice(new Scanner(System.in));
        assertNotEquals(5, novice.squareNumberOf(2));
    }
}