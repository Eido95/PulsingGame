package com.superup.pulsinggame;

import android.os.Bundle;
import android.view.View;

import com.superup.engine.GameActivity;

public class MainActivity extends GameActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.switchImmersive();
        this.setContentView(new MainPanel(this));
    }
}
