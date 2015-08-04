package com.example;

import android.databinding.BaseObservable;
import android.util.Log;
import android.view.View;

/**
 * @author Matthias Schmitt
 */
public class Handlers extends BaseObservable{
    public void onClick(View view) {
        Log.d("X", "onClick ");
    }
}
