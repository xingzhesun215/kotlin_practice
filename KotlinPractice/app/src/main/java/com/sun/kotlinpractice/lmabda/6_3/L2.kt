package com.sun.kotlinpractice.lmabda.`6_3`


/**
 * 对象类的高阶函数
 *
 * repeat(count){ }
 *
 * run{} 单独使用 类似于有返回值的代码块
 * T.run{} 对象使用 将自身传入到代码块中执行,返回为最后一行,注意returnd的使用
 * T.let{} 对象使用 自身传入到代码块中执行,返回为最后一行,常见情景为做非空判断
 * with(T){} with更像是一个函数,将对象作为参数传进去,this
 * T.apply{}与run很像,只是返回是T
 * T.also{}与let很像,只是返回是T
 *
 * */


fun main(args: Array<String>) {

    println("-----------------------repeat 大于0有效--------------------------")
    repeat(4) {
        println("打印$it")
    }
    println("-----------------------run  有返回值的代码块--------------------------")
    var a1 = run {
        println("hello")
        1
    }
    println(a1.javaClass)
    println("-----------------------run 函数的run,把自己传进去--------------------------")

    var l1 = ArrayList<Int>()
    var size1 = l1.run {
        add(5)
        this.add(4)
        this.add(6)
//        return //返回的是外部方法的方法
//        return@run //返回的是run{}里面的
//        return@run size //返回的是size
        size//最后一个语句为返回
    }

    println(l1)
    println("个数=$size1")
    println("-----------------------let--------------------------")

    var l2 = ArrayList<Int>()
    var l3: ArrayList<Int>? = null
    //使用it代替l2
    l2.let {
        println("hello")
        println(it.size)
    }
    //l3为空不执行let里的代码
    l3?.let {
        println("world")
    }


    println("-----------------------with--------------------------")

    var result = with(l2) {
        l2.add(12)
        this.add(14)
        println(l2.size)
        4
    }

    println("result is $result")

    println("-----------------------apply--------------------------")

    var l4 = ArrayList<Int>()

    var l5 = l4.apply {
        this.add(12)
        l4.add(13)
        println("l4.size=${l4.size}")
        println("l4.size=${size}")
    }

    l5.add(14)

    println(l4)

    println("l4 is l5 ? ${l4 == l5}")

    println("-----------------------华丽分割线--------------------------")

    var l6: ArrayList<Int>? = null

    l6?.also {
        it!!.add(12)
        it!!.add(13)
        it!!.add(14)
    }
    l6 = ArrayList()
    var l7 = l6?.also {
        it.add(12)
        it.add(13)
        it.add(14)
    }
    println("l6 is l7 ? ${l7 == l6}")



    println("-----------------------华丽分割线--------------------------")

    val numbers = mutableListOf("one", "two", "three")
    numbers.also { println("在列表添加新元素: $it") } //在列表添加新元素: [one, two, three]
        .add("four")                                //
        .also {println("在列表添加新元素: $it")  }    //在列表添加新元素: true

}
