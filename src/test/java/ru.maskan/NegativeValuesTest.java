package ru.maskan;

import org.junit.Test;
import ru.maskan.exceptions.InvalidArgumentException;

import static org.junit.Assert.assertEquals;

public class NegativeValuesTest {

    @Test
    public void testNegativeValues() throws InvalidArgumentException {
        String s = "1 1 2 2\n" +
                "-2 -2 -1 -1";

        assertEquals(new Float(2), RectangleCalculator.calculate(s));
    }
    @Test
    public void testNegativeValues2() throws InvalidArgumentException {
        String s = "1 1 2 2\n" +
                "-2 -2 -1 -1\n" +
                "-2 1 -1 2";

        assertEquals(new Float(3), RectangleCalculator.calculate(s));
    }
}
