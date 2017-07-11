package com.gangzi.mykotlin.kotlin

/**
 * Created by dan on 2017/7/7.
 */
class Overloads {
    @JvmOverloads
    fun OverloadTest(a:Int,b:Int=1,c:Int=2){
        println("$a,$b,$c")
    }
}