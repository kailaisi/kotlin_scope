package com.kailaisi.kotlinscopte

import kotlinx.coroutines.*

/**
 *描述：
 *<p/>作者：wu
 *<br/>创建时间：2019/7/16 9:12
 */
fun main()= runBlocking {
     val job = launch {
         while(isActive) {
             println("job:I'm sleeping ")
             delay(500)
         }
     }
    delay(1300)
    println("main: i am tired of waiting")
    job.cancelAndJoin()
    println("main: now  i can quit")
}