import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
	val reader = BufferedReader(InputStreamReader(System.`in`))
		    
    println(reader.readLines().count())
}
