//https://pl.spoj.com/problems/AL_20_01/

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    reader
        .readLines()
        .map {
        	it.toUpperCase().map {
            	"${it.mapToMors()}/"
        	}.joinToString("")
    	}
    	.joinToString("\n")
    	.also {
    		println(it)
    	}
}

fun Char.mapToMors():String {
    return when(this) {
        'A' -> ".-"
		'B' ->  "-..."
		'C' ->  "-.-."
		'D' ->  "-.."
		'E' -> "."
		'F' -> ".-.."
		'G' -> "--."
		'H' -> "...."
		'I' -> ".."
		'J' -> ".---"
		'K' -> "-.-"
		'L' -> "..-."
		'M' -> "--"
		'N' -> "-."
		'O' -> "---"
		'P' -> ".--."
		'Q' -> "--.-"
		'R' -> ".-."
		'S' -> "..."
		'T' -> "-"
		'U' -> "..-"
		'V' -> "...-"
		'W' -> ".--"
		'X' -> "-..-"
		'Y' -> "-.--"
		'Z' -> "--.."
        else -> ""
    }
}
