package com.sun.kotlinpractice.lmabda.`6_3`

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

/**
 * Lambda表达式会被编译成内部类,每次调用lambda表达式都会生成对象,造成额外的内存开销,导致程序效率低下
 * 使用inline,对lambda表达式进行优化,去掉方法名称以避免入栈出栈操作
 *
 */


inline fun <T> check(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    } finally {
        lock.unlock()
    }
}

inline fun check(noinline function: (Int) -> Boolean) {
    test(function)
}

fun test(function: (Int) -> Boolean) {
    println("编译通过")
}

fun main(args: Array<String>) {

    var lock = ReentrantLock()
    check(lock, { println("这是内联函数方法调用") })


    check { x: Int -> x == 2 }

}