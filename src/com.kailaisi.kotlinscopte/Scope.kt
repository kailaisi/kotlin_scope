import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main()= runBlocking {
    launch {
        kotlinx.coroutines.delay(1000)
        println("Task from runBlocking")
    }
    coroutineScope {
        launch {
            kotlinx.coroutines.delay(500)
            println("Task from nested launch")
        }
        kotlinx.coroutines.delay(100)
        println("Task from coroutineScope")
    }
    println("coroutine scope is over")

}
