package com.gangzi.mykotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gangzi.mykotlin.activity.TestActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_text.text="hello MyKotlin"
        tv_text.textSize=20f
        bt_jump.setOnClickListener {
            startActivity(Intent(MainActivity@this,TestActivity::class.java))
        }

    }
}
