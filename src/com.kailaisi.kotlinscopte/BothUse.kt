package com.kailaisi.kotlinscopte

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 *描述：
 *<p/>作者：wu
 *<br/>创建时间：2019/7/16 9:40
 */
fun main() = runBlocking {
    var timeMillis = measureTimeMillis {
        var doSome1 = async (start = CoroutineStart.LAZY){ doSome1() }
        var doSome2 = async (start = CoroutineStart.LAZY){ doSome2() }
        println(System.currentTimeMillis())
        doSome1.start()
        doSome2.start()
        println("the answer is ${doSome1.await().plus(doSome2.await())}")
        println(System.currentTimeMillis())
    }
    println(timeMillis)
}

suspend fun doSome1(): Int {
    delay(1000)
    return 12
}

suspend fun doSome2(): Int {
    delay(1000)
    return 29
}