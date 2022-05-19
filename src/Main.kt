import java.util.*
import kotlin.math.abs

class Main {
}

fun main() {
    val scanner = Scanner(System.`in`)
//    val l2 = scanner.nextLine()
//    val num1 = scanner.next()
//    val num2 = scanner.next()

//    val (a, b) = readLine()!!.split(" ")
    val one: Int = 3434
    val two: Double = 3.34343434
//    val ans: Double = one + two
//    println(ans.toInt())

//    val one: Byte = 1
//    val two: Byte = 2
//    val three = one + two // 3, Int

//    val fourteen: Short = 14
//    val ten: Short = 10
//    val four = fourteen - ten // 4, Int

//    val hundred: Short = 100
//    val five: Byte = 5
//    val zero = hundred % five // 0, Int
//    val e: Byte = (100 + 100).toByte() //5
//    println(e)

    val f: Float = (20.0 + 20.02f).toFloat()
    val f1: Double = (20.0 + 20.02f).toDouble()
    val l: Long = (10 + 2L).toLong()
    val n: Int = (3L + 5).toInt()

    val b1: Byte = 5         // Line 1
    val b2: Byte = 2 + 3     // Line 2

    val seven = 7.0
    val five = 5

    val sum = seven + five                   // line 5
    val difference = seven - five.toDouble() // line 6
    val mul = seven * five                   // line 8

    val uBayt: UByte = 5u
    val uShort: UShort = 10u
    val uInteger: UInt = 100u
    val uDouble: ULong = 100_00uL
    val usmalLong = 110uL
    val smallSize = 100u // UInt by default
    val bigSize = 5_000_000_000u // ULong because the number doesn't fit in UInt
    val n1 = 5 / 2 // 2
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
//    val hour = totalSeconds / 3600
//    val minut = (totalSeconds % 3600) / 60
//    val sec = (totalSeconds % 3600) % 60
//    print(hour)
//    print(":")
//    print(minut)
//    print(":")
//    print(sec)
    /**
    val hour = (totalSeconds % 3600) % 60
    val min = (totalSeconds / 60) % 60
    val sec = (totalSeconds % 60)
    print(hour)
    print(":")
    print(min)
    print(":")
    print(sec)
     */
//    val u1: Int = readLine()!!.toInt()
//    val u2: Int = readLine()!!.toInt()
//    val u3: Int = readLine()!!.toInt()
//    val u1ans:Int
//    val u2ans:Int
//    val u3ans:Int
//   if((u1)  % 2 != 0){
//     u1ans =(u1 + 1) / 2
//   }else{
//        u1ans =u1 / 2
//   }
//    if((u2)  % 2 != 0){
//        u2ans =(u2 + 1) / 2
//    }else{
//         u2ans =u2 / 2
//    }
//
//    if((u3)  % 2 != 0){
//         u3ans =(u3 + 1) / 2
//    }else{
//        u3ans =u3 / 2
//    }
//    println(u1ans + u2ans + u3ans)

//    val group1 = readLine()!!.toInt()
//    val group2 = readLine()!!.toInt()
//    val group3 = readLine()!!.toInt()
//    println(group1 / 2 + group1 % 2 + group2 / 2 + group2 % 2 + group3 / 2 + group3 % 2)

    val one_1: Long = 1
    val one_2: Int = 0
//    val one_3:UInt = 8

//    println(one_1 == one_2) // cannot check the equality
    println(one_1 == one_2.toLong())
//    println(one_1 > one_2 && one_3.toULong() >= 4)


//    val x: Int = readLine()!!.toInt()
//    val y: Int = readLine()!!.toInt()
//    val z: Int = readLine()!!.toInt()

//    println((x > 0 && y <= 0 && z <= 0) || (y > 0 && x <= 0 && z <= 0) || (z > 0 && x <= 0 && y <= 0))

//    println((x <= y && y <= z) || x >= y && y >= z)
//println(x!=y && x!=z && y!=z)

//
//    val cups:Int = readLine()!!.toInt()
//    val is_weekend:Boolean = readLine()!!.toBoolean()
//
//    println((cups in 15..25 && is_weekend) || (!is_weekend && cups in 10..20))


//    val my_string:String = "fdfdfdf "
//    val my_string2:String = "fdfdfdf ".repeat(3)

//    println(my_string.length)
//        println(my_string + my_string2)

//    val text = """
//    {
//    "firstName": "John",
//    "lastName": "Smith",
//    "age": 35,
//    "phoneNumbers": [
//        {
//            "type": "mobile",
//            "number": "123 567-7890"
//        }
//    ]
//}
//    """.trimIndent()
//    println(text)

//val text = "dfdf"
//println("fdfdf $text")

//    val language = "Kotlin"
//    println("this is $language ${language.length}")

//    val text_1:Int = readLine()!!.toInt()
//    val text_2 = readLine()!!.toInt()
//    val ans:String = "$text_1 plus $text_2 equals ${text_1 + text_2}"
//    println(ans)

//    val text = readLine()!!.toString()
//
//    val ans = "${text.length} repetitions of the word $text: ${text.repeat(text.length)}"
//    println(ans)

//    val (a, b, c) = readLine()!!.split(' ')
//    val (d, e, ff) = readLine()!!.split(' ')
//    println("$a:$b:$c $d/$e/$ff")

//    val one1: Int = scanner.nextInt()
//    val two2: Int = scanner.nextInt()
//    val max = if (one1 > two2) {
//        one1
//    } else {
//        two2
//    }
//
//    println(max)


//    val max = if (3 < 6) 3 else 4

//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//
//    println(if (a == b) {
//        "a equal b"
//    } else if (a > b) {
//        "a is greater than b"
//    } else {
//        "a is less than b"
//    })

//    val number = readLine()!!.toInt()
//
//    val ans = if ((number % 4 == 0 && number % 100 !=0) || number % 400 == 0) {
//        "Leap"
//    } else {
//        "Regular"
//    }
//    println(ans)

//    val number: Int = readLine()!!.toInt()
//
//    val ans = if (number < 0) "negative" else if (number == 0) "zero" else "positive"
//    println(ans)


//    val (x1, y1) = readLine()!!.split(" ").map { it.toInt() }
//    val (x2, y2) = readLine()!!.split(" ").map { it.toInt() }
//    if ((abs(x1 - x2) == 1 && abs(y1 - y2) == 2) || (abs(x1 - x2) == 2 && abs(y1 - y2) == 1)) {
//        println("YES")
//    } else {
//        println("NO")
//    }

//    val number = readLine()!!.toInt()
//    if (-15 < number && number <= 12 || number > 14 && number < 17 || number >= 19){
//        println("True")
//    }else{
//        println("False")
//    }

//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    val c = readLine()!!.toInt()
//
//    println(
//        if (a > c && a > b) {
//            a
//        } else if (b > c && b > a) {
//            b
//        } else {
//            c
//        }
//    )

//    val number: Int = readLine()!!.toInt()
//    var summa: Int = 0
//    repeat(number) {
//        val new_number = readLine()!!.toInt()
//        summa += new_number
//    }
//    println(summa)


//    val number_students: Int = readLine()!!.toInt()
//    var A = 0
//    var B = 0
//    var C = 0
//    var D = 0
//    repeat(number_students) {
//        val mark = readLine()!!.toInt()
//        if (mark == 5) A++
//        if (mark == 4) B++
//        if (mark == 3) C++
//        if (mark == 2) D++
//    }
//    println("$D $C $B $A")

//    val num = readLine()!!.toInt()
//    var gradeA = 0
//    var gradeB = 0
//    var gradeC = 0
//    var gradeD = 0
//    val A = 5
//    val B = 4
//    val C = 3
//    val D = 2
//    repeat(num) {
//
//        val increment = readLine()!!.toInt()
//        when (increment) {
//            D -> gradeD++
//            C -> gradeC++
//            B -> gradeB++
//            A -> gradeA++
//        }
//    }
//    println("$gradeD $gradeC $gradeB $gradeA")


//    val number: Int = readLine()!!.toInt()
//    var maxx = 0
//    repeat(number) {
//        val kk = readLine()!!.toInt()
//        if (kk % 4 == 0 && maxx < kk)
//            maxx = kk
//    }
//
//    println(maxx)


//    val number = readLine()!!.toInt()
//
//    var LARGE = 0
//    var SMALLER = 0
//    var PERFECT = 0
//
//    repeat(number) {
//        val input = readLine()!!.toInt()
//        when (input) {
//            1 -> LARGE++
//            -1 -> SMALLER++
//            0 -> PERFECT++
//        }
//    }
//
//    println("$PERFECT $LARGE $SMALLER")

//
//    val number = readLine()!!.toInt()
//    var summa = 0
//    while (summa < number) {
//        summa += 1
//        println(summa)
//    }

//
//    val number = readLine()!!.toInt()
//    var summa = 0
//    do {
//        summa++
//        println(summa)
//    } while (summa < number)

//    var start = true
//    var summa = 0
//    while (start){
//
//        val number = readLine()!!.toInt()
//        if (number == 0){
//            start = false
//        }else{
//            summa +=number
//        }
//    }
//    println(summa)

//    var start = true
//    var maxx = 0
//    while (start) {
//
//        val number = readLine()!!.toInt()
//        if (number != 0) {
//            if (number > maxx && number != 0) {
//                maxx = number
//            }
//        } else {
//            start =false
//        }
//    }
//    println(maxx)


//    var maxx = Int.MIN_VALUE
//    var position = 0
//    var first_position = 0
//    while (scanner.hasNext()){
//       val number = scanner.nextInt()
//        ++position
//        if (number > maxx){
//            maxx = number
//            first_position = position
//        }
//    }
//    println("$maxx $first_position")


//    val number = readLine()!!.toInt()
//    var x = 0
//    var stopper = 0
//    while (x < number) {
//        x++
//        repeat(x) {
//            stopper++
//            if (number >= stopper) {
//                print("$x ")
//            }
//        }
//    }

//        var balance = scanner.nextInt()
//        var summa = 0
//        var qq = ""
//        var next:Int
//        while (scanner.hasNextInt()){
//            next = scanner.nextInt()
//
//            if (next <= balance){
//                balance-=next
//            }else {
//                summa+=next
//            }
//        }
//        if (summa > 0){
//            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $summa.")
//        }else{
//            println("Thank you for choosing us to manage your account! Your balance is $balance.")
//        }

//
//    println("Enter number in decimal system:")
//    val number:Int = scanner.nextInt()
//    println("Enter target base:")
//    val target:Int = scanner.nextInt()
//
//    when(target){
//        target->{
//            println("Conversion result: ${number.toString(target)}")
//        }
//    }

/*
    fun sum(a1: Int, a2: Int): Unit {
        println(a1 + a2)
    }
//    sum(2,3)

    fun multiplication(a1: Int, a2: Int): Int {
        return a1 * a2
    }

    fun sum2(a1: Int, a2: Int): Int = a1 + a2 + multiplication(2, 3)

    fun sayHello(): Unit = println("hello world")

    fun isNegative(a1: Int): Boolean = a1 > 0

    fun theAns() = 42

    println(sum2(3, 4))
    sayHello()
    println(isNegative(3))

    println(theAns())

 */

//    val a = readLine()!!.toLong()
//    val b = readLine()!!.toLong()
//
//    fun divide(a:Long,b:Long):Double {
//        return a.toDouble() / b.toDouble()
//    }
//
//    println(divide(a, b))
//

//    val letter = readLine()!!.first()
//    fun isVowel(alphobet: Char): Boolean {
//        if ("AEIOUaeiou".indexOf(alphobet) != -1) {
//            return true
//        }
//        return false
//    }
//    println(isVowel(letter))

//    val loverCase:Char = 'a'
//    val ch = '\u0040'
//    println(ch)

//    val ch = 'a'
//    println(ch.toInt())

//    val num = 97
//    println(num.toChar())

//    val ch: Char = readLine()!!.first()
//    println(ch)

//    val ch1 = 'b' + 1
//    println(ch1)

//    var ch1 = 'b'
//    println(++ch1) // 'c'

//    println('\r')

//    val ch = readLine()!!.first()
//    val isDigit = ch >= '\u0030' && ch <= '\u0039'
//    println(isDigit)


//    val ch: Char = readLine()!!.first()
//    if (ch.isDigit()){
//        println("Raqam")
//    }else if (ch.isLetter()){
//        println("Harif")
//    }else if (ch.isLetterOrDigit()){
//        println("Raqam yoki Harif")
//    }else if (ch.isUpperCase()){
//        println("Katta harif")
//    }

//    val newCh = ch.uppercaseChar()
//    println(newCh)
//
//    val newCh2 = ch.uppercase()

//    val ch1: Char = readLine()!!.first()
//    val ch2: Char = readLine()!!.first()
//    val ch3: Char = readLine()!!.first()
//    val ch4: Char = readLine()!!.first()
//    println(ch1 in 'A'..'Z' || ch1 in '1'..'9')
//    println(ch2.isDigit())
//    println(ch3.isDigit())
//    println(ch4.isDigit())

//    var ch1: Char = readLine()!!.first()
//    var ch2: Char = readLine()!!.first()
//    var ch3: Char = readLine()!!.first()
//    var ch4: Char = readLine()!!.first()
//    println(--ch1)
//    println(--ch2)
//    println(--ch3)
//    println(--ch4)

//    val num = readLine()!!.toInt()
//    val character:Char = readLine()!!.first()
//    println(num == character.code)

//    val firstL:Char = readLine()!!.first()
//    val secondL:Char = readLine()!!.first()
//    println(firstL.equals(secondL, ignoreCase = true))


//    val within = 1 <= 3 && 3 <=6
//    val within2 = 3 in 1..6
//    println(within)
//    println(within2)

//    val withinExclRight = 3 in 1..6 - 1 // 1 <= 3 && 3 < 6
//    val notWithin = 100 !in 200..300
//    val within = c in 5..10 || c in 20..30 || c in 40..50 // true if c is within at least one range

//    val range = 100..200
//    println(300 in range) // false



        

}
