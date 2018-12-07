package com.superup.pulsinggame;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.support.annotation.Nullable;

import com.superup.engine.actors.PositionedActor;

import java.util.ArrayList;
import java.util.List;

/**
 * Hoop shaped circle, which has 1-3 holes in its stroke.
 */
public class CircleWithHoles extends PositionedActor {
    public static int RADIUS = 10;
    public static byte MAX_HOLES = 3;
    public int maxRadius = 1;

    private final List<CircleHole> holes;

    /**
     * @param x initial circle X position
     * @param y initial circle Y position
     */
    public CircleWithHoles(int x, int y) {
        super(x, y, RADIUS, RADIUS);

        this.holes = new ArrayList<>();

        this.generateHoles();
    }

    private void generateHoles() {

    }

    public void expand() {
        if (this.isEnabled()) {

        }
    }

    @Override
    public void stylePaint(Paint p) {
        p.setColor(Color.WHITE);
        p.setStyle(Paint.Style.STROKE);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRoundRect(this.getRectF(), this.getWidth(), this.getHeight(), this.getPaint());
    }

    @Override
    public void setAlpha(int i) {

    }

    @Override
    public void setColorFilter(@Nullable ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return PixelFormat.OPAQUE;
    }
}
