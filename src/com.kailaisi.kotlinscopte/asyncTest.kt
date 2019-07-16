package com.kailaisi.kotlinscopte

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 *描述：
 *<p/>作者：wu
 *<br/>创建时间：2019/7/16 11:09
 */
fun main()= runBlocking {
    val timeMillis = measureTimeMillis {
        println(concurrentSum())
    }
    println(timeMillis)
}

suspend fun concurrentSum() = coroutineScope{
    var one = async { doSomeUsefulOne() }
    var two = async { doSomeUsefulTwo() }
    one.await().plus(two.await())
}
suspend fun doSomeUsefulOne(): Int {
    delay(1000)
    return 12
}

suspend fun doSomeUsefulTwo(): Int {
    delay(1000)
    return 29
}