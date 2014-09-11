package ru.maskan;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        try {
            String s = FileUtils.readFileToString(new File(args[0]));
            float result = RectangleCalculator.calculate(s);

            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
