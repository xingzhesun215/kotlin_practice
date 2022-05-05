package com.sun.kotlinpractice.lmabda.`6_3`

/**
 * 集合操作高阶函数
 */
fun main(args: Array<String>) {

    val list = listOf(1, 2, 3, 4, -1, -3, 1)

    println("find")//返回第一个满足条件的元素,没有则为null
    println("找出大于0的元素=${list.find { it > 0 }}")
    println("找出大于0的元素=${list.find { it == 0 }}")

    println("first last")//找到则返回,没有找到就崩溃了,不建议用
    println("找出=2的元素=${list.first { it == 2 }}")
//    println("找出=-2的元素=${list.first { it == -2 }}")
    println("找出=2的元素=${list.last { it == 2 }}")
//    println("找出=-2的元素=${list.last { it == -2 }}")


    println("single")//找到一个则返回元素,不满足条件即崩溃
    println("找出=2的元素=${list.single() { it == 2 }}")


    println("takeWhile")//查询多个,返回集合或空集合,不推荐使用

    println("满足条件的集合${list.takeWhile { it > 0 }}")
    println("满足条件的集合${list.takeWhile { it > 1 }}")//返回为[],因为第一个元素1不符合条件,故不再往下执行
    println("满足条件的集合${list.takeWhile { it > 7 }}")

    println("filter")//查询多个,返回集合或空集合,推荐使用

    println("满足条件的集合${list.filter { it > 0 }}")
    println("满足条件的集合${list.filter { it > 1 }}")
    println("满足条件的集合${list.filter { it > 7 }}")

    println("count")

    println("满足条件的集合${list.count { it > 0 }}")
    println("满足条件的集合${list.count { it > 1 }}")
    println("满足条件的集合${list.count { it > 7 }}")

    println("比较类函数")

    println("最小=${list.minByOrNull { it }}")
    println("最大=${list.maxByOrNull { it }}")
    println("全部=${list}")
    println("去重=${list.distinctBy { it }}")//distinct不同的

}