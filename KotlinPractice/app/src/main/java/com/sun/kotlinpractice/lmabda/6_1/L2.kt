package com.sun.kotlinpractice.lmabda.`6_1`


/**
 * Lambda表达式返回值
 * 以最后一行的返回为准
 * */


fun main(args: Array<String>) {
    println("-----------------华丽分割线-------------")
    val result1={
        println("输出语句1")
        "字符串"
    }()
    println("返回值= "+result1+",类型="+result1.javaClass)
    println("-----------------华丽分割线-------------")
    val result2={
        println("输出语句2")
        true
    }()
    println("返回值= "+result2+",类型="+result2.javaClass)
    println("-----------------华丽分割线-------------")
    val result3={
        println("输出语句3")
        true
    }//注意观察返回的值及类型，与上面的比较
    println("返回值= "+result3+",类型="+result3.javaClass)


    /**
    返回值= true,类型=boolean
    返回值= Function0<java.lang.Boolean>,类型=class com.sun.kotlinpractice.lmabda.6_1.L2Kt$main$result3$1
     */
}
