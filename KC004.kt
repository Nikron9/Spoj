//https://pl.spoj.com/problems/KC004/

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
   	val reader = BufferedReader(InputStreamReader(System.`in`))
    
    reader
    	.readLines()
    	.map { line ->
        	line.split(" ")
    	}.map { numbers ->
            val numberToSearch = numbers.first()
            val sequenceLength = numbers.drop(1).first().toInt()
            val sequence = numbers.drop(2).take(sequenceLength)
            
            numberToSearch to sequence
        }.map { pair ->
            pair.second.count { number -> number == pair.first }
        }.map {
            println(it)
        }
}
