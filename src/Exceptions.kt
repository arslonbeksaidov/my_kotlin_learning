import java.io.IOException

fun main() {
//    try {
//        // write your code here, do not touch the lines above
//        val word = "sdsd"
//        println(word[111])
//        // do not touch the lines below
//    } catch(e: RuntimeException) {
//        println("Well")
//    } catch (e: Exception) {
//        println("Wrong")
//    }

//    fun calculateSpentMoney(total: Int, itemPrice: Int): Int {
//        if (total < 0) {
//            throw Exception("Total can't be negative")
//        }
//        if (itemPrice < 0) {
//            throw Exception("Item price can't be negative")
//        }
//        if (itemPrice == 0) {
//            return 0
//        }
//        val amountToBuy = total / itemPrice
//        return amountToBuy * itemPrice
//    }
//
//    println(calculateSpentMoney(-7,0))


//    val index = readLine()!!.toInt()
//    val word = readLine()!!
//    if (word.lastIndex >= index && index >= 0){
//        println(word[index])
//    }else{
//        println("There isn't such an element in the given string, please fix the index!")
//    }


//    try {
//        println("Inside the try block before an exception") // it will be printed
//        println(2 / 0) // it throws ArithmeticException
//        println("Inside the try block after the exception") // it won't be printed
//    } catch (e: ArithmeticException) {
//        println("Division by zero!") // it will be printed
//    }
//    println("After the try-catch block") // it will be printed

//
//    try {
//        val d = (2 / 0).toDouble()
//    }
//    catch (e: Exception) {
//        println(e.message)
//    }

//    try {
//        // code that throws exceptions
//    }
//    catch (e: IOException) {
//        // handling the IOException and its subtypes
//    }
//    catch (e: Exception) {
//        // handling the Exception and its subtypes
//    }


//    fun intDivision(x: String, y: String): Int {
//        try {
//           return x.toInt()/y.toInt()
//        }catch (e:ArithmeticException){
//            println("Exception: division by zero!")
//        }catch (e:NumberFormatException){
//            println("Read values are not integers.")
//        }
//        return 0
//    }
//
//    val x = readLine()!!
//    val y = readLine()!!
//    println(intDivision(x, y))


//    try {
//        problemFunction()
//    } catch (e: Exception) {
//        println(e.message)
//    }
//}
//
//fun problemFunction():Int {
//    var x = 2/0
//    return x
//}

//    fun convertStringToDouble(input: String): Double {
//       try {
//           return input.toDouble()
//       }catch (e:NumberFormatException){
//
//       }
//        return 0.0
//    }
//
//    fun convertStringToDoubleV2(input: String): Double {
//        return try {
//            input.toDouble()
//        } catch (e: NumberFormatException) {
//            0.0
//        }
//    }

//    fun printFifthCharacter(input: String): String {
//
//        return try {
//            "The fifth character of the entered word is ${input[4]}"
//        }catch (e:StringIndexOutOfBoundsException){
//             "The input word is too short!"
//        }
//    }

//    try {
//        println("Inside the try block")
//        println(2 / 0) // throws ArithmeticException
//    }
//    catch (e: Exception) {
//        println("Inside the catch block")
//    }
//    finally {
//        println("Inside the finally block")
//    }
//
//    println("After the try-catch-finally block")


//    val number: Int = try { "abc".toInt() } catch (e: NumberFormatException) { 0 }
//    println(number) // 0

//    val number: Int = try {
//        "2a".toInt()
//    } catch (e: NumberFormatException) {
//        0
//    } finally {
//        println("Inside the finally block")
//    }
//    println(number)


//    fun test() {
//        val result = try {
//            val x = 2/0
//        } catch (e: ArithmeticException) {
//            throw IllegalStateException(e) // do not forget to deal with it
//        }
//
//        println(result)
//    }
//
//    try {
//        test()
//    } catch (e: IllegalStateException) {
//       println(e.message)
//    }

//    val string = "abc"
//    val number = try {
//        string.toInt()
//    } catch (e: NumberFormatException) {
//        -1
//    }


//    fun pepTalk(name: String): String {
//        val array = name.split(" ").toTypedArray()
//        return try {
//            val firstName = array[0]
//            val secondName = array[1]
//            "Don't lose the towel, traveler $firstName $secondName!"
//        } catch (e: ArrayIndexOutOfBoundsException) {
//          "Don't lose the towel, nameless one."
//        }
//    }
//
//    val name = readLine()!!
//    println("Good luck!")
//    println(pepTalk(name))


//    val answer: Int = try {
//        readLine()!!.toInt()
//    } catch (e: NumberFormatException) {
//        42
//    } finally {
//        println("The answer is a number")
//    }
//    println(answer)


    fun suspiciousFunction(param: Int) {
        when (param) {
            0 -> throw Exception("Some exceptions?")
            1 -> throw ArithmeticException("Division by zero")
            2 -> throw Exception("An exception occurred here")
            3 -> throw IOException()
        }
    }

    fun handleException(data: Int) {

        try {
            suspiciousFunction(data)
        } catch (e: IOException) {
            println("The IOException occurred")
        } catch (e: ArithmeticException) {
            println(e.message)
        } catch (e: Exception) {
            println(e.message)
        } finally {
            println("Handling completed successfully!")
        }
    }


}

