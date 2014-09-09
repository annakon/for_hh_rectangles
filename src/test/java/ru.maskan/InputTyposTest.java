package ru.maskan;

import org.junit.Test;
import ru.maskan.exceptions.InvalidArgumentException;

import static org.junit.Assert.assertEquals;

public class InputTyposTest {

    @Test(expected = InvalidArgumentException.class)
    public void testCoordsCountTypo() throws InvalidArgumentException {
        String s = "0 1 3\n" +
                "2 2 6 4\n" +
                "1 0 3 5";

        assertEquals(new Float(18), RectangleCalculator.calculate(s));
    }

    @Test(expected = InvalidArgumentException.class)
    public void testCoordsNotNumberTypo() throws InvalidArgumentException {
        String s = "0 xxx 3 5\n" +
                "2 2 6 4\n" +
                "1 0 3 5";

        assertEquals(new Float(18), RectangleCalculator.calculate(s));
    }
}
