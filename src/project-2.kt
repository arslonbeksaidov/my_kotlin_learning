import java.math.BigDecimal
import java.math.BigInteger
fun main() {
//    val num1 = readLine()!!.toBigInteger()
//    val num2 = readLine()!!.toBigInteger()
//    println(num1.max(num2))

    val num1 = readLine()!!.toBigDecimal()
    val num2 = readLine()!!.toBigDecimal()
    val summ =num1 + num2
    val hundred = "100".toBigDecimal()
    println("${(num1 * hundred) / summ}% ${(num2 * hundred) / summ}%")

//    val a = readLine()!!.toBigInteger()
//    val b = readLine()!!.toBigInteger()
//    val q = a / b
//    val r = a % b
//    println("$a = $b * $q + $r")



    
}