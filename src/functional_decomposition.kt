import java.util.StringJoiner
import kotlin.math.pow

fun main() {
//    // ...
//    val password = "76543210"
//    var speakersState: String
//    var lampState: String
//    var doorState: String
//    // ...
//
//    // reading the password
//    println("Enter password: ")
//    val passwordInput = readln()
//
//    // checking if the password is correct
//    if (passwordInput != password) {
//        println("Incorrect password!")
//    } else {
//        // asking the user what they want to do
//        println("Choose the object: 1 – speakers, 2 – lamp, 3 – door")
//        val action = readln()
//
//        when (action) {
//            "1" -> {
//                // asking the user about the speakers
//                when (speakersState) {
//                    "on" -> {
//                        // ...
//                    }
//                    "off" -> {
//                        // ...
//                    }
//                    else -> {
//                        // ...
//                    }
//                }
//            }
//            "2" -> {
//                // asking the user about the lights...
//            }
//            "3" -> {
//                // asking the user about the door...
//            }
//            else -> {
//                // ...
//            }
//        }
//    }




    var speakersState: String
    var lampState: String
    var doorState: String
    fun controlLight() {
        println("bright/dark")
        val tumbler = readln()
        doorState = tumbler
        when (tumbler) {
            "on" -> println("Bright")
            "off" -> println("Dark")
            else -> println("Invalid operation")
        }
    }

    fun controlDoor() {
        println("open/close")
        val tumbler = readln()
        doorState = tumbler
        when (tumbler) {
            "on" -> println("open")
            "off" -> println("close")
            else -> println("Invalid operation")
        }
    }

    fun controlMusic() {
        println("on/off")
        val tumbler = readln()
        speakersState = tumbler
        when (tumbler) {
            "on" -> println("of")
            "off" -> println("off")
            else -> println("Invalid operation")
        }
    }

    fun chooseAction() {
        val action = readln()
        println("Choose the object: 1 – speakers, 2 – lamp, 3 – door")
        when (action) {
            "1" -> controlMusic()
            "2" -> controlLight()
            "3" -> controlDoor()
        }

    }
    fun transform(color: String) = when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> -1
    }

    fun accessSmartHome() {
        val password = "76543210"
        print("Enter password: ")
        val passwordInput = readln()
        if (passwordInput == password)
            chooseAction()
        else
            println("Incorrect password!")
    }
    accessSmartHome()


    // implement your functions here
    fun f1(x: Double): Double = x.pow(2) + 1

    fun f2(x: Double): Double = 1 / x.pow(2)

    fun f3(x: Double): Double = x.pow(2) - 1

    fun f(x: Double): Double = when {
        // call your implemented functions here
        x <= 0 -> f1(x)
        0 < x && x < 1 -> f2(x)
        else -> f3(x)
    }


}