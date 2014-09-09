package ru.maskan;

import ru.maskan.exceptions.InvalidArgumentException;
import ru.maskan.util.TextUtil;

import java.util.*;

public class RectangleCalculator {

    public static Float calculate(String textData) throws InvalidArgumentException {
        return calculate(TextUtil.textToRectangles(textData));
    }

    public static Float calculate(List<Rectangle> rectangles) {

        SortedSet<Float> Ox = new TreeSet<Float>();
        for (Rectangle g : rectangles) {
            Ox.add(g.getLeftLowerX());
            Ox.add(g.getRightUpperX());
        }

        Float prev = null;
        Float sum = 0f;
        for (Float cur : Ox) {

            if (prev != null) {
                sum += lengthY(rectangles, prev) * (cur - prev);
            }

            prev = cur;
        }
        return sum;
    }

    private static float lengthY(List<Rectangle> rectangles, Float x) {

        Map<Float, Integer> Oy = new TreeMap<Float, Integer>();
        for (Rectangle g : rectangles) {

            if (g.getLeftLowerX() <= x && g.getRightUpperX() > x) {
                Oy.put(g.getLeftLowerY(), 1);
                Oy.put(g.getRightUpperY(), -1);
            }
        }

        int t = 1;

        Float prev = null, sum = 0f;
        for (Map.Entry<Float, Integer> e : Oy.entrySet()) {

            if (prev != null) {
                if (t > 0) {
                    sum += e.getKey() - prev;
                }

                t += e.getValue();
            }
            prev = e.getKey();
        }

        return sum;

    }
}
