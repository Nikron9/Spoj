//https://pl.spoj.com/problems/KC010/

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
   	val reader = BufferedReader(InputStreamReader(System.`in`))

    reader
        .readLines()
        .map { line ->
        	line.split(' ').filter { it != "" }.map {
                it.toBigIntegerOrNull()
            }
    	}
        .map { 
        	println("${it.count { it != null }} ${it.count { it == null }}")
    	}
}
