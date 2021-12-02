package intermediate;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class IntermediateTest {

    @Test
    void numberToText() {
        Intermediate intermediate = new Intermediate(new Scanner(System.in));
        assertEquals("zwanzig", intermediate.numberToText(20));
    }

    @Test
    void numberToTextFailure() {
        Intermediate intermediate = new Intermediate(new Scanner(System.in));
        assertNotEquals("fünf", intermediate.numberToText(4));
    }
}