//https://www.spoj.com/problems/DANGER/

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    println(reader.readLines().filter { it != "00e0"}.map {
        (it.take(2).toInt() * 10.0.pow(it.drop(3).take(1).toInt())).toInt().toString(2)
    }.map {
            val first = it.take(1)
            val removedFirst = it.drop(1).take(it.length-1)
        	Integer.parseInt(removedFirst.plus(first), 2)
    }.joinToString("\n"))
}
