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
}

fun function(s: String) {
    //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    println("hello")


    print(function1("1111"))
}

fun function1(s: String) : String{
    return s + "append function1"
}


