package com.chenqiao.kotlinprimer.p1

/**
 * Created by chenqiao on 2019/3/14.
 * e-mail : mrjctech@gmail.com
 */


//变量 variable
var age = 18 //自动推断
var age1: Int = 18



//不可变量 value
val name = "chen qiao"

val name1: String = "chenqiao"

//val name2: String = null
val name2: String? = null


fun main(args: Array<String>) {
    function("")

    println("===========")
    print("循环输出：")
    for (i in 1..4) print(i) // 输出“1234”
    println("\n----------------")
    print("设置步长：")
    for (i in 1..4 step 2) print(i) // 输出“13”
    println("\n----------------")
    print("使用 downTo：")
    for (i in 4 downTo 1 step 2) print(i) // 输出“42”
    println("\n----------------")
    print("使用 until：")
    // 使用 until 函数排除结束元素
    for (i in 1 until 4) {   // i in [1, 4) 排除了 4
        print(i)
    }
    println("\n----------------")


}

fun function(s: String) {
    //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    println("hello")


    print(function1("1111"))
}

fun function1(s: String) : String{
    return s + "append function1"
}


