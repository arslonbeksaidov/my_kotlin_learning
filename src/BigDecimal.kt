import java.math.BigDecimal
import java.math.RoundingMode
//val firstBigDecimal = BigDecimal("121212.121")
//val secondBigDecimal = BigDecimal(readLine())
//val thirdBigDecimal = BigDecimal(121212.2121)
//val fourth = 1000.5.toBigDecimal()

//val zero = BigDecimal.ZERO
//val one = BigDecimal.ONE
//val ten = BigDecimal.TEN

//BigDecimal is immutable in both var and val

fun main(){
//    println(0.1 + 0.2) // 0.3000000000000004
//    val num1 = BigDecimal("0.1")
//    val num2 = BigDecimal("0.2")
//    println(num2 + num1)

//    var num1 = BigDecimal("0.3")
//    val decriment = --num1
//    println(decriment)
//    println(num1)

//    val fractionalNumber= 1234.5678.toBigDecimal()
//    println(fractionalNumber.scale()) // 4

//    var bigDecimal = BigDecimal("1000.456")
//    println(bigDecimal.setScale(1,RoundingMode.CEILING))
//    println(bigDecimal.setScale(5,RoundingMode.UNNECESSARY))
//
//    var bigDecimal2 = "9999999955.9998787846".toBigDecimal()
//    bigDecimal2 = bigDecimal2.setScale(3,RoundingMode.HALF_UP)
//    println(bigDecimal2)
//    bigDecimal2 = bigDecimal2.setScale(3,RoundingMode.HALF_DOWN)
//    println(bigDecimal2)


//    val dividend = BigDecimal("0.9865745")
//    val divisor = BigDecimal("3.543")
//
//    var quotient = dividend / divisor    // 0.2784574
//    println(quotient)
//    quotient = dividend.setScale(4, RoundingMode.CEILING)/ divisor   // 0.2785
//    println(quotient)


//    val intDividend = BigDecimal("10")
//    val divisor = BigDecimal("3")
//
//    var quotient = intDividend / divisor    // 3
//    println(quotient)
//    quotient = intDividend.setScale(4, RoundingMode.CEILING)/ divisor   // 3.3333
//    println(quotient    )


//    val pow = readLine()!!.toInt()
//    val mod = readLine()!!.toInt()
//    val num = BigDecimal(readLine())
//    println(num.setScale(mod,RoundingMode.FLOOR).pow(pow))


//    val num1 = readLine()!!.toString().toBigDecimal()
//    val scale = readLine()!!.toInt()
//    println(num1.setScale(scale,RoundingMode.HALF_DOWN))


//    val num1 = readLine()!!.toString().toBigDecimal()
//    val num2 = readLine()!!.toString().toBigDecimal()
//    val num3 = readLine()!!.toString().toBigDecimal()
//
//    println(num1 + num2 + num3)

    val num1 = readLine()!!.toString().toBigDecimal()
    val num2 = readLine()!!.toString().toBigDecimal()

    println(num1 * num2)

}
