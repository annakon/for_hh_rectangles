package ru.maskan;

import ru.maskan.exceptions.InvalidArgumentException;

public class Main {

    public static void main(String[] args) {
        String s = "0 1 3 3\n" +
                "2 2 6 4\n" +
                "1 0 3 5";

        try {
            RectangleCalculator.calculate(s);
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }
    }
}
