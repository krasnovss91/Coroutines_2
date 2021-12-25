import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

suspend fun main() = coroutineScope {
   val call1 = async { getLength("1215 544 965") }
   val call2 = async { getLength("743 239 032 832 03") }
   val call3 = async { getLength("8923 232") }
    
    println(call1.await() + call2.await() + call3.await())
}

suspend fun getLength(string: String): Int{
    delay(100)
 return string.split(" ".toRegex()).toTypedArray().size
}