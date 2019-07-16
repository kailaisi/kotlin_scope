package com.kailaisi.kotlinscopte

import kotlinx.coroutines.launch
import javafx.application.Application.launch
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

/**
 *描述：
 *<p/>作者：wu
 *<br/>创建时间：2019/7/16 8:53
 */
class TestRepeat {
}
fun main() = runBlocking{
    repeat(100_000){
        launch{
            delay(1000)
            print(".")
        }
    }
}