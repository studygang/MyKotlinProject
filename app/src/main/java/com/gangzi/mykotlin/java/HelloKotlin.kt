package com.gangzi.mykotlin.java

/**
 * Created by dan on 2017/7/6.
 */
fun main(args:Array<String>){
   // var user=User(1,"littlegang")
    //print(user)
   HelloKotlin::class.constructors.map(::println)
   /* args.map(::println)
    for (arg in args){
        println(arg)
    }*/
    var helloKotlin=HelloKotlin();
    helloKotlin.hello()
}


class HelloKotlin(){
    fun hello(){
        println("woshichaixigaognag")
    }
}
