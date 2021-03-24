@file:Suppress("JAVA_MODULE_DOES_NOT_EXPORT_PACKAGE")
import com.sun.org.apache.bcel.internal.Const
import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    println("Quelle opération ? [0]:+ [1]:- [2]:* [3]:/")
//    val ope = scan.nextFloat()
    val ope = readLine()?.toFloat() // readline pure Kotlin
    println("Enter a first number :")
    val x = scan.nextFloat()
    println("Enter a second number :")
    val y = scan.nextFloat()

    when(ope){
        0f -> addition(x, y)
        1f -> soustraction(x, y)
        2f -> multiplication(x, y)
        3f -> division(x,y)
    }
//
//    if (ope.equals(0)){
//        println("Enter a first number :")
//        val x = scan.nextFloat()
//        println("Enter a first number :")
//        val y = scan.nextFloat()
//        addition(x, y)
//    }
}
fun addition(x:Float, y:Float){
    println(x + y)
}

fun soustraction(x:Float, y:Float){
    println(x - y)
}
fun multiplication(x:Float, y:Float){
    println(x * y)
}
fun division(x:Float, y:Float){
    println(x / y)
}

