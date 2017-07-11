package com.gangzi.mykotlin.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gangzi.mykotlin.R

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        Mall.shopName
        Mall.buySomething()
    }
}
