package com.gangzi.mykotlin.kotlin

/**
 * Created by dan on 2017/7/11.
 */
// 逻辑表达式的使用
fun maxSum(x:Int,y:Int):Int{
    var max=if (x>y)x else y
    return max
}
//代码块
fun maxSums(x: Int,y: Int):Int{
    var max=if (x>y){
        println("Max number is x")
        x
    }else{
        println("Max number is y")
        y
    }
    return max
}
//when语句
fun judge(obj:Any){
    when(obj){
        1 -> println("我是数字1")
        1,0 -> println("我是数字1或者0")
        "abc" -> println("woshi abc")
        in 1..10 -> println("是不大于10的正整数")
        is Double -> println("类型是双精度浮点数")
        else  -> println("其他操作")
    }
}