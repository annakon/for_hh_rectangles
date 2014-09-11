package ru.maskan;

import org.junit.Test;
import ru.maskan.exceptions.InvalidArgumentException;

import static org.junit.Assert.assertEquals;

public class NonIntersectTest {

    @Test
    public void testNonIntersectRectangles() throws InvalidArgumentException {
        String s = "1 4 7 6\n" +
                "3 0 5 3";

        assertEquals(new Float(18), RectangleCalculator.calculate(s));
    }

    @Test
    public void testNearNonIntersectRectangles() throws InvalidArgumentException {
        String s = "-2 0 1 2\n" +
                "1 1 4 3\n" +
                "2 0 6 1";

        assertEquals(new Float(16), RectangleCalculator.calculate(s));
    }

    @Test
    public void testNearNonIntersectRectangles2() throws InvalidArgumentException {
        String s = "1 1 2 2\n" +
                "2 1 3 2";

        assertEquals(new Float(2), RectangleCalculator.calculate(s));
    }
}
