package ru.maskan;

import org.junit.Test;
import ru.maskan.exceptions.InvalidArgumentException;

import static org.junit.Assert.assertEquals;

public class BaseCalculationsTest {

    @Test
    public void testBaseCalculations() throws InvalidArgumentException {
        String s = "0 1 3 3\n" +
                "2 2 6 4\n" +
                "1 0 3 5";

        assertEquals(new Float(18), RectangleCalculator.calculate(s));
    }

    @Test
    public void testFloatCalculations() throws InvalidArgumentException {
        String s = "0 1.1 3 3\n" +
                "2 2 6.2 4\n" +
                "1.7 0 3 5";

        assertEquals(new Float(18), RectangleCalculator.calculate(s));
    }


}

