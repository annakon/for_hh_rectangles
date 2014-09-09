package ru.maskan.util;

import ru.maskan.Rectangle;
import ru.maskan.exceptions.InvalidArgumentException;

import java.util.ArrayList;
import java.util.List;

public class TextUtil {

    public static List<Rectangle> textToRectangles(String textData) throws InvalidArgumentException {

        List<Rectangle> rectangles = new ArrayList<Rectangle>();

        for (String row : textData.split("\\n")) {
            String[] coords = row.split(" ");

            if (coords.length != 4) {
                throw new InvalidArgumentException();
            }

            try {
                Rectangle r = new Rectangle(
                        Float.valueOf(coords[0]),
                        Float.valueOf(coords[1]),
                        Float.valueOf(coords[2]),
                        Float.valueOf(coords[3])
                );

                rectangles.add(r);
            } catch (NumberFormatException e) {
                throw new InvalidArgumentException();
            }
        }

        return rectangles;
    }
}
