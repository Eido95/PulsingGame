package com.superup.pulsinggame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

import com.superup.engine.AbstractGamePanel;

import java.util.ArrayList;
import java.util.List;

/**
 * Main game panel.
 */
class MainPanel extends AbstractGamePanel {

    public MainPanel(Context context) {
        super(context);
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onTimer() {

    }

    @Override
    public void redrawCanvas(Canvas canvas) {

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }
}
