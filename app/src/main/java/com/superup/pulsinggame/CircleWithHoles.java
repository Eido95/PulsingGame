package com.superup.pulsinggame;

import android.graphics.Canvas;
import android.graphics.Paint;

import com.superup.engine.actors.SimpleMovingActor;

/**
 * Hoop shaped circle, which has holes in its stroke.
 */
public class CircleWithHoles extends SimpleMovingActor {

    public CircleWithHoles(int x, int y) {
        super(x, y);
    }

    //region SimpleMovingActor Implementations
    @Override
    public void stylePaint(Paint p) {

    }

    @Override
    public void draw(Canvas canvas) {

    }
    //endregion

}
