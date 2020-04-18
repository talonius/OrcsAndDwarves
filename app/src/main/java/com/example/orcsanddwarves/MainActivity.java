package com.example.orcsanddwarves;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(android.view.Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }
}

// @drawable/miniature is from https://www.wikiwand.com/en/Warhammer_Age_of_Sigmar
// @drawable/miniature is originally copyright and provided by Dan Ballard
// Usage is by the Attribution 2.5 Generic (CC BY 2.5) (https://creativecommons.org/licenses/by/2.5/)
// No changes were made to the image.
