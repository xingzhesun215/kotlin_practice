package com.sun.kotlinpractice.lmabda.`6_1`

/**
 * Lambda表达式就是一个匿名函数，它是对匿名内部类的一种简化
 */
fun main(args: Array<String>) {
    println("hello kotlin1")

    var sum = { a: Int, b: Int -> a + b }
    println(sum(3,4))
}