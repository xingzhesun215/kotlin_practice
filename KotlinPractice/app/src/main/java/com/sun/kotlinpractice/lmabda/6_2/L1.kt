package com.sun.kotlinpractice.lmabda.`6_2`

/**
 * Lambda表达式都定义在方法内部，那么，定义Lambda表达式还可以作为函数的实参或者返回值
 */

fun IntRange.pickNum(function: (Int) -> Boolean): List<Int> {
    val resultList = mutableListOf<Int>()
    for (i in this) {
        if (function(i)) {
            resultList.add(i)
        }
    }
    return resultList
}

fun main(args: Array<String>) {
    println("hello kotlin2")

    val list = 1..20

    println(list.javaClass.name)//kotlin.ranges.IntRange

    println("-----能被5整除的数-------")
    println(list.pickNum({ x: Int -> x % 5 == 0 }))
    println("-----能被10除的数-------")
    println(list.pickNum { x: Int -> x % 10 == 0 })


}