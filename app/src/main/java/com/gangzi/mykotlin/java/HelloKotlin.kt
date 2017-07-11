package com.gangzi.mykotlin.java

/**
 * Created by dan on 2017/7/6.
 */
/*
fun main(args:Array<String>){
   // var user=User(1,"littlegang")
    //print(user)
   HelloKotlin::class.constructors.map(::println)
   */
/* args.map(::println)
    for (arg in args){
        println(arg)
    }*//*

    //var helloKotlin=HelloKotlin();
    //helloKotlin.hello()
}
*/
/*fun main(vararg args:String){
   args.flatMap {
       it.split("_")
   }.map {
       println("$it ${it.length}")
   }
}*/

enum class Language(val hello:String){
    ENGLISH("hello"),
    CHINESE("你好");

    fun sayHello(){
        println(hello)
    }

    companion object {
        fun parse(name:String):Language{
            return valueOf(name.toUpperCase())
        }
    }
}
fun main(args:Array<String>){
    if (args.size==0)
        return
    val name=Language.parse(args[0])
    println(name)
    name.sayHello()
    name.sayBye()
}
fun Language.sayBye(){
    val bye=when(this){

        Language.ENGLISH -> "hello"
        Language.CHINESE -> "再见"
    }
    print(bye)
}

class HelloKotlin(){
    fun bye(){
        println("zhongguo")
    }
    fun hello(){
        println("woshichaixigaognag")
    }
}
