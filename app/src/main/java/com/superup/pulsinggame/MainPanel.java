package com.superup.pulsinggame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.superup.engine.AbstractGamePanel;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

/**
 * Main game panel.
 */
class MainPanel extends AbstractGamePanel {
    private List<CircleWithHoles> circles = new ArrayList<>();

    private boolean paused;

    public MainPanel(Context context) {
        super(context);

        super.setPanelColor(Color.BLACK);
    }

    //region AbstractGamePanel
    @Override
    public void onStart() {
        this.initializeCircles();
    }

    private void initializeCircles() {
        this.addCircle();
    }

    private void addCircle() {
        int centerX = this.getWidth() / 2;
        int centerY = this.getHeight() / 2;

        CircleWithHoles circleWithHoles = new CircleWithHoles(centerX, centerY);

        this.circles.add(circleWithHoles);
    }

    private void expandCircles() {
        for (CircleWithHoles circle : this.circles) {
            circle.expand();
        }
    }

    //region AbstractGamePanel Implementations
    @Override
    public void onTimer() {
        if (this.paused == false) {
            this.circles.get(0).expand();
        }
    }

    @Override
    public void redrawCanvas(Canvas canvas) {
        this.circles.get(0).draw(canvas);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("MainPanel", "onTouchEvent: touched!");
        
        return false;
    }
    //endregion
}
