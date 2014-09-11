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

        Set<ComparableYPoint> Oy = new TreeSet<ComparableYPoint>();
        for (Rectangle g : rectangles) {

            if (g.getLeftLowerX() <= x && g.getRightUpperX() > x) {
                Oy.add(new ComparableYPoint(g.getLeftLowerY(), 1));
                Oy.add(new ComparableYPoint(g.getRightUpperY(), -1));
            }
        }

        int t = 1;

        Float prevCoordinate = null, sum = 0f;
        for (ComparableYPoint e : Oy) {

            if (prevCoordinate != null) {
                if (t > 0) {
                    sum += e.getCoordinate() - prevCoordinate;
                }

                t += e.getFlag();
            }
            prevCoordinate = e.getCoordinate();
        }

        return sum;

    }
}

class ComparableYPoint implements Comparable {
    float coordinate;
    int flag;

    ComparableYPoint(float coordinate, int flag) {
        this.coordinate = coordinate;
        this.flag = flag;
    }

    public float getCoordinate() {
        return coordinate;
    }

    public int getFlag() {
        return flag;
    }

    @Override
    public int compareTo(Object o) {

        ComparableYPoint tmp = (ComparableYPoint) o;
        if (this.coordinate < tmp.coordinate) {
            return -1;
        } else if (this.coordinate > tmp.coordinate) {
            return 1;
        }
        return 0;
    }
}
