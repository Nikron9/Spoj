//https://www.spoj.com/problems/EGYPIZZA/

import java.io.BufferedReader
import java.io.InputStreamReader
 
fun main() {

        
   val reader = BufferedReader(InputStreamReader(System.`in`))
 
    val result = reader
    	.readLines()
        .drop(1)
        .let {
            val halfs = it.filter { it == "1/2" }.count()
            val quarters = it.filter { it == "1/4" }.count()
            val threeFourths = it.filter { it == "3/4" }.count()
            
            val quartersMinusThreeQuarters = Math.max(0, quarters - threeFourths)
            val halfsUp = when {
                halfs % 2 == 1 -> {
                   ((quartersMinusThreeQuarters - 2) / 4) + 1 + if((quartersMinusThreeQuarters - 2) % 4 > 0) 1 else 0
                }
                halfs % 2 == 0 -> {
                   (quartersMinusThreeQuarters / 4) + if(quartersMinusThreeQuarters % 4 > 0) 1 else 0
                }
                else -> 1
            }
            
            (halfs/2) + threeFourths + halfsUp + 1
        }
        
    print(result)
}
