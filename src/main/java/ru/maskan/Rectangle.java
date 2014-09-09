package ru.maskan;

import ru.maskan.exceptions.InvalidArgumentException;

public class Rectangle {

    private float leftLowerX, leftLowerY, rightUpperX, rightUpperY;

    public Rectangle(float x1, float y1, float x2, float y2) throws InvalidArgumentException {

        if (x1 < x2) {
            this.leftLowerX = x1;
            this.rightUpperX = x2;
        } else if (x1 == x2) {
            throw new InvalidArgumentException();
        } else {
            this.leftLowerX = x2;
            this.rightUpperX = x1;
        }

        if (y1 < y2) {
            this.leftLowerY = y1;
            this.rightUpperY = y2;
        } else if (y1 == y2) {
            throw new InvalidArgumentException();
        } else {
            this.leftLowerY = y2;
            this.rightUpperY = y1;
        }
    }

    public float getLeftLowerX() {
        return leftLowerX;
    }

    public float getLeftLowerY() {
        return leftLowerY;
    }

    public float getRightUpperX() {
        return rightUpperX;
    }

    public float getRightUpperY() {
        return rightUpperY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Float.compare(rectangle.leftLowerX, leftLowerX) != 0) return false;
        if (Float.compare(rectangle.leftLowerY, leftLowerY) != 0) return false;
        if (Float.compare(rectangle.rightUpperX, rightUpperX) != 0) return false;
        if (Float.compare(rectangle.rightUpperY, rightUpperY) != 0) return false;

        return true;
    }
}
