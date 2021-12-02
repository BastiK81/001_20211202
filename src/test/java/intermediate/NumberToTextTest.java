package intermediate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToTextTest {

    @Test
    void NumberIntToText() {
        NumberToText numberToText = new NumberToText();
        assertEquals("zehn", numberToText.intToText(10));
    }

    @Test
    void NumberIntToTextFailure() {
        NumberToText numberToText = new NumberToText();
        assertNotEquals("elf", numberToText.intToText(10));
    }
}