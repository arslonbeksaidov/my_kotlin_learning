package converter

import java.math.BigInteger
import java.util.*

fun main() {


    while (true) {
        println("Enter two numbers in format: {source base} {target base} (To quit type /exit) >")
        var commond = readLine()!!.toString()
        if (commond == "/exit"){
            break
        }
        var sourceB_targetB = commond.split(" ").map { it.toInt() }.toMutableList()
        var source_base = sourceB_targetB[0]
        var target_base = sourceB_targetB[1]
        while (true){
            println("Enter number in base $source_base to convert to base $target_base (To go back type /back) ")
            var scanner = Scanner(System.`in`)
            var num_or_back = scanner.next()
            if (num_or_back == "/back"){
                println()
                break
            }
            if (target_base == 10){
                print("Conversion result: ${BigInteger(num_or_back, 36).toString()} \n\n")
            }else{
                var toDecimal:BigInteger = num_or_back.toBigInteger(10)
                var ans = toDecimal.toString(target_base)
                print("Conversion result: $ans \n\n")
            }
        }
    }
}