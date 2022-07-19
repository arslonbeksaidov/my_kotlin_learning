import java.util.StringJoiner

fun isOdd(x: Int) = x % 2 != 0
fun isEven(x: Int) = x % 2 == 0

fun printNumbers(numbers: MutableList<Int>, filter: (Int) -> Boolean) {
    for (number in numbers) {
        if (filter(number))
            print("$number")
    }
}

class Person(val name: String, val lastName: String) {
    fun printFullName(): String {
        return ("full name : $name $lastName")
    }

    fun printWithArgs(age: Int, phoneNum: Int): String {
        return "My age ${age} and my phone number ${phoneNum}"
    }
}

//1. Reference to a function
//----------------------------------------------------------- using standard way
//fun multiply(x: Int, y: Int) = x * y
//
//fun add(x: Int, y: Int) = x + y
//val operatorMultiply: (Int, Int) -> Int = ::multiply
//val operatorAdd: (Int, Int) -> Int = ::add

//-----------------------------------------------------------  using lambda
//val operatorMultiply: (Int, Int) -> Int = {x: Int, y: Int -> x * y}
//val operatorAdd: (Int, Int) -> Int = {x: Int, y: Int -> x + y}

//------------------------------------------------------------

fun main() {

    //2. Reference by Object
//-----------------------------------------------------------
    val whatsGoingOnText: String = "What's going on here?"
    val indexWithinWhatsGoingOnText: (String, Int, Boolean) -> Int = whatsGoingOnText::indexOf
//    println(indexWithinWhatsGoingOnText.invoke("going", 3, true))

//    ----------------------------------------------------------
//    val indexWithinWhatsGoingOnText: (String, Int, Boolean) -> Int =
//        { string: String, startIndex: Int, ignoreCase: Boolean ->
//            whatsGoingOnText.indexOf(string, startIndex, ignoreCase)
//        }
//    ----------------------------------------------------------------

//    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val oddFunction = ::isOdd
//    print("Odd numbers: ")
//    printNumbers(numbers, oddFunction)
//    print("\nEven numbers: ")
//    printNumbers(numbers, ::isEven)
//    ------------------------------------------------------------
//    val Person = Person(name = "Arslonbek", "Saidov")
//    val personFun: () -> String = Person::printFullName
//    println(personFun.invoke()) // you can invoke withot calling invoke

//    val numberAndAgeFun: (age: Int, number: Int) -> String = Person::printWithArgs
//    println(numberAndAgeFun.invoke(5,6))
//-----------------------------------------------------------------
//    val dec: (Int) -> Int = Int::dec
//    print(dec(4)) // 3
//-----------------------------------------------------------
//    val dec: (Int) -> Int = { x -> x.dec() } // using lambda way
    //-----------------------------------------------------------
class Person (val name: String){
}
//    val personGenerator: (String) -> Person = ::Person
//    val johnFoster: Person = personGenerator("John Foster")
//    println(johnFoster.name)
//------------------------------------------------------------
//    val personGenerator: (String) -> Person = {string -> Person(string)} // using lambda
//    val arslon:Person = personGenerator("arslon")
//    println(arslon.name)
}