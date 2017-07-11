package com.gangzi.mykotlin.java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gangzi.mykotlin.R;
import com.gangzi.mykotlin.kotlin.Mall;

public class TestJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_java);
        Mall.Shop.buySomething();
        Mall.Shop.getShopName();
    }
}
