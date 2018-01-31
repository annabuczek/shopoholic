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

//      Creates window smaller than the screen.
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (height * .6));
    }

    /**
     * Method to go back to main window.
     */
    public void backToMainActivity(View v) {
        startActivity(new Intent(Pop1.this, MainActivity.class));
    }

}