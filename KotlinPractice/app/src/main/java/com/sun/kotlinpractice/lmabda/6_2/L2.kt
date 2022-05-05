/**
 * 函数作为参数优化
 */

fun IntRange.pickNum(need: Int, function: (Int) -> Boolean): List<Int> {

    println("need = $need")
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

    println("-----优化之前-------")
    println(list.pickNum({ x: Int -> x % 5 == 0 }))
    println("-----优化之后-------")
    println(list.pickNum { x: Int -> x % 5 == 0 })

    //带参数情况
    println(list.pickNum(1111, { x: Int -> x % 10 == 0 }))
    println(list.pickNum(1111) { x: Int -> x % 10 == 0 })//参数在小括号里
    //如果参数时函数类型,并且函数只有一个参数,那么可以用it关键字来代替函数的形参及箭头
    println(list.pickNum(1111, { it % 10 == 0 }))


}