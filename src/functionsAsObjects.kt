fun main() {

    fun sum(a: Int, b: Int): Int = a + b
//    println(sum(2,3))
// binding function references

    val sumObject = ::sum
//    println(sumObject(3,4))

//    We can also specify the type of the sumObject value explicitly:
    val sumObject2: (Int, Int) -> Int = ::sum

//    println(sumObject2(5,6))

//Functions returning other functions

    fun getRealGrade(x: Double) = x
    fun getGradeWithPenalty(x: Double) = x - 1
    fun getScoringFunction(isCheater: Boolean): (Double) -> Double {
        if (isCheater) {
            return ::getGradeWithPenalty
        }
        return ::getRealGrade
    }

    val wantetFunction = getScoringFunction(true)
//    println(wantetFunction(12.0))

//    Function references as function parameters

    fun appylyAndSum(a: Int, b: Int, transformation: (Int) -> Int): Int {
        return transformation(a) + transformation(b)
    }

    fun same(x: Int) = x
    fun square(x: Int) = x * x
    fun triple(x: Int) = 3 * x

//    println(appylyAndSum(1,2,::same))
//    println(appylyAndSum(1,2,::square))
//    println(appylyAndSum(1,2,::triple))

//    Real-world usage

    fun isNotDot(c: Char): Boolean = c != '.'

    val originalText = "I don't know... what to say..."
//    val textWithoutDots = originalText.filter { it!='.' } // first example
    val textWithoutDots2 = originalText.filter(::isNotDot) // second example with fun object reference
//    println(textWithoutDots2)


    fun identity(a: Int): Int {
        return a
    }

    fun half(a: Int): Int {
        return a / 2
    }

    fun zero(a: Int): Int {
        return 0
    }

    fun generate(functionName: String): (Int) -> Int {
        return if (functionName == "identity") {
            ::identity
        } else if (functionName == "half") {
            ::half
        } else {
            ::zero
        }
    }

//    ------------------------------------------------------

    fun square2(value: Int, context: Any, continuation: (Int, Any) -> Unit) {
        return continuation(value * value, context)
    }

    //    ----------------------------------------------
    fun composition(value: Int, y: (Int) -> Int, g: (Int) -> Int): Int {
        return y(g(value))
    }
}