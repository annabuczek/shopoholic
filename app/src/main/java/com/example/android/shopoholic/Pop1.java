package com.example.android.shopoholic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

///
// Created by Ania on 30.01.2018.
//

public class Pop1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_window1);
    }

    /**
     * Method to go back to main window.
     */
    public void backToMainActivity(View v) {
        startActivity(new Intent(Pop1.this, MainActivity.class));
    }

}