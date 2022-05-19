fun main() {
//    val (one, opt, three) = readLine()!!.split(" ")
//    val a = one.toInt()
//    val b = one.toInt()
//    val c = 3

//
//    when (opt) {
//        "+","plust" -> println(a + b)
//        "-","minus" -> println(a - b)
//        "*","multi" -> println(a * b)
//        else -> println("Unknown operator")
//    }

//    complex


//    when (opt) {
//        "+","plust" -> {
//            val ans = a + b
//            println(ans)
//        }
//        "-","minus" -> {
//            val ans = a - b
//            println(ans)
//        }
//        "*","multi" -> {
//            val ans = a * b
//            println(ans)
//        }
//        else -> {
//            println("Unknown operator")
//        }
//    }

//    expression

//    val result = when (opt) {
//        "+" -> a + b
//        "-" -> a - b
//        "*" -> a * b
//        else -> "Unknown operator"
//    }
//    println(result)


//    return

//    val result = when (opt) {
//        "+" -> {
//            val sum = a + b
//            sum
//        }
//        "-" -> {
//            val sum = a - b
//            sum
//        }
//        "*" ->  {
//            val sum = a * b
//            sum
//        }
//        else -> "Unknown operator"
//    }
//    println(result)


//    println(when (c) {
//        a + b -> "$c equals $a plus $b"
//        a - b -> "$c equals $a minus $b"
//        a * b -> "$c equals $a times $b"
//        else -> "We do not know how to calculate $c"
//    })


//    range

//    when (c) {
//        0 -> println("n is zero")
//        in 1..10 -> println("n is between 1 and 10 (inclusive)")
//        in 25..30 -> println("n is between 25 and 30 (inclusive)")
//        else -> println("n is outside a range")
//    }

//ranges
//    in a..b, in c..d -> println("n belongs to a range")


//        val n = readLine()!!.toInt()
//
//        when {   // this works as if
//            n == 101 -> println("n is zero")
//            n in 100..200 -> println("n is between 100 and 200")
//            n > 300 -> println("n is greater than 300")
//            n < 0 -> println("n is negative")
//            // else-branch is optional here
//        }

//    -----------------------------------------------------------  1

    val (one, opt, two) = readLine()!!.split(" ")
    val first = one.toLong()
    val second = two.toLong()

        when (opt) {
            "+" -> {
                println(first + second)
            }
            "-" -> {
                println(first - second)
            }
            "*" -> {
                println(first * second)
            }
            "/" -> {
                if (second == 0L){
                    println("Division by 0!")
                }else{
                    println(first / second)
                }
            }
            else ->{
                println("Unknown operator")
            }
    }
// --------------------------------------------------  2

//    val number = readLine()!!.toInt()
//
//
//    when{
//        number < 1 -> println("no army")
//        number in 1..4 -> println("few")
//        number in 5..9 -> println("several")
//        number in 10..19 -> println("pack")
//        number in 20..49 -> println("lots")
//        number in 50..99 -> println("horde")
//        number in 100..249 -> println("throng")
//        number in 250..499 -> println("swarm")
//        number in 500..999 -> println("zounds")
//        number >= 1000 -> println("legion")
//    }


//    --------------------------------------------------- 2
//    val number = readLine()
//
//    when(number){
//        "1"-> println("move up")
//        "2"-> println("move down")
//        "3"-> println("move left")
//        "4"-> println("move righ")
//        "0"-> println("do not move")
//        else -> println("error!")
//    }
    //    --------------------------------------------------- 2
//    val word = readLine()
//
//    when(word){
//        "gryffindor"-> println("bravery")
//        "hufflepuff"-> println("loyalty")
//        "slytherin"-> println("cunning")
//        "ravenclaw"-> println("intellect")
//        else -> println("not a valid house")
//    }

//    -------------------------------------------------------  3

//    when (readLine()!!.toString()) {
//        "one" -> print(1)
//        "two" -> print(2)
//        "three" -> print(3)
//        "four" -> print(4)
//        "five" -> print(5)
//        "six" -> print(6)
//        "seven" -> print(7)
//        "eight" -> print(8)
//        "nine" -> print(9)
//    }

}