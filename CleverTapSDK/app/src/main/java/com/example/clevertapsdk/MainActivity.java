package com.example.clevertapsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        CleverTapAPI clevertapDefaultInstance = CleverTapAPI.getDefaultInstance(getApplicationContext());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private static class CleverTapAPI {
        public static CleverTapAPI getDefaultInstance(Context applicationContext) {
            return getDefaultInstance(applicationContext);
        }
    }
}