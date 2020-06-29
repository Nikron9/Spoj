//https://www.spoj.com/problems/AE00/

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt
import kotlin.math.floor
import kotlin.collections.fold

fun main() {

   val reader = BufferedReader(InputStreamReader(System.`in`))

    print(reader.readLine().toDouble().let { initializer ->
        IntRange(1, floor(sqrt(initializer)).toInt())
            .step(1)
            .toList()
            .run {
               fold(0) { sum, element -> 
                   sum + floor(initializer / element).toInt() - element + 1 
               }
        }
    }.toInt())
}
