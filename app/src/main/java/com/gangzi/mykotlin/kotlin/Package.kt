package com.gangzi.mykotlin.kotlin

import android.content.Context
import android.widget.Toast

/**
 * Created by dan on 2017/7/7.
 */
fun printBye(){
    println("sayBye")
}
//扩展方法
fun Context.showLongToash(msg:String){
    Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
}
//扩展属性
val <T> ArrayList<T>.lastIndex: Int get() = size -1
val <T> ArrayList<T>.lastIndexs:Int get() = size-1;
val <T> ArrayList<T>.lastIndes:Int get()=size-2;
