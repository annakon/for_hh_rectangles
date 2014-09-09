package ru.maskan;

import org.junit.Test;
import ru.maskan.exceptions.InvalidArgumentException;

import static org.junit.Assert.assertEquals;

public class NonIntersectTest {

    @Test
    public void testNonIntersectRectangles() throws InvalidArgumentException {
        String s = "-2 2 3 3\n" +
                "2 12 6 4\n" +
                "1 0 3 5";

        assertEquals(new Float(18), RectangleCalculator.calculate(s));
    }

    @Test
    public void testNearNonIntersectRectangles() throws InvalidArgumentException {
        String s = "-2 2 3 3\n" +
                "2 12 6 4\n" +
                "1 0 3 5";

        assertEquals(new Float(18), RectangleCalculator.calculate(s));
    }
}
