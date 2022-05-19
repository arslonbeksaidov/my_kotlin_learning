fun main() {
    val sum = fun(a: Int, b: Int): Int {
        return a + b
    }

    val multi = { a: Int, b: Int -> a * b }

    val originalText = "I don't know... what to say..."
//    val textWithoutDots = originalText.filter({ c: Char -> c != '.' }) // first usage
//    originalText.filter({ c -> c != '.' }) // second usage
//    val textWithoutDots = originalText.filter { c: Char -> c != '.' } // third usage
//    val ans = originalText.filter(){c -> c != '.'} // fourth usage
//    val ans = originalText.filter { c -> c != '.' } // fifth usage
    val ans = originalText.filter { it != '.' }
//    println(ans)

    val textWithoutSmallDigits = originalText.filter {
        val isNotDigit = !it.isDigit()
        val stringRepresentation = it.toString()

        isNotDigit || stringRepresentation.toInt() >= 5
    }
//    println(textWithoutSmallDigits)

//--------------------------------------------------------------------

    fun placeArgument(value: Int, f: (Int, Int) -> Int): (Int) -> Int {
        return { i -> f(value, i) }
    }

    fun sum(a: Int, b: Int): Int = a + b
    val mul2 = { a: Int, b: Int -> a * b }

    val increment = placeArgument(1, ::sum)
    val triple = placeArgument(3, mul2)

//    println(increment(3))
//    println(increment(5))
//    println(triple(5))
//    println(triple(10))

//--------------------------------------------
    val lambda: (Long, Long) -> Long = { a: Long, b: Long ->

        (a..b).reduce { acc, l -> acc * l }

    }
//    println(lambda(1,3))

//-----------------------------------------------

    val max: (Int, Int) -> Int = { a: Int, b: Int ->
        if (a > b) a else b

    }
//    println(max(2,4))

// -----------------------------------------------
//    val kvadradic: (Int) -> Int = { x: Int ->
//        (a⋅x x+b⋅x+c)
//    }

//    --------------------------------------------

//    val notPredicate: (Char) -> Boolean = {
//        x:Char -> !originalPredicate(x)
//    }
//-----------------------------------------------

    fun compose(g: (Int) -> Int, h: (Int) -> Int): (Int) -> Int {
        return { x: Int -> g(h(x)) }
    }
//    ---------------------------------------------

//    fun fizzbuzz(from: Int, to: Int, transformation: (Int) -> String) {
//        for (number in from..to) {
//            println(transformation(number))
//        }
//    }
//    fizzbuzz(1, 100) { number ->
//        if (number % 15 == 0) {
//            ___ "fizzbuzz"
//        }
//        if (number % 3 == 0) {
//            ___ "fizz"
//        }
//        if (number % 5 == 0) {
//            ___ "buzz"
//        }
//        ___ number.toString()
//    }
}
