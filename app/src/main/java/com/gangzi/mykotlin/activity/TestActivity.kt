package com.gangzi.mykotlin.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gangzi.mykotlin.R
import com.gangzi.mykotlin.adapter.ListAdapter
import com.gangzi.mykotlin.kotlin.Users
import kotlinx.android.synthetic.main.activity_test.*
class TestActivity : AppCompatActivity() {

    var dataList=ArrayList<Users>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        val mListAdapter= ListAdapter(this,dataList)
        listView.adapter=mListAdapter
    }
    fun initData(){
       /* for (i in 10){

        }*/
    }
}
