package com.superup.pulsinggame;

/**
 * A hole in the circle, which the user can pass his finger through.
 */
public class CircleHole {
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public CircleHole(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
