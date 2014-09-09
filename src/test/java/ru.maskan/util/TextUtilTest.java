package ru.maskan.util;

import org.junit.Before;
import org.junit.Test;
import ru.maskan.Rectangle;
import ru.maskan.exceptions.InvalidArgumentException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TextUtilTest {

    private List<Rectangle> rectangles;

    @Before
    public void setUp() {
        rectangles = new ArrayList<Rectangle>();

        try {
            rectangles.add(new Rectangle(0, 1, 3, 3));
            rectangles.add(new Rectangle(2, 2, 6, 4));
            rectangles.add(new Rectangle(1, 0, 3, 5));
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTextToRectangles() throws InvalidArgumentException {
        String s = "0 1 3 3\n" +
                "2 2 6 4\n" +
                "1 0 3 5";

        assertEquals(rectangles, TextUtil.textToRectangles(s));
    }
}
