package com.example.ass1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Friend f = new Friend("Byron", "Lewis", "Male", 32, "51 Pelsart Ave Penrith");
    Task t = new Task("Do assignment", "WSU");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}